package com.example.asus.homework;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2016/12/7.
 */

public class Ffragment extends Fragment {
    private RecyclerView NewsView1;
    private List<News> newses1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.f_fragmengt,container,false);
        newses1=new ArrayList<News>();
        News[] news1={
                new News("1","FirstArticle1"),new News("2","FirstArticle2"),new News("3","FirstArticle3"),new News("4","FirstArticle4")
                ,new News("5","FirstArticle5"),new News("6","FirstArticle6"),new News("7","FirstArticle7")
        };
        for (News a:news1){
            newses1.add(a);
        }

        NewsAdapter madapter1=new NewsAdapter(this.getActivity(),R.layout.news,newses1);
        NewsView1 = (RecyclerView)view.findViewById(R.id.recycle_1);
        NewsView1.setAdapter(madapter1);
        NewsView1.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        newses1=new ArrayList<News>();


        return view;
    }

}

