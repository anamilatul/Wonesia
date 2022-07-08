package me.anamila.wonesia.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import me.anamila.wonesia.Activity.DetailWonesiaTour;
import me.anamila.wonesia.R;

public class AdapterWonesiaTour extends RecyclerView.Adapter<AdapterWonesiaTour.ViewHolder>{
    private ArrayList<String> fotoWisata = new ArrayList<>();
    private ArrayList<String> namaWisata = new ArrayList<>();
    private ArrayList<String> deskripsiWisata = new ArrayList<>();
    private ArrayList<String> lokasiWisata = new ArrayList<>();
    private Context context;

    public AdapterWonesiaTour(ArrayList<String> fotoWisata, ArrayList<String> namaWisata, ArrayList<String> deskripsiWisata, ArrayList<String> lokasiWisata, Context context) {
        this.fotoWisata = fotoWisata;
        this.namaWisata = namaWisata;
        this.deskripsiWisata = deskripsiWisata;
        this.lokasiWisata = lokasiWisata;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_wisata,parent,false));
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(fotoWisata.get(position)).into(holder.gambarWisata);
        holder.txtNamaWisata.setText(namaWisata.get(position));
        holder.txtLokasi.setText(lokasiWisata.get(position));

        holder.constraintLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailWonesiaTour.class);
                intent.putExtra("gambar",fotoWisata.get(position));
                intent.putExtra("nama",namaWisata.get(position));
                intent.putExtra("deskripsi",deskripsiWisata.get(position));
                intent.putExtra("lokasi",lokasiWisata.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return namaWisata.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView gambarWisata;
        TextView txtNamaWisata, txtLokasi;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            gambarWisata = itemView.findViewById(R.id.gambarWisata);
            txtNamaWisata = itemView.findViewById(R.id.txtTempatWisata);
            txtLokasi = itemView.findViewById(R.id.txtLokasi);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
