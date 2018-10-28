package com.yarolegovich.slidingrootnav.sample.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.yarolegovich.slidingrootnav.sample.R;


/**
 * Created by yarolegovich on 25.03.2017.
 */

public class FragmentOne extends Fragment {


    public static FragmentOne createFor() {
        FragmentOne fragment = new FragmentOne();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Button btn = view.findViewById(R.id.btn_y);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Toast.makeText(v.getContext(), "Hi this is working fine", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
