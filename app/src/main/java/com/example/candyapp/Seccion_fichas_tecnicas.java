package com.example.candyapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import androidx.appcompat.app.AppCompatActivity;

public class Seccion_fichas_tecnicas extends AppCompatActivity {

    ImageSwitcher Switch_almohada_1;
    ImageSwitcher Switch_almohada_2;
    ImageSwitcher Switch_almohada_3;

    Button Btn_salir, Btn_izquierda, BTN_derecha, BTN_izquierda_2,  BTN_derecha_2, BTN_izquierda_3, BTN_derecha_3, RESET;

    Integer[] images  = {R.drawable.resorte_bonell          , R.drawable.resorte_bonell_3};
    Integer[] images2 = {R.drawable.colchon_esmeralda_2     , R.drawable.cassata_1};
    Integer[] images3 = {R.drawable.colchon_pocket_1,  R.drawable.colchon_pocket_2};

    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion_almohadas);

        Switch_almohada_1 =(ImageSwitcher) findViewById(R.id.switch_cervical);
        Switch_almohada_2 =(ImageSwitcher) findViewById(R.id.switch_cervical_2);
        Switch_almohada_3 =(ImageSwitcher) findViewById(R.id.switch_cervical_3);

        Btn_izquierda   =(Button)     findViewById(R.id.BTN_izquierda_1);
        BTN_derecha     =(Button)     findViewById(R.id.BTN_derecha_1);
        BTN_izquierda_2 =(Button)     findViewById(R.id.BTN_izquierda_2);
        BTN_derecha_2   =(Button)     findViewById(R.id.BTN_derecha_2);
        BTN_izquierda_3 =(Button)     findViewById(R.id.BTN_izquierda_3);
        RESET           =(Button)     findViewById(R.id.BTN_izquierda_3);
        BTN_derecha_3   =(Button)     findViewById(R.id.BTN_derecha_3);


        Switch_almohada_1.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setLayoutParams(
                        new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
                );
                return imageView;
            }
        });

        Switch_almohada_1.setImageResource(images[0]);

        if(i==0){
            Btn_izquierda.setVisibility(View.INVISIBLE);}

        Btn_izquierda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i>0){
                    i--;
                    if(i==0){
                        Btn_izquierda.setVisibility(View.INVISIBLE);}
                    else {
                        BTN_derecha.setVisibility(View.VISIBLE); BTN_derecha.setVisibility(View.GONE);}
                    Switch_almohada_1.setImageResource(images[i]);
                }
            }
        });

        BTN_derecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i<images.length-1){
                    i++;
                    if(i==images.length-1){
                        BTN_derecha.setVisibility(View.GONE); BTN_derecha.setVisibility(View.VISIBLE);}
                    else {
                        Btn_izquierda.setVisibility(View.VISIBLE);}
                    Switch_almohada_1.setImageResource(images[i]);
                }
            }
        });


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Switch_almohada_2.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setLayoutParams(
                        new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
                );
                return imageView;
            }
        });

        Switch_almohada_2.setImageResource(images2[0]);

        if(i==0){
            BTN_izquierda_2.setVisibility(View.INVISIBLE);}

        BTN_izquierda_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i>0){
                    i--;
                    if(i==0){
                        BTN_izquierda_2.setVisibility(View.INVISIBLE);}
                    else {
                        BTN_derecha_2.setVisibility(View.VISIBLE); BTN_derecha_2.setVisibility(View.GONE);}
                    Switch_almohada_2.setImageResource(images2[i]);
                }
            }
        });

        BTN_derecha_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i<images2.length-1){
                    i++;
                    if(i==images2.length-1){
                        BTN_derecha_2.setVisibility(View.GONE); BTN_derecha_2.setVisibility(View.VISIBLE);}
                    else {
                        BTN_izquierda_2.setVisibility(View.VISIBLE);}
                    Switch_almohada_2.setImageResource(images2[i]);
                }
            }
        });


        //////////////////////////////////////////////////////////////////////////////////////////////////////

        Switch_almohada_3.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageView.setLayoutParams(
                        new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
                );
                return imageView;
            }
        });

        Switch_almohada_3.setImageResource(images3[0]);

        if(i==0){
            BTN_izquierda_3.setVisibility(View.INVISIBLE);}

        BTN_izquierda_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i>0){
                    i--;
                    if(i==0){
                        BTN_izquierda_3.setVisibility(View.INVISIBLE);}
                    else {
                        BTN_derecha_3.setVisibility(View.VISIBLE); BTN_derecha_3.setVisibility(View.GONE);}
                    Switch_almohada_3.setImageResource(images3[i]);

                }
            }
        });

        BTN_derecha_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i<images3.length-1){
                    i++;
                    if(i==images3.length-1){
                        BTN_derecha_3.setVisibility(View.GONE); BTN_derecha_3.setVisibility(View.VISIBLE);}
                    else {
                        BTN_izquierda_3.setVisibility(View.VISIBLE);}
                    Switch_almohada_3.setImageResource(images3[i]);
                    BTN_izquierda_3.setVisibility(View.INVISIBLE);
                    BTN_derecha_3.setVisibility(View.VISIBLE);


                }
            }
        });

        RESET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Switch_almohada_3.setImageResource(images3[0]);
                BTN_izquierda_3.setVisibility(View.INVISIBLE);
                BTN_derecha_3.setVisibility(View.VISIBLE);
                RESET.setVisibility(View.GONE);
                i=0;
            }
        });
    }
}

