package com.bharat.memegen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity; //Talk To main Activity
import android.widget.Button;
import android.widget.EditText;

public class TopFragment extends Fragment{

    private static EditText topText;

    private static EditText bottomText;

    TopSectionListener activityCommander;

    public interface TopSectionListener{
         public void createMeme(String top, String bottom);

    }

    public void onAttach(Activity activity){
        super.onAttach(activity);
        try{
            activityCommander = (TopSectionListener) activity;
        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section,container,false);

        topText = (EditText)view.findViewById(R.id.top_section);
        bottomText = (EditText)view.findViewById(R.id.below_section);
        final Button button = (Button)view.findViewById(R.id.button);

        button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        buttonClicked(v);

                    }
                }
        );

        return view;
    }


    public void buttonClicked(View view){

        activityCommander.createMeme(topText.getText().toString(), bottomText.getText().toString());

    }

}
