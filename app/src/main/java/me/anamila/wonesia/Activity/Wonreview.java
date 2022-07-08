package me.anamila.wonesia.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

import me.anamila.wonesia.API.ReviewInterface;
import me.anamila.wonesia.Adapter.AdapterWonreview;
import me.anamila.wonesia.R;
import me.anamila.wonesia.API.ApiClient;
import me.anamila.wonesia.Model.Review;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Wonreview extends AppCompatActivity {

    ReviewInterface reviewInterface;
    RecyclerView recWonreview;
    AdapterWonreview adapterTriv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wonreview);
        initFab();
        recWonreview = findViewById(R.id.recTriv);
        recWonreview.setLayoutManager(new LinearLayoutManager(this));

        reviewInterface = ApiClient.getClient().create(ReviewInterface.class);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getAllReview();
    }

    private void getAllReview() {
        Call<List<Review>>getReview = reviewInterface.getReview();
        getReview.enqueue(new Callback<List<Review>>() {
            @Override
            public void onResponse(Call<List<Review>> call, Response<List<Review>> response) {
                ArrayList<Review>listReview = (ArrayList<Review>)response.body();
                Log.d("listReview",response.raw().body().toString());
                Log.d("listReview",listReview.toString());

                adapterTriv = new AdapterWonreview(listReview);
                recWonreview.setAdapter(adapterTriv);

            }

            @Override
            public void onFailure(Call<List<Review>> call, Throwable t) {
                Log.e("error Review", t.getMessage());
            }
        });
    }

    private void initFab() {
        FloatingActionButton fabAdd = findViewById(R.id.fabAdd);
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), FormWonreview.class));

            }
        });
    }
}