package com.moringa.amonafrique.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moringa.amonafrique.R;
import com.moringa.amonafrique.adapters.DashboardAdapter;
import com.moringa.amonafrique.objects.Product;

import java.util.ArrayList;
import java.util.List;

import butterknife.*;


public class DashboardFragment extends Fragment {
    @BindView(R.id.product_dashboard)RecyclerView mRecyclerView;
    List<Product> products;
    private DashboardAdapter mAdapter;



    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        ButterKnife.bind(this,view);
        products = new ArrayList<>();
        products.add(new Product("Hp Proliant G7","Hewlett Packard"));
        products.add(new Product("Hp Proliant G6","Hewlett Packard"));
        products.add(new Product("Hp Proliant G10","Hewlett Packard"));
        products.add(new Product("Hp Proliant G5","Hewlett Packard"));
        products.add(new Product("Hp Proliant G8","Hewlett Packard"));
        products.add(new Product("Dell R905","Dell"));
        mAdapter = new DashboardAdapter(products);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        return view;
    }
}