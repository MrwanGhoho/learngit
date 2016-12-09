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
 * Created by asus on 2016/12/8.
 */

public class Sfragment extends Fragment {
    private RecyclerView NewsView2;
    private List<News> newses2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.s_fragment,container,false);
        newses2=new ArrayList<News>();
        News[] news2={new News("1","SecondArticle1"),new News("2","SecondArticle2"),new News("3","SecondArticle3")
                ,new News("4","SecondArticle4"),new News("4","SecondArticle4")
                ,new News("5","SecondArticle5"),new News("","SecondArticle5")
        };
        for (News b:news2){
            newses2.add(b);
        }
        NewsAdapter madapter2=new NewsAdapter(this.getActivity(),R.layout.news,newses2);
        NewsView2 = (RecyclerView) view.findViewById(R.id.recycle_2);
        NewsView2.setAdapter(madapter2);
        NewsView2.setLayoutManager(new LinearLayoutManager(getActivity()));

        newses2=new ArrayList<News>();

        return view;
    }
}
