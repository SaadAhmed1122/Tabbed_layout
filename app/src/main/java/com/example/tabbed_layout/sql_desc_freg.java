package com.example.tabbed_layout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class sql_desc_freg extends Fragment {
    int no;

    public sql_desc_freg(int no) {
        this.no = no;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.sql_desc,container,false);
        TextView title,content;
        View v2;
        LinearLayout ln;
        v2= (View) v.findViewById(R.id.view_sql);
        ln= (LinearLayout) v.findViewById(R.id.main_lay_sql);
        title= (TextView) v.findViewById(R.id.sql_title);
        content= (TextView) v.findViewById(R.id.content_sql);
        if(no==1){
            title.setText("Introduction to SQL");
            content.setText(R.string.sql_intor);
        }
        if (no == 2) {
        ln.setVisibility(View.INVISIBLE);
        v2.setVisibility(View.VISIBLE);
        title.setText("Create Database");

        }


        return v;
    }
}
