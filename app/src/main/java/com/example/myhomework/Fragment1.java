package com.example.myhomework;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Fragment1 extends Fragment {

    EditText et_firstName, et_secondName, et_familyName;
    Button btn_asc, btn_dsc, btn_captalize;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment1, container, false);

        et_firstName = view.findViewById(R.id.et_firstName);
        et_secondName = view.findViewById(R.id.et_secondName);
        et_familyName = view.findViewById(R.id.et_familyName);

        btn_asc = view.findViewById(R.id.btn_asc);
        btn_dsc = view.findViewById(R.id.btn_dsc);
        btn_captalize = view.findViewById(R.id.brn_captalize);

        btn_captalize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (et_familyName.getText().toString().length()!=0&&et_secondName.getText().toString().length()!=0&&et_firstName.getText().toString().length()!=0) {
                    String family = et_familyName.getText().toString();
                    String firstname = et_firstName.getText().toString();
                    String secondName = et_secondName.getText().toString();

                    et_familyName.setText(family.toUpperCase());
                    et_firstName.setText(firstname.toUpperCase());
                    et_secondName.setText(secondName.toUpperCase());
                }else {
                    Toast.makeText(getContext(), "field is empty", Toast.LENGTH_SHORT).show();
                }
            }

        });

        btn_asc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_familyName.getText().toString().length()!=0&&et_secondName.getText().toString().length()!=0&&et_firstName.getText().toString().length()!=0) {

                    String s = et_firstName.getText().toString() + " " + et_secondName.getText().toString() + " " + et_familyName.getText().toString();
                List<String> arr = Arrays.asList(s.split(" "));

                Collections.sort(arr, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.compareToIgnoreCase(o2);
                    }
                });

                et_firstName.setText(arr.get(0));
                et_secondName.setText(arr.get(1));
                et_familyName.setText(arr.get(2));

            }else {
                    Toast.makeText(getContext(), "field is empty", Toast.LENGTH_SHORT).show();
                }}
        });

        btn_dsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_familyName.getText().toString().length()!=0&&et_secondName.getText().toString().length()!=0&&et_firstName.getText().toString().length()!=0) {

                    String s = et_firstName.getText().toString() + " " + et_secondName.getText().toString() + " " + et_familyName.getText().toString();
                    ;
                    List<String> arr = Arrays.asList(s.split(" "));

                    Collections.sort(arr, new Comparator<String>() {
                        @Override
                        public int compare(String o1, String o2) {
                            return o1.compareToIgnoreCase(o2);
                        }
                    });

                    et_firstName.setText(arr.get(2));
                    et_secondName.setText(arr.get(1));
                    et_familyName.setText(arr.get(0));
                }else {
                    Toast.makeText(getContext(), "field is empty", Toast.LENGTH_SHORT).show();
                }

            }
        });
        return view;
    }


    public String getValue() {
        return et_firstName.getText().toString() + " " + et_secondName.getText().toString() + " " + et_familyName.getText().toString();
    }

    public void clear1() {
        et_firstName.getText().clear();
    }

    public void clear3() {
        et_familyName.getText().clear();
    }

    public void clearAll() {
        et_familyName.getText().clear();
        et_firstName.getText().clear();
        et_secondName.getText().clear();

    }

}
