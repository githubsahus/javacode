package com.sahus.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
public class JobPosts {
    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

    public JobPosts(int postId, String postDesc, String postProfile, Integer reqExperience, List<String> postTechStack) {
        this.postId = postId;
        this.postDesc = postDesc;
        this.postProfile = postProfile;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }
}
