package com.jusutech.easyshopugserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.jusutech.easyshopugserver.Common.Common;
import com.jusutech.easyshopugserver.Interface.ItemClickListener;
import com.jusutech.easyshopugserver.Model.Request;
import com.jusutech.easyshopugserver.ViewHolder.OrderViewHolder;

public class OrderStatus extends AppCompatActivity {


    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    FirebaseRecyclerAdapter<Request,OrderViewHolder> adapter;
    FirebaseDatabase db;
    DatabaseReference requests;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_status);

        //firebase
        db = FirebaseDatabase.getInstance();
        requests = db.getReference("Requests");

        //init
        recyclerView = (RecyclerView)findViewById(R.id.list_orders);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        loadOrders(); //load all the orders
    }

    private void loadOrders() {
        adapter = new FirebaseRecyclerAdapter<Request, OrderViewHolder>(
                Request.class,
                R.layout.order_layout,
                OrderViewHolder.class,
                requests
        ) {
            @Override
            protected void populateViewHolder(OrderViewHolder viewHolder, Request model, int position) {
                viewHolder.txtOrderId.setText(adapter.getRef(position).getKey());
                viewHolder.txtOrderStatus.setText(Common.convertCodeToStatus(model.getStatus()));
                viewHolder.txtOrderAddress.setText(model.getAddress());
                viewHolder.txtOrderPhone.setText(model.getPhone());
                
                viewHolder.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onClick(View view, int position, boolean isLongClick) {
                        
                    }
                });
            }
        };
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getIntent().equals(Common.UPDATE))
            ShowUpdateDialog(adapter.getRef(item.getOrder()).getKey(), adapter.getItem(item.getOrder()));
        else if(item.getIntent().equals(Common.UPDATE))
            deleteOrder(adapter.getRef(item.getOrder()).getKey());
        return super.onContextItemSelected(item);
    }

    private void deleteOrder(String key) {
    }

    private void ShowUpdateDialog(String key, Request item) {
        
    }
}
