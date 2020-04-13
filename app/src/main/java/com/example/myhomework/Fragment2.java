package com.example.myhomework;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment  {


    Button btn_clear1,btn_clear3,btn_clearAll,btn_add;

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment2, container, false);


        btn_clear1=view.findViewById(R.id.btn_clear1);
        btn_clear3=view.findViewById(R.id.btn_clear3);
        btn_clearAll=view.findViewById(R.id.btn_clearAll);
        btn_add=view.findViewById(R.id.btn_add);


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setValue();
            }
        });

        btn_clear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).clear1();
            }
        });


        btn_clear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).clear3();
            }
        });

        btn_clearAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).clearAll();

            }
        });



        return view;
    }



}
