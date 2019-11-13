package com.example.bichito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
