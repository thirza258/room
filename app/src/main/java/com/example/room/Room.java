package com.example.room;

public class Room {
    private int imageView;
    private String name;
    private String pricing;
    private String desc;

    public Room(int imageView, String name, String pricing, String desc) {
        this.imageView = imageView;
        this.name = name;
        this.pricing = pricing;
        this.desc = desc;
    }

    public Room(String name, String pricing, String desc) {
        this.name = name;
        this.pricing = pricing;
        this.desc = desc;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPricing() {
        return pricing;
    }

    public void setPricing(String pricing) {
        this.pricing = pricing;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String toString() {
        return "Room{" +
                "Name='" + name + '\'' +
                ", email='" + pricing + '\'' +
                ", imageUrl='" + imageView + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }


}
