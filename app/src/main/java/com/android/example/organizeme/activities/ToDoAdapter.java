package com.android.example.organizeme.activities;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.android.example.organizeme.R;
import com.android.example.organizeme.data.ListToDo;

import java.util.ArrayList;


public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder> {

    private Context context;
    private ArrayList<ListToDo> listToDos;

    @NonNull
    @Override
    public ToDoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_add_new_do, viewGroup, false);

        return new ToDoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ToDoViewHolder toDoViewHolder, int i) {
        ListToDo currentList = listToDos.get(i);

        String content = currentList.getContent();

        toDoViewHolder.textView.setText(content);
    }

    @Override
    public int getItemCount() {
        return listToDos.size();
    }



    public class ToDoViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        TextView timeTextView;

        public ToDoViewHolder(@NonNull View itemView) {
            super(itemView);

            timeTextView = itemView.findViewById(R.id.timeTextView);
            textView = itemView.findViewById(R.id.readyTextView);
        }
    }
}
