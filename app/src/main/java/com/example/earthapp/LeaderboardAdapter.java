package com.example.earthapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;


class LeaderboardAdapter extends BaseAdapter
{
    Context context;
    ArrayList<User> users;

    public LeaderboardAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.scoreboard_single_row, parent, false);
        }

        TextView nameTextView = convertView.findViewById(R.id.nameTextView);
        TextView pointsTextView = convertView.findViewById(R.id.pointsTextView);

        final User s = (User) this.getItem(position);

        nameTextView.setText(s.getName());
        pointsTextView.setText(new Integer(s.getPoint()).toString());

        return convertView;
    }
}
