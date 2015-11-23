package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long postId;

    private String comment;
    private Date postTime;
    private String user;
    private String climateService;

    private double grade;

    public Post(){
    }

    public Post(long postId, String comment, Date postTime, String user, double grade, String climateService){
        super();
        this.postId = postId;
        this.comment = comment;
        this.postTime = postTime;
        this.user = user;
        this.grade = grade;
        this.climateService = climateService;
    }

    public long getPostId(){
        return id;
    }

    public String getComment(){
        return comment;
    }

    public Date getDate(){
        return postTime;
    }

    public String getUser(){
        return user;
    }

    public double getGrade(){
        return grade;
    }

    public String getClimateService(){
        return climateService;
    }

    public void setPostId(long postId){
        this.postId = postId;
    }

    public void setComment(){
        this.comment = comment;
    }

    public void setDate(Date postTime){
        this.postTime = postTime;
    }

    public void setUser(String user){
        this.user = user;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }

    public void setClimateService(String climateService){
        this.climateService = climateService;
    }

    @Override
    public String toString(){
        return "ClimateService [id=" + id + ", postId=" + postId
                + ", user=" + user + ", comment=" + comment + ", grade=" + grade
                +", postTime=" + postTime +", climateService="+climateService+"]";
    }

}
