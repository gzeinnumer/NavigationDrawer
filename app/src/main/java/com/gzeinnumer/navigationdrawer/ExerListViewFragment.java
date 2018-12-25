package com.gzeinnumer.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class ExerListViewFragment extends Fragment {

    ListView listView;
    View view;
    String word[] = {
      "I", "Am", "Zein"
    };
    public ExerListViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.exer_fragment_listview, container, false);
        listView = view.findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(view.getContext(), android.R.layout.simple_list_item_1,word);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(view.getContext(),"Indek "+position+" Ditekan",Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }

}
