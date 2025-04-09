package com.kecoodapp.miaplicacion2.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kecoodapp.miaplicacion2.R;

import java.util.List;

public class BasicAdapter  extends RecyclerView.Adapter<BasicAdapter.BasicViewHolder> {

    private final List<Color> data;



    public BasicAdapter(List<Color> data){
        this.data=data;
    }

    @NonNull
    @Override
    public BasicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        boolean attachToRoot;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_basic, parent, false);
        return new BasicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BasicViewHolder holder, int position) {
        TextView tvText = holder.itemView.findViewById(R.id.tvText);
        TextView tvText1 = holder.itemView.findViewById(R.id.tvText1);

        String name =data.get(position).getName();
        int tel= data.get(position).getTel();
        tvText.setText(name);
        tvText1.setText(Integer.toString(tel));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public  class BasicViewHolder extends RecyclerView.ViewHolder{
        public BasicViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
