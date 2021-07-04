package com.example.ecommerceappfinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShowProductActivity extends AppCompatActivity
{
    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10;
    private ImageView addToCart;

    public static int countProduct =0;

    public static ArrayList<String> str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_product);

        str = new ArrayList<String>();

        addToCart = findViewById(R.id.addToCartBtn);

        img1 = findViewById(R.id.price1);
        img2 = findViewById(R.id.price2);
        img3 = findViewById(R.id.price3);
        img4 = findViewById(R.id.price4);
        img5 = findViewById(R.id.price5);
        img6 = findViewById(R.id.price6);
        img7 = findViewById(R.id.price7);
        img8 = findViewById(R.id.price8);
        img9 = findViewById(R.id.price9);
        img10 = findViewById(R.id.price10);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(ShowProductActivity.this, "Product addeed Successfully", Toast.LENGTH_SHORT).show();
              countProduct+= 140000 ;
              String s="AppleWatch";
              str.add(s);

            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(ShowProductActivity.this, "Product addeed Successfully", Toast.LENGTH_SHORT).show();
                countProduct+= 140000 ;
                String s="ROGLaptop";
                str.add(s);
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(ShowProductActivity.this, "Product addeed Successfully", Toast.LENGTH_SHORT).show();
                countProduct+= 140000 ;
                String s="GamingMouse";
                str.add(s);
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(ShowProductActivity.this, "Product addeed Successfully", Toast.LENGTH_SHORT).show();
                countProduct+= 140000 ;
                String s="GamingSpeaker";
                str.add(s);
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(ShowProductActivity.this, "Product addeed Successfully", Toast.LENGTH_SHORT).show();
                countProduct+= 140000 ;
                String s="Airpod";
                str.add(s);
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(ShowProductActivity.this, "Product addeed Successfully", Toast.LENGTH_SHORT).show();
                countProduct+= 140000 ;
                String s="Iphone11ProMax";
                str.add(s);
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(ShowProductActivity.this, "Product addeed Successfully", Toast.LENGTH_SHORT).show();
                countProduct+= 140000 ;
                String s="k20Pro";
                str.add(s);
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(ShowProductActivity.this, "Product addeed Successfully", Toast.LENGTH_SHORT).show();
                countProduct+= 140000 ;
                String s="MacBookPro";
                str.add(s);
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(ShowProductActivity.this, "Product addeed Successfully", Toast.LENGTH_SHORT).show();
                countProduct+= 140000 ;
                String s="smartWatch2";
                str.add(s);
            }
        });

        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(ShowProductActivity.this, "Product addeed Successfully", Toast.LENGTH_SHORT).show();
                countProduct+= 140000 ;
                String s="Airpod";
                str.add(s);
            }
        });


        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ShowProductActivity.this,OrderDetail.class);
                startActivity(intent);
            }
        });




    }
}
