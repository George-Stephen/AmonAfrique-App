package com.moringa.amonafrique.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.moringa.amonafrique.R;
import com.moringa.amonafrique.adapters.ProductAdapter;
import com.moringa.amonafrique.objects.Product;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class SearchFragment extends Fragment {
    @BindView(R.id.search) SearchView mSearchView;
    @BindView(R.id.search_view) RecyclerView recyclerView;
    private List<Product>productList;
    private ProductAdapter adapter;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
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
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }
}