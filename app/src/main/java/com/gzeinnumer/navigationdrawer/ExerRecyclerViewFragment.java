package com.gzeinnumer.navigationdrawer;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class ExerRecyclerViewFragment extends Fragment {

    RecyclerView recyclerView;
    View view;
    String word[] = {
            "I", "Am", "Zein"
    };
    int img[] = {
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher
    };
    public ExerRecyclerViewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.exer_fragment_recyclerview, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        Adapter adapter = new Adapter(view.getContext(),word,img);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        return view;
    }


    public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>{
        Context context;
        String[] mWord;
        int[] mImg;

        public Adapter(Context context, String[] mWord, int[] mImg) {
            this.context = context;
            this.mWord = mWord;
            this.mImg =mImg;
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.exer_fragment_recyclerview_item,viewGroup,false);
            MyViewHolder myViewHolder = new MyViewHolder(view);
            return myViewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
            myViewHolder.textView.setText(mWord[i]);
            myViewHolder.imageView.setImageResource(mImg[i]);
            myViewHolder.relativeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),"Index "+i+" Ditekan",Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public int getItemCount() {
            return mWord.length;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder{

            RelativeLayout relativeLayout;
            TextView textView;
            ImageView imageView;
            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                relativeLayout = itemView.findViewById(R.id.parent);
                textView = itemView.findViewById(R.id.textViewRecycler);
                imageView = itemView.findViewById(R.id.imageViewRecycler);
            }
        }
    }

}
