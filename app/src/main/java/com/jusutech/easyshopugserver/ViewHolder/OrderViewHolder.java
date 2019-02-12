package com.jusutech.easyshopugserver.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jusutech.easyshopugserver.Interface.ItemClickListener;
import com.jusutech.easyshopugserver.R;

/**
 * Created by Junior Joseph on 1/16/2019.
 */

public class OrderViewHolder extends RecyclerView.ViewHolder{
    public TextView txtOrderId, txtOrderPhone, txtOrderStatus, txtOrderAddress;
    //private ItemClickListener itemClickListener;

    public Button btnEdit, btnRemove, btnDetails;
    public OrderViewHolder(@NonNull View itemView) {
        super(itemView);
        txtOrderId = itemView.findViewById(R.id.order_id);
        txtOrderPhone = itemView.findViewById(R.id.order_phone);
        txtOrderStatus = itemView.findViewById(R.id.order_status);
        txtOrderAddress = itemView.findViewById(R.id.order_address);

        btnEdit = (Button)itemView.findViewById(R.id.btnEdit);
        btnRemove = (Button)itemView.findViewById(R.id.btnRemove);
        btnDetails = (Button)itemView.findViewById(R.id.btnDetail);

//        itemView.setOnClickListener(this);
//        itemView.setOnLongClickListener(this);
//        itemView.setOnCreateContextMenuListener(this);
    }
//
//    public void setItemClickListener(ItemClickListener itemClickListener) {
//        this.itemClickListener = itemClickListener;
//    }
//
//    @Override
//    public void onClick(View view) {
//        itemClickListener.onClick(view, getAdapterPosition(),false);
//    }
//
//    @Override
//    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
//        contextMenu.add(0,0,getAdapterPosition(),"Update");
//        contextMenu.add(0,1,getAdapterPosition(),"Delete");
//    }
//
//    @Override
//    public boolean onLongClick(View view) {
//        itemClickListener.onClick(view, getAdapterPosition(),true);
//        return true;
//    }
}
