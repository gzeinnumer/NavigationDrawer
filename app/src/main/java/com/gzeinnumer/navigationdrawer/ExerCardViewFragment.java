package com.gzeinnumer.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class ExerCardViewFragment extends Fragment {

    CardView cardView;
    View view;
    public ExerCardViewFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.exer_fragment_cardview,container, false);
        cardView = view.findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Ditekan!!",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
