package com.example.natali.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.natali.remindme.R;

public class BirthdaysFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_example;
    private  String title;

    public static BirthdaysFragment getInstance(Context context){
        Bundle args = new Bundle();
        BirthdaysFragment fragment = new BirthdaysFragment();
        //args.putInt("Напоминания",1);
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_birthdays));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }



    public void setContext(Context context) {
        this.context = context;
    }


}
