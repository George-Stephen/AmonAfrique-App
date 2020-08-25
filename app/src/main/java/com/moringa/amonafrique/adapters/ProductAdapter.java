package com.moringa.amonafrique.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringa.amonafrique.R;
import com.moringa.amonafrique.objects.Product;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.productViewHolder>  {

    private List<Product>products;

    public ProductAdapter(List<Product> products) {
        this.products = products;
    }

    @Override
    public productViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.product_linear_item,parent,false);
        productViewHolder viewHolder = new productViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull productViewHolder holder, int position) {
        Product product = products.get(position);
        holder.bindProduct(product);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    class productViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.search_name) TextView mSearchName;
        @BindView(R.id.search_make) TextView mSearchMake;
        public productViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
        void bindProduct(Product product){
            mSearchName.setText(product.getName());
            mSearchMake.setText(product.getMake());
        }
    }
}
