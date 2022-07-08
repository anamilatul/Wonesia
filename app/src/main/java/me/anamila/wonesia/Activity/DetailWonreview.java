package me.anamila.wonesia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import me.anamila.wonesia.API.ApiClient;
import me.anamila.wonesia.API.ReviewInterface;
import me.anamila.wonesia.Model.Review;
import me.anamila.wonesia.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailWonreview extends AppCompatActivity {
    TextView name, tvHistory, tvService;
    Review wonreview;
    ReviewInterface reviewInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wonreview);

        name = findViewById(R.id.name);
        tvHistory = findViewById(R.id.tvHistory);
        tvService = findViewById(R.id.tvService);

        Intent it = getIntent();
        wonreview = (Review) it.getSerializableExtra("triv_current");
        name.setText(wonreview.getName());
        tvHistory.setText(wonreview.getDescReview());
        tvService.setText(wonreview.getQualityService());
    }

    public void close(View view) {
        finish();
    }

    public void delete(View view) {
        reviewInterface = ApiClient.getClient().create(ReviewInterface.class);
        Call<Review> delReview = reviewInterface.delReview(wonreview.getId());
        delReview.enqueue(new Callback<Review>() {
            @Override
            public void onResponse(Call<Review> call, Response<Review> response) {
                Log.d("del_wonreview :", response.toString());
            }

            @Override
            public void onFailure(Call<Review> call, Throwable t) {
                Log.e("error_wonreview : ",t.getMessage());

            }
        });
    }
}