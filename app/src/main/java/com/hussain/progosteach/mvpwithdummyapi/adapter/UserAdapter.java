package com.hussain.progosteach.mvpwithdummyapi.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hussain.progosteach.mvpwithdummyapi.model.ModelClass;
import com.hussain.progosteach.mvpwithdummyapi.R;

import java.util.ArrayList;

/**
 * Created by Hussain Sherwani
 * on 08-Jun-17
 * email: hussain.ahmed@progos.org .
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private static String TAG = UserAdapter.class.getName();
    private ArrayList<ModelClass> mArrayList;
    private int rowLayout;
//    private Context context;

    public UserAdapter(ArrayList<ModelClass> mArrayList1){
        mArrayList = mArrayList1;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        try {
        holder.userId.setText(Integer.toString(mArrayList.get(position).getUserId()));
        holder.id.setText(Integer.toString(mArrayList.get(position).getId()));
        holder.title.setText(mArrayList.get(position).getTitle());
        holder.body.setText(mArrayList.get(position).getBody());
        }catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView userId, id, title, body;
        public ViewHolder(View itemView) {
            super(itemView);
            userId = (TextView)itemView.findViewById(R.id.userId);
            id = (TextView)itemView.findViewById(R.id.id);
            title = (TextView)itemView.findViewById(R.id.title);
            body = (TextView)itemView.findViewById(R.id.body);
        }
    }
}

