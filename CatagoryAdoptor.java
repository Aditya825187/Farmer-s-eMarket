package com.example.farmersmarket;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatagoryAdoptor extends RecyclerView.Adapter<CatagoryAdoptor.ViewHolder> {
    private List<CatagoryModel> CatagoryModelList;

    public CatagoryAdoptor(List<CatagoryModel> catagoryModelList) {
        CatagoryModelList = catagoryModelList;
    }






    @NonNull
    @Override
    public CatagoryAdoptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.catagory_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatagoryAdoptor.ViewHolder holder, int position) {
        String icon=CatagoryModelList.get(position).getCatagoryIconLink();
        String name=CatagoryModelList.get(position).getCatagoryName();
        holder.setCatagoryName(name);
    }

    @Override
    public int getItemCount() {
        return CatagoryModelList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView CatagoryIcon;
        private TextView CatagoryName;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            CatagoryIcon=itemView.findViewById(R.id.catagory_icon);
            CatagoryName=itemView.findViewById((R.id.catagory_name));
        }
        private void setCatagoryIcon(){

        }
        private void setCatagoryName(String name){
            CatagoryName.setText(name);
        }
    }
}
