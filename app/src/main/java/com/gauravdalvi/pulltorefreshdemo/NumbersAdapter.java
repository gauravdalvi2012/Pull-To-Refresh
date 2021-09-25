package com.gauravdalvi.pulltorefreshdemo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NumbersAdapter extends RecyclerView.Adapter<NumbersAdapter.holder> {

    ArrayList<Integer> numbers;

    public NumbersAdapter(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        holder.textView.setText(numbers.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return numbers.size();
    }


    class holder extends RecyclerView.ViewHolder {
        TextView textView;

        public holder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.number);
        }
    }
}
