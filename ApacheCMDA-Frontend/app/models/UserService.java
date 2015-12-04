package models;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import util.APICall;
import util.Constants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiyushi1 on 11/7/15.
 */
public class UserService {
    private static final String POST_USER_INFO = Constants.NEW_BACKEND+"users/add";
    private static final String POST_USER_VALID = Constants.NEW_BACKEND+"users/isUserValid";
    private static final String POST_FRIEND_FRIEND = Constants.NEW_BACKEND+"";
    public static boolean login;

    public static String register(User user){

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode queryJson = mapper.createObjectNode();
        queryJson.put("userName", user.getUserName());
        queryJson.put("id", user.getId());
        queryJson.put("password", user.getPassword());
        queryJson.put("firstName", user.getFirstName());
        queryJson.put("lastName", user.getLastName());
        queryJson.put("email", user.getEmail());

        JsonNode userServiceNode = APICall
                .postAPI(POST_USER_INFO,queryJson);

//        System.out.println("wo fa de " + queryJson);
//
          System.out.println("shou dao register: " + userServiceNode);
//        System.out.println(" url: " + POST_USER_INFO);
//        System.out.println("test test : "+userServiceNode.path("_children").path("result").path("_value"));

//        if (userServiceNode == null){
//            System.out.println("null");
//        }
//        if (userServiceNode.has("error")){
//            System.out.println("error o ");
//        }
//        if (!userServiceNode.isArray()){
//            System.out.println("array o ");
//        }


        if (userServiceNode == null || userServiceNode.has("error")) {
            return "error";
        }

        JsonNode json = userServiceNode.path("_children").path("result"); //only one string message is returned!

        System.out.println(" json child: " + json);
        String result = json.path("_value").asText();

        return result;
    }

    public static String login(User user){

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode queryJson = mapper.createObjectNode();
        queryJson.put("password", user.getPassword());
        queryJson.put("email", user.getEmail());

        JsonNode userServiceNode = APICall
                .postAPI(POST_USER_VALID,queryJson);

        System.out.println("shou dao login" + userServiceNode);

        if (userServiceNode == null || userServiceNode.has("error")) {
            return "error";
        }

        JsonNode json = userServiceNode.path("_children").path("result"); //only one string message is returned!

        //System.out.println(" json child: " + json);
        String result = json.path("_value").asText();

        return result;
    }

    public static List<String> getFriends(String email){
        List<String> friendList = new ArrayList<String>();

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode queryJson = mapper.createObjectNode();
        queryJson.put("email",email );

        JsonNode userServiceNode = APICall
                .postAPI(POST_FRIEND_FRIEND,queryJson);

        System.out.println("shou dao getFriends" + userServiceNode);

        if (userServiceNode == null || userServiceNode.has("error")) {
            return null;
        }

        for (int i = 0; i < userServiceNode.size(); i++) {
            JsonNode json = userServiceNode.path(i);
            friendList.add(json.path("friend").asText());
        }

        return friendList;
    }

    public static boolean getLogin(){
        return login;
    }
    public static void setLogin(boolean flag){
        login = flag;
    }
}
