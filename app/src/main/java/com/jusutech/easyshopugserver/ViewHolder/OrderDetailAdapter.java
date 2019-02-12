package com.jusutech.easyshopugserver.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jusutech.easyshopugserver.Model.Order;
import com.jusutech.easyshopugserver.R;

import java.util.List;

/**
 * Created by Jafix Technologies on 2/12/2019.
 */
class MyViewHolder extends RecyclerView.ViewHolder{

    public TextView name, quantity, price, discount;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        name = (TextView)itemView.findViewById(R.id.product_name);
        quantity = (TextView)itemView.findViewById(R.id.product_quantity);
        price = (TextView)itemView.findViewById(R.id.product_price);
        discount = (TextView)itemView.findViewById(R.id.product_discount);
    }
}
public class OrderDetailAdapter extends RecyclerView.Adapter<MyViewHolder> {
    List<Order> myOrders;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order_detail_layout,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Order order = myOrders.get(position);
        holder.name.setText(String.format("Name: %s", order.getOrderName()));
        holder.quantity.setText(String.format("Quantity: %s", order.getQuantity()));
        holder.price.setText(String.format("Price: %s", order.getPrice()));
        holder.discount.setText(String.format("Discount: %s", order.getDiscount()));
    }

    @Override
    public int getItemCount() {
        return myOrders.size();
    }
}
