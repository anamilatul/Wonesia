package me.anamila.wonesia.Model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Review implements Serializable {
    @SerializedName("id")
    int id;
    @SerializedName("name")
    private String name;
    @SerializedName("descReview")
    private String descReview;
    @SerializedName("qualityService")
    private String qualityService;

    public Review() {
    }

    public Review(int id, String name, String descReview, String qualityService) {
        this.id = id;
        this.name = name;
        this.descReview = descReview;
        this.qualityService = qualityService;
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

    public String getDescReview() {
        return descReview;
    }

    public void setDescReview(String descReview) {
        this.descReview = descReview;
    }

    public String getQualityService() {
        return qualityService;
    }

    public void setQualityService(String qualityService) {
        this.qualityService = qualityService;
    }
}