package com.jms.ght.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;

    private String faceImage;

    private String nickname;

    private String username;

    private String password;

    public User(String faceImage, String nickname, String username, String password) {
        this.faceImage = faceImage;
        this.nickname = nickname;
        this.username = username;
        this.password = password;
    }

    public User(String nickname, String username, String password) {
        this.nickname = nickname;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
}
