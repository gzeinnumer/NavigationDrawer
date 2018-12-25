package com.gzeinnumer.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


public class ExerEditTextFragment extends Fragment {

    EditText editText;
    View view;
    public ExerEditTextFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.exer_fragment_edittext, container, false);
        editText = view.findViewById(R.id.editText);
        return view;
    }

}
