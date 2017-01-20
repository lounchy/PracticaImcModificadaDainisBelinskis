package com.example.lounchy.practicaimc.Resultado;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.lounchy.practicaimc.EscuchaButton;
import com.example.lounchy.practicaimc.MainActivity;
import com.example.lounchy.practicaimc.R;
import com.example.lounchy.practicaimc.Tabla.TablaActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link ResultadoActivity} pinta la vista de resutado
 */

public class ResultadoActivity extends MainActivity {

    private String altura;
    private String peso;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);


        /*
        *Creo ArrayList de ImcModelo objetos
        */
        List<ImcModelo> resultados = new ArrayList<ImcModelo>();

        resultados.add(new ImcModelo(19, getString(R.string.bajo_peso), R.drawable.image_imc_bajo_peso));
        resultados.add(new ImcModelo(25, getString(R.string.peso_ideal), R.drawable.image_imc_peso_ideal));
        resultados.add(new ImcModelo(30, getString(R.string.sobrepeso), R.drawable.image_imc_sobrepeso));
        resultados.add(new ImcModelo(40, getString(R.string.obesidad), R.drawable.image_imc_obesidad));
        resultados.add(new ImcModelo(99, getString(R.string.obesidad_morbida), R.drawable.image_imc_obesidad_morbida));

        /*
        *Encontrar TextView y ImageButton en activity_resultado_xml
        */
        TextView tvResultIMC = (TextView) findViewById(R.id.resultado_imc_tv);
        TextView tvEstadoTexto = (TextView) findViewById(R.id.resultado_texto_tv);
        ImageButton resultadoImaxe = (ImageButton)findViewById(R.id.result_image_button);



        if (savedInstanceState == null) {

            Bundle extras = getIntent().getExtras();
            peso = extras.getString("PESO");
            altura = extras.getString("ALTURA");

        } else {

            peso = (String) savedInstanceState.get("PESO");
            altura = (String) savedInstanceState.get("ALTURA");
        }
        float valorPeso;
        float valorAltura;
        float imc;


        valorPeso = Float.parseFloat(peso);
        valorAltura = Float.parseFloat(altura)/100;
        imc =  (valorPeso / (valorAltura * valorAltura));


        for(ImcModelo indice : resultados) {
            if(imc < indice.getmLimite()) {
                Log.d(getClass().getCanonicalName(), "IMC es: " + imc);
                Log.d(getClass().getCanonicalName(),"Límite: " + Float.toString(indice.getmLimite()));

                tvResultIMC.setText(Float.toString(imc));
                tvEstadoTexto.setText(indice.getRes());
                resultadoImaxe.setImageResource(indice.getImageRecurso());
                break;
            }
        }
        EscuchaButton escuchaButton = new EscuchaButton(this);
        Button volver = (Button)findViewById(R.id.volver_button);
        volver.setOnClickListener(escuchaButton);
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){

        savedInstanceState.putCharSequence("PESO",peso);
        savedInstanceState.putCharSequence("ALTURA",altura);

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
