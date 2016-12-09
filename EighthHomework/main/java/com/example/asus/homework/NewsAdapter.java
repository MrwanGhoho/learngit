package com.example.asus.homework;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by asus on 2016/12/8.
 */

public class NewsAdapter extends RecyclerView.Adapter<MviewHolder> {
    private int resid;
    private Context context;
    private List<News> newsList;

    public NewsAdapter(Context context, int Resource, List<News> list) {
        this.context = context;
        this.newsList = list;
        this.resid = Resource;
    }

    @Override
    public MviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(resid, parent, false);
        MviewHolder mviewHolder = new MviewHolder(view);
        return mviewHolder;
    }

    @Override
    public void onBindViewHolder(MviewHolder holder, int position) {
        holder.profile.setText(newsList.get(position).getProfile());
        holder.title.setText(newsList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }
}

class MviewHolder extends RecyclerView.ViewHolder {
    TextView title;
    TextView profile;

    public MviewHolder(View view) {
        super(view);
        title = (TextView) view.findViewById(R.id.title);
        profile = (TextView) view.findViewById(R.id.profile);

    }
}