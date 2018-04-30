package com.example.shipra.recycler_view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.support.v7.widget.RecyclerView.*;

public class recyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {



    String[] SubjectValues;
    Context context;
    View view1;
    RecyclerView.ViewHolder viewHolder1;
    TextView textView;
    private ViewHolder holder;
    private int position;

    public recyclerViewAdapter(Context context1, String[] SubjectValues1){

        SubjectValues = SubjectValues1;
        context = context1;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;

        public ViewHolder(View v){

            super(v);

            textView = (TextView)v.findViewById(R.id.subject_textview);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        view1 = LayoutInflater.from(context).inflate(R.layout.recyclerview_items,parent,false);

        viewHolder1 = new ViewHolder(view1);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        this.holder = holder;
        this.position = position;

        holder.textView.setText(SubjectValues[position]);
    }
    @Override
    public int getItemCount(){

        return SubjectValues.length;
    }
}


