package com.example.bichito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnProducts;
    private Button btnAboutUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Enlazamos activity + layout

        btnProducts = (Button) findViewById(R.id.btnEnter);//R: recursos
        btnAboutUs = (Button) findViewById(R.id.btnAboutsUs);

        btnProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //intent sirve para una pantalla
                Intent i = new Intent(MainActivity.this, ProductListActivity.class);
                startActivity(i);
            }
        });
        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onResume() {
        super.onResume(); //este codigo que se ejecuta antes de todos.
        //en este punto la aplicion ya cargo
        // this - en un activity: es la escencia de una pantalla
        // this es de tipo contexo
        Toast.makeText(this,
                        "Aplicacion iniciada",
                        Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,
                        "Aplicacion Stropeada",
                        Toast.LENGTH_SHORT).show();
    }
}
