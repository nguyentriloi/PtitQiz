package com.loiclude.PtitQuiz.service.user;

import com.loiclude.PtitQuiz.service.user.beans.UserRequest;

public class UserResponse extends UserRequest {
    private int id;
    private String name;
    private int point;


    public UserResponse(int id,String ma, String name, int point) {
        this.id = id;
        this.name = name;
        this.point = point;
        this.setMa(ma);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
