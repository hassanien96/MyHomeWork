package com.example.myhomework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends FragmentActivity {
    Button btn_addAll, btn_deleteAll, btn_attach, btn_detach;

    Fragment1 fragment1;
    Fragment3 fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_addAll = findViewById(R.id.btn_addAll);
        btn_deleteAll = findViewById(R.id.btn_deleteAll);
        btn_attach = findViewById(R.id.btn_attach);
        btn_detach = findViewById(R.id.btn_detach);

         fragment1 = new Fragment1();
        final Fragment2 fragment2 = new Fragment2();
         fragment3 = new Fragment3();

        final FragmentManager manager = getSupportFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();


        btn_addAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    FragmentTransaction fta = manager.beginTransaction();
                    FragmentTransaction ftb = manager.beginTransaction();
                    FragmentTransaction ftc = manager.beginTransaction();
                    fta.add(R.id.My_Container_1_ID, fragment1, "Frag_Top_tag");
                    ftb.add(R.id.My_Container_2_ID, fragment2, "Frag_Middle_tag");
                    ftc.add(R.id.My_Container_3_ID, fragment3, "Frag_Bottom_tag");
                    fta.commit();
                    ftb.commit();
                    ftc.commit();
                }


        });
        btn_deleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getSupportFragmentManager().beginTransaction().remove(getSupportFragmentManager().findFragmentById(R.id.My_Container_1_ID)).commit();
                getSupportFragmentManager().beginTransaction().remove(getSupportFragmentManager().findFragmentById(R.id.My_Container_2_ID)).commit();
                getSupportFragmentManager().beginTransaction().remove(getSupportFragmentManager().findFragmentById(R.id.My_Container_3_ID)).commit();

            }
        });





    }





    public String setValue() {

        if (fragment3!=null){
            fragment3.setValue(fragment1.getValue());
        }else {
            Toast.makeText(this, "Ftagment3 is null", Toast.LENGTH_SHORT).show();
        }
        return null;

    }
    public void clear1(){
        if (fragment1!=null){
            fragment1.clear1();
        }
    }
    public void clear3(){
        if (fragment1!=null){
            fragment1.clear3();
        }
    }


    public void clearAll(){
        if (fragment1!=null){
            fragment1.clearAll();
        }
    }

}
