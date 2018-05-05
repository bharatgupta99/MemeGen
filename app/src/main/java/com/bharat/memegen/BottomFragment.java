package com.bharat.memegen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomFragment extends Fragment{

    private static TextView topText1;
    private static TextView topText2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.below_section,container,false);
        topText1 = (TextView) view.findViewById(R.id.textView3);
        topText2 = (TextView) view.findViewById(R.id.textView4);

        return view;
    }

    public void setMemeText(String top, String bottom){
        topText1.setText(top);
        topText2.setText(bottom);
    }

}
