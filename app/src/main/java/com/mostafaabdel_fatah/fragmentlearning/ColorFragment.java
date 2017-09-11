package com.mostafaabdel_fatah.fragmentlearning;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/**
 * Created by Mostafa AbdEl_Fatah on 9/3/2017.
 */

public class ColorFragment extends Fragment {

    RadioGroup radioGroup;
    OnColorChangeListener onColorChangeListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.color_fragmet ,container,false);
        radioGroup = (RadioGroup) view.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.RedRadioButton:
                        onColorChangeListener.colorChanged(Color.RED);
                        break;
                    case R.id.GreenRadioButton:
                        onColorChangeListener.colorChanged(Color.GREEN);
                        break;
                    case R.id.BlueRadioButton:
                        onColorChangeListener.colorChanged(Color.BLUE);
                        break;
                    case R.id.BlackRadioButton:
                        onColorChangeListener.colorChanged(Color.BLACK);
                        break;
                    default:
                        onColorChangeListener.colorChanged(Color.WHITE);
                }
            }
        });
        return  view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        onColorChangeListener = (OnColorChangeListener) activity;
    }

    public interface OnColorChangeListener {
        public void colorChanged(int color);
    }
}
