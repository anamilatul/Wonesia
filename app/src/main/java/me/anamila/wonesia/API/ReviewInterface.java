package me.anamila.wonesia.API;

import java.util.List;

import me.anamila.wonesia.Model.Review;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ReviewInterface {
   @GET("dataWonesia/")
    Call<List<Review>>getReview();

   @FormUrlEncoded
   @POST("dataWonesia/")
    Call<Review>postReview(@Field("name")String name, @Field("descReview")String descReview,@Field("qualityService")String qualityService);

   @DELETE("dataWonesia/")
    Call<Review>delReview(@Query("id")int id);
}
