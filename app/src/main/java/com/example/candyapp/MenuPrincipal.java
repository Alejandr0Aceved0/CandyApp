package com.example.candyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPrincipal extends AppCompatActivity {

    private Button mbtn_Ingresar_ver_almohadas, mbtn_Ingresar_ver_colchones, mbtn_Ingresar_fichas_tecnicas, mbtn_Ingresar_ver_niños, mbtn_Ingresar_ver_closets;

 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

     mbtn_Ingresar_ver_almohadas   = (Button) findViewById(R.id.btn_ver_almohadas);
     mbtn_Ingresar_ver_colchones   = (Button) findViewById(R.id.btn_ver_colchones);
     mbtn_Ingresar_fichas_tecnicas = (Button) findViewById(R.id.btn_fichas_tecnicas);
     mbtn_Ingresar_ver_niños       = (Button) findViewById(R.id.btn_ver_niños);
     mbtn_Ingresar_ver_closets     = (Button) findViewById(R.id.btn_ver_closets);

     mbtn_Ingresar_ver_almohadas.setOnClickListener(new View.OnClickListener(){

         @Override
         public void onClick(View view) {

             Intent intent = new Intent(MenuPrincipal.this, SeccionAlmohadas.class);

             startActivity(intent);

             finish();
         }
     });

     mbtn_Ingresar_ver_colchones.setOnClickListener(new View.OnClickListener(){

         @Override
         public void onClick(View view) {

             Intent intent = new Intent(MenuPrincipal.this, SeccionColchones.class);

             startActivity(intent);

             finish();
         }
     });

     mbtn_Ingresar_fichas_tecnicas.setOnClickListener(new View.OnClickListener(){

         @Override
         public void onClick(View view) {

             Intent intent = new Intent(MenuPrincipal.this, Seccion_fichas_tecnicas.class);

             startActivity(intent);

             finish();
         }
     });


     mbtn_Ingresar_ver_niños.setOnClickListener(new View.OnClickListener(){

         @Override
         public void onClick(View view) {

             Intent intent = new Intent(MenuPrincipal.this, SeccionNinos.class);

             startActivity(intent);

             finish();
         }
     });

     mbtn_Ingresar_ver_closets.setOnClickListener(new View.OnClickListener(){

         @Override
         public void onClick(View view) {

             Intent intent = new Intent(MenuPrincipal.this, SeccionClosets.class);

             startActivity(intent);

             finish();
         }
     });
   }
}