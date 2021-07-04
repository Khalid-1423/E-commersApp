package com.example.ecommerceappfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OrderDetail extends AppCompatActivity
{
    private TextView productsName, productPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);

        productsName = findViewById(R.id.productName);
        productPrice = findViewById(R.id.totalPrice);


     productsName.setText( Integer.toString(ShowProductActivity.countProduct));

        String str="";

        for(String s : ShowProductActivity.str)
        {
            str+=s;
        }

        productsName.setText(str);


    }
}
