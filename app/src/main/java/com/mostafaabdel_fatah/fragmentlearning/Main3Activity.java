package com.mostafaabdel_fatah.fragmentlearning;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main3Activity extends AppCompatActivity implements ColorFragment.OnColorChangeListener {

    ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        /***********************************************************************************/
        FragmentManager fragmentManager =  getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ColorFragment colorFragment = new ColorFragment();
        fragmentTransaction.add(R.id.color_fragment,colorFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void colorChanged(int color) {
        constraintLayout.setBackgroundColor(color);
    }
}