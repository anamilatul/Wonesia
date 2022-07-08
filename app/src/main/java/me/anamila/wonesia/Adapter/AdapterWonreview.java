package me.anamila.wonesia.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import me.anamila.wonesia.Model.Review;
import me.anamila.wonesia.Activity.DetailWonreview;
import me.anamila.wonesia.R;

public class AdapterWonreview extends RecyclerView.Adapter<AdapterWonreview.ViewHolder>{

    ArrayList<Review> listReview;
    Context context;

    public AdapterWonreview(ArrayList<Review>listReview){
        this.listReview = listReview;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_wonreview,parent,false));
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterWonreview.ViewHolder holder, int position) {
        Review wonreview = listReview.get(position);
        holder.name.setText(wonreview.getName());
        holder.txtReview.setText(wonreview.getDescReview());
        holder.txtService.setText(wonreview.getQualityService());
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context = holder.constraintLayout.getContext();
                Intent intent = new Intent(context, DetailWonreview.class);
                intent.putExtra("triv_current",wonreview);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listReview.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name, txtReview, txtService;
        ConstraintLayout constraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            txtReview = itemView.findViewById(R.id.tvHistory);
            txtService = itemView.findViewById(R.id.tvService);
            constraintLayout = itemView.findViewById(R.id.constraintLayout);
        }
    }
}
