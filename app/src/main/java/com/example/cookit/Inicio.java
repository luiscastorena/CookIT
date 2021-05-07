package com.example.cookit;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;



public class Inicio extends Fragment {


    public Inicio() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_inicio, container, false);
        GridView gridView = (GridView) view.findViewById(R.id.grid_view);
        gridView.setAdapter(new GaleriaImagenes(getContext()));
        // Inflate the layout for this fragment
        return view;
    }
}