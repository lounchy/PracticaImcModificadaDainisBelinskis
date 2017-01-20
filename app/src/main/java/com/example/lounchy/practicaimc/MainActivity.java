package com.example.lounchy.practicaimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EscuchaButton escuchaButton =new EscuchaButton(this);

        Button calcular = (Button)findViewById(R.id.calcular_button);
        calcular.setOnClickListener(escuchaButton);

        Button verTabla = (Button)findViewById(R.id.ver_tabla_button);
        verTabla.setOnClickListener(escuchaButton);

    }
    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onPostResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
