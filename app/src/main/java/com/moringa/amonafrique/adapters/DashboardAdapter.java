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

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.DashboardViewHolder>  {

    private List<Product> productList;

    public DashboardAdapter(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public DashboardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View productView = inflater.inflate(R.layout.product_grid_item,parent,false);
        DashboardViewHolder viewHolder = new DashboardViewHolder(productView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DashboardViewHolder holder, int position) {
        Product product = productList.get(position);
        holder.bindProducts(product);


    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class DashboardViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.product_name) TextView mProductName;
        @BindView(R.id.product_make) TextView mProductMake;

        public DashboardViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
        void bindProducts(Product product){
               mProductName.setText(product.getName());
               mProductMake.setText(product.getMake());
        }
    }
}
