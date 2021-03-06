package com.example.wun.fivecrowdsourcing_runner.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wun.fivecrowdsourcing_runner.Bean.OrderBean;
import com.example.wun.fivecrowdsourcing_runner.R;

import java.util.List;

/**
 * Created by WUN、 on 2018/3/22.
 */

public class DeliveryAdpater extends RecyclerView.Adapter<DeliveryAdpater.ViewHolder> {
    private List<OrderBean> orderList;

    public DeliveryAdpater(List<OrderBean> orderList) {
        this.orderList = orderList;
    }

    @Override
    public DeliveryAdpater.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_layout ,parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(DeliveryAdpater.ViewHolder holder, int position) {
        OrderBean deliveryOrder = orderList.get(position);
        holder.storeName.setText(deliveryOrder.getStoreName());
        holder.storeAddress.setText(deliveryOrder.getStoreAddress());
        holder.cusAddress.setText(deliveryOrder.getCusAddress());
        holder.estimatedTime.setText(deliveryOrder.getEstimatedtime()+"分钟");
        holder.estimatedPrice.setText(deliveryOrder.getEstimatedtotalprice()+"元");
        holder.getOrder.setText("配送中");
    }

    @Override
    public int getItemCount() {
        return orderList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView storeName;
        TextView storeAddress;
        TextView cusAddress;
        TextView estimatedPrice;
        TextView estimatedTime;
        TextView getOrder;
        TextView cusName;

        public ViewHolder(View itemView) {
            super(itemView);
            storeName = itemView.findViewById(R.id.shopName);
            storeAddress = itemView.findViewById(R.id.storeAddress);
            cusAddress = itemView.findViewById(R.id.cusAddress);
            estimatedPrice = itemView.findViewById(R.id.estimatedPrice);
            estimatedTime = itemView.findViewById(R.id.estimatedTime);
            cusName = itemView.findViewById(R.id.cusName);
            getOrder = itemView.findViewById(R.id.get_order);
        }
    }
}
