package com.example.rv_homwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private  List<RvData> list=new ArrayList<>();
    private List<View> list2=new ArrayList<>();
    private  RvAdapter rvAdapter=new RvAdapter(list);
    private VpAdapter vpAdapter=new VpAdapter(list2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list2.add(LayoutInflater.from(this).inflate(R.layout.layout_rv,null,false));
        list2.add(LayoutInflater.from(this).inflate(R.layout.item_rv_2,null,false));
        list2.add(LayoutInflater.from(this).inflate(R.layout.item_rv_3,null,false));
        ((ViewPager)findViewById(R.id.Vp_home)).setAdapter(vpAdapter);
        ((RecyclerView)(list2.get(0).findViewById(R.id.rv))).setAdapter(rvAdapter);
        ((RecyclerView)(list2.get(0).findViewById(R.id.rv))).setLayoutManager(new LinearLayoutManager(this));
        list.add(new RvData("项目1"));
        list.add(new RvData("项目2"));
        list.add(new RvData("项目3"));
        list.add(new RvData("项目4"));
        list.add(new RvData("项目5"));
        list.add(new RvData("项目6"));
        list.add(new RvData("项目7"));
        list.add(new RvData("项目8"));
        list.add(new RvData("项目9"));
        list.add(new RvData("项目10"));
        list.add(new RvData("项目11"));
        list.add(new RvData("项目12"));
        list.add(new RvData("项目13"));
        list.add(new RvData("项目14"));
        list.add(new RvData("项目15"));
        list.add(new RvData("项目16"));
        list.add(new RvData("项目17"));
        list.add(new RvData("项目18"));
        list.add(new RvData("项目19"));
        list.add(new RvData("项目20"));
        rvAdapter.notifyDataSetChanged();
    }
}