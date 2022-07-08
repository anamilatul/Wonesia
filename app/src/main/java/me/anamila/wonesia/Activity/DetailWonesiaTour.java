package me.anamila.wonesia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import me.anamila.wonesia.R;

public class DetailWonesiaTour extends AppCompatActivity {

    ImageView gambarWisata;
    TextView txtNamaWisata, txtDeskripsiWisata, txtLokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wonesia_tour);

        gambarWisata = findViewById(R.id.gambarWisata);
        txtNamaWisata = findViewById(R.id.txtTempatWisata);
        txtDeskripsiWisata = findViewById(R.id.txtDeskripsiWisata);
        txtLokasi = findViewById(R.id.txtLokasi);

        rules();
    }
    private void rules() {
        String fotoWisata = getIntent().getStringExtra("gambar");
        String namaWisata = getIntent().getStringExtra("nama");
        String deskripsiWisata = getIntent().getStringExtra("deskripsi");
        String lokasiWisata = getIntent().getStringExtra("lokasi");

        Glide.with(this).asBitmap().load(fotoWisata).into(gambarWisata);
        txtNamaWisata.setText(namaWisata);
        txtDeskripsiWisata.setText(deskripsiWisata);
        txtLokasi.setText(lokasiWisata);
    }
}