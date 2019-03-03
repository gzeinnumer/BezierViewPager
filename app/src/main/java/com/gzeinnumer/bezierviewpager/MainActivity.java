package com.gzeinnumer.bezierviewpager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import qdx.bezierviewpager_compile.BezierRoundView;
import qdx.bezierviewpager_compile.vPage.BezierViewPager;
import qdx.bezierviewpager_compile.vPage.CardPagerAdapter;

public class MainActivity extends AppCompatActivity {

    List<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data.add("https://www.dictio.id/uploads/db3342/original/3X/7/f/7f7ac383e87e4686ca614d297e8d7ec911452702.jpg");
        data.add("https://asset.kompas.com/data/photo/2016/10/14/1348038Kumbuka780x390.jpg");
        data.add("http://cdn2.tstatic.net/travel/foto/bank/images/monyet-tertawa_20180204_153554.jpg");

        CardPagerAdapter cardAdapter = new CardPagerAdapter(this);
        cardAdapter.addImgUrlList(data);

        BezierViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(cardAdapter);

        BezierRoundView roundView = findViewById(R.id.round_view);
        roundView.attach2ViewPage(viewPager);
    }
}
