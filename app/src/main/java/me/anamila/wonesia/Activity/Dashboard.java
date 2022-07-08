package me.anamila.wonesia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toolbar;
import android.widget.ViewFlipper;

import com.google.android.material.snackbar.Snackbar;

import me.anamila.wonesia.R;

public class Dashboard extends AppCompatActivity {
    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        int images[] = {R.drawable.lawang_sewu, R.drawable.brown_canyon};

        viewFlipper = findViewById(R.id.viewFlipper);

        for (int image : images) {
            flipperImage(image);
        }
    }

    public void flipperImage(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(4000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    public void more(View view){
        Intent it = new Intent(this, WonesiaTour.class);
        startActivity(it);
    }

    public void history(View view){
        Intent it = new Intent(this, Wonreview.class);
        startActivity(it);
    }

    public void logout(View view) {
        Intent it = new Intent(this, Login.class);
        startActivity(it);
    }

    public void wondev(View view) {
        Intent it = new Intent(this, Wondev.class);
        startActivity(it);
    }

    public void where(View view) {
        Intent it = new Intent(Intent.ACTION_VIEW);
        String url = "https://www.google.com/maps/place/Kota+Semarang,+Jawa+Tengah/@-7.0247246,110.3470235,12z/data=!3m1!4b1!4m5!3m4!1s0x2e708b4d3f0d024d:0x1e0432b9da5cb9f2!8m2!3d-7.0051453!4d110.4381254";
        it.setData(Uri.parse(url));
        startActivity(it);

    }

    public void lawang(View view) {
        Intent it = new Intent(this, lawangSewu.class);
        startActivity(it);
    }

    public void sam(View view) {
        Intent it = new Intent(this, samKong.class);
        startActivity(it);
    }

    public void monas(View view) {
        Intent it = new Intent(this, monas.class);
        startActivity(it);
    }
}