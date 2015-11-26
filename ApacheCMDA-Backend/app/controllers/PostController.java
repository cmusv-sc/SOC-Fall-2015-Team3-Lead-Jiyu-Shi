package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.gson.Gson;
import models.*;
import play.mvc.*;
import util.Common;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import javax.persistence.PersistenceException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Named
@Singleton
public class PostController extends Controller{
    private final PostRepository postRepository;
    private final ClimateServiceRepository climateServiceRepository;
    private final UserRepository userRepository;

    @Inject
    public PostController(PostRepository postRepository
        ,ClimateServiceRepository climateServiceRepository
        ,UserRepository userRepository){

        this.postRepository = postRepository;
        this.climateServiceRepository = climateServiceRepository;
        this.userRepository = userRepository;

    }

    public Result getAllPosts(String format) {
        Iterable<Post> posts = postRepository
                .findAll();
        if (posts == null) {
            System.out.println("No Posts found");
        }

        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(posts);
        }

        return ok(result);
    }

    public Result createPost(){
        JsonNode json = request().body().asJson();
        if (json == null) {
            System.out
                    .println("Post not saved, expecting Json data");
            return badRequest("Post not saved, expecting Json data");
        }

        // Parse JSON file
//        long postId = json.findPath("postId").asLong();
        String comment = json.findPath("comment").asText();
        String userEmail = json.findPath("userEmail").asText();
        long climateId = json.findPath("climateId").asLong();
        double grade = json.findPath("grade").asDouble();

        Date createTime = new Date();
        SimpleDateFormat format = new SimpleDateFormat(Common.DATE_PATTERN);
        try {
            createTime = format.parse(json.findPath("createTime").asText());
        } catch (ParseException e) {
            System.out
                    .println("No creation date specified, set to current time");
        }

        try {
            User user = userRepository.findByEmail(userEmail);
            ClimateService climateService = climateServiceRepository
                    .findOne(climateId);
            int postNum = climateService.getPostNum();
            double oldGrade = climateService.getGrade();

            // Update the postNum and grade
            climateService.setPostNum(postNum+1);
            climateService.setGrade( (oldGrade+grade)/(postNum+1) );

            Post post = new Post( comment,  createTime,  user.getUserName(), grade, climateService.getName());
            postRepository.save(post);

            return created(new Gson().toJson(post));

        } catch (PersistenceException pe) {
            pe.printStackTrace();
            System.out.println("Post not saved comment: " + comment);
            return badRequest("Post not saved comment: " + comment);
        }
    }

    public Result getAllAtClimateServices(String name, String format) {
        Iterable<Post> posts = postRepository
                .findAllByAtClimateService(name);
        if (posts == null) {
            System.out.println("No Posts found");
        }

        String result = new String();
        if (format.equals("json")) {
            result = new Gson().toJson(posts);
        }

        return ok(result);
    }
}
