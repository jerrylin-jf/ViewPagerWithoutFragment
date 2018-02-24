package com.example.jerry.myapplication;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jerry on 2018/2/23.
 */

public class ViewPagerAdapter extends PagerAdapter {

    private Context mContext;
    private List<String> mListData;

    public ViewPagerAdapter(Context context, List<String> listDate) {
        mContext = context;
        mListData = listDate;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return mListData.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.view_item1, container, false);

        final TextView textView = view.findViewById(R.id.textView);

        Button button = view.findViewById(R.id.button);
        button.setText(mListData.get(position));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(mListData.get(position));
            }
        });

        container.addView(view);
        return view;
    }
}
