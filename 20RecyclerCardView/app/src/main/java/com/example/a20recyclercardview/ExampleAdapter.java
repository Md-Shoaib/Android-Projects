package com.example.a20recyclercardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {

    //6.2
    private ArrayList<ExampleItem> mExampleList;

    //1 Create a class
    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        //4 Declaring variables
        public ImageView imageView;
        public TextView textView;

        //2 Create a constructor
        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);

            //5 Finding ui elements
            imageView = itemView.findViewById(R.id.imageView);
            textView = itemView.findViewById(R.id.textView);
        }
    }

    //6.1
    //Creating a custom constructor
    public ExampleAdapter(ArrayList<ExampleItem> exampleList) {
        mExampleList = exampleList;
    }

    //3 Generate this methods by using bulb
    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //6 Using and assign our main contents
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        ExampleViewHolder exampleViewHolder = new ExampleViewHolder(view);
        return exampleViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        //7
        ExampleItem currentItem = mExampleList.get(position);
        //Setup property
        holder.imageView.setImageResource(currentItem.getmImageResource());
        holder.textView.setText(currentItem.getmText());

    }

    @Override
    public int getItemCount() {

        //passing the size of out all total list
        return mExampleList.size();
    }


}
