package com.example.bo.listviewtest.model;

/**
 * Created by bo on 2017/11/3.
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
