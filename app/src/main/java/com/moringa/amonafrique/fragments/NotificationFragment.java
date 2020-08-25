package com.moringa.amonafrique.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moringa.amonafrique.R;
import com.moringa.amonafrique.adapters.ProductAdapter;
import com.moringa.amonafrique.objects.Product;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class NotificationFragment extends Fragment {

    @BindView(R.id.notification_view) RecyclerView recyclerView;
    private ProductAdapter adapter;
    private List<Product> productList;

    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notification, container, false);
        ButterKnife.bind(this,view);
        productList = new ArrayList<>();
        productList.add(new Product("Hp Proliant G7","Hewlett Packard"));
        productList.add(new Product("Hp Proliant G8","Hewlett Packard"));
        productList.add(new Product("Hp Proliant G10","Hewlett Packard"));
        productList.add(new Product("Hp Proliant G5","Hewlett Packard"));
        productList.add(new Product("Hp Proliant G6","Hewlett Packard"));
        productList.add(new Product("Dell R905","Dell"));

        adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}