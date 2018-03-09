package com.example.prosb.liveat500px.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.prosb.liveat500px.R;

import org.w3c.dom.Text;

/**
 * Created by proSb on 3/9/2018.
 */

public class MainFragment extends Fragment {
    int someVar;
    TextView tvHello;

    public static MainFragment newInstance(int someVar) {
        MainFragment fragment = new MainFragment();

        Bundle bundle = new Bundle();
        bundle.putInt("someVar", someVar);

        fragment.setArguments(bundle);

        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        someVar = getArguments().getInt("someVar");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        init(view);

        return view;
    }

    private void init(View view) {
        tvHello = view.findViewById(R.id.tvHello);
    }

    public void setHelloText(String text) {
        tvHello.setText(text);
    }
}