package me.anamila.wonesia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import me.anamila.wonesia.API.ApiClient;
import me.anamila.wonesia.API.ReviewInterface;
import me.anamila.wonesia.Model.Review;
import me.anamila.wonesia.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FormWonreview extends AppCompatActivity {
    EditText edtName, edtDescTriv, edtService;
    ReviewInterface reviewInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_wonreview);

        edtName = findViewById(R.id.edtname);
        edtDescTriv = findViewById(R.id.edthistoryWisata);
        edtService = findViewById(R.id.edtServ);
        reviewInterface = ApiClient.getClient().create(ReviewInterface.class);
    }

    public void saveTriv(View v) {
        String name = edtName.getText().toString();
        String descReview = edtDescTriv.getText().toString();
        String qualityService = edtService.getText().toString();
        Call<Review> postReview = reviewInterface.postReview(name,descReview,qualityService);
        postReview.enqueue(new Callback<Review>() {
            @Override
            public void onResponse(Call<Review> call, Response<Review> response) {
                Log.d("post_wonreview : ",response.toString());
            }

            @Override
            public void onFailure(Call<Review> call, Throwable t) {
                Log.d("Error_wonreview",t.getMessage());
            }
        });
    }
}