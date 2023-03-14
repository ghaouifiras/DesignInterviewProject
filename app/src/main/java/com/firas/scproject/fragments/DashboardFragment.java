package com.firas.scproject.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.firas.scproject.Adapter.DashboardAdapter;
import com.firas.scproject.R;
import com.firas.scproject.model.AlertModel;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {
    private RecyclerView rcv;
    private DashboardAdapter dashboardAdapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rcv = view.findViewById(R.id.rec);
        AlertModel a0 = new AlertModel("Toxic Comment", "Mama always said life was like a box of chocolates.\n You never know what…", "12.34 PM");
        AlertModel a1 = new AlertModel("Toxic Comment", "Mama always said life was like a box of chocolates.\n You never know what…", "12.34 PM");
        AlertModel a2 = new AlertModel("hello", "hellooooooooo", "hello");
        AlertModel a3 = new AlertModel("hello", "hellooooooooo", "hello");


        List<AlertModel> list = new ArrayList<>();
        list.add(a0);
        list.add(a1);
        list.add(a2);
        list.add(a3);

        initRecyclerView(rcv, list);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dashboard_fragment, container, false);

    }

    private void initRecyclerView(RecyclerView recyclerView, List<AlertModel> list) {

        dashboardAdapter = new DashboardAdapter(list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(dashboardAdapter);
    }
}
