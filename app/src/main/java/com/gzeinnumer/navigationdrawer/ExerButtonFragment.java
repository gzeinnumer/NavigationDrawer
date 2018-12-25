package com.gzeinnumer.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ExerButtonFragment extends Fragment{

    Button button;
    View view;
    public ExerButtonFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.exer_fragment_button,container,false);

        button = view.findViewById(R.id.btnFragment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Button ditekan!",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
