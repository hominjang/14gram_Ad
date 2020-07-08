package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EventAdapter extends BaseAdapter {

    LayoutInflater inflater = null;
    ArrayList<EventData> sample = null;
    private int nListCnt = 0;

    public EventAdapter(ArrayList<EventData> data) {
        sample = data;
        nListCnt = sample.size();
    }

    @Override
    public int getCount() {
        return nListCnt;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public EventData getItem(int position) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null)
        {
            final Context context = parent.getContext();
            if (inflater == null)
            {
                inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            }
            convertView = inflater.inflate(R.layout.event_listview_item, parent, false);
        }

        TextView ProductName = (TextView)convertView.findViewById(R.id.product);
        TextView price1 = (TextView)convertView.findViewById(R.id.price1);
        TextView price2 = (TextView)convertView.findViewById(R.id.price2);

        ProductName.setText(sample.get(position).getEventProduct());
        price1.setText(sample.get(position).getPrice1());
        price2.setText(sample.get(position).getPrice2());

        return convertView;
    }
}


