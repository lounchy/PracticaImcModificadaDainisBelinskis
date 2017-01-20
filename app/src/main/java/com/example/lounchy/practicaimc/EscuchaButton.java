package com.example.lounchy.practicaimc;


import android.content.Intent;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lounchy.practicaimc.Resultado.ResultadoActivity;
import com.example.lounchy.practicaimc.Tabla.TablaActivity;


/**
 * Created by Menchu y Dainis on 16/01/2017.
 */

public class EscuchaButton extends MainActivity implements View.OnClickListener {

    MainActivity activity;
    EditText etAltura;
    EditText etPeso;

    public EscuchaButton(MainActivity activity) {this.activity = activity;}

    @Override
    public void onClick(View view) {

        /*
        *Uso switch para encontrar boton pulsado
        */
        switch (view.getId()) {
            /*
            *Caso para botton calcular
             */
            case R.id.calcular_button:

                /*
                *Detecto los EditText en XML
                */

                etAltura = (EditText) activity.findViewById(R.id.altura_et);
                etPeso = (EditText) activity.findViewById(R.id.peso_et);

                /*
                 * Defino dos String que captura lo texto introducido en EditText
                 */
                String altura = etAltura.getText().toString();
                String peso = etPeso.getText().toString();

                /*
                 * Si usario no introduce ningun valor entra en bucle.
                 * Si usario introduce peso o altura no adecuado entra en bucle.
                 */
                if (altura.trim().equals("") || peso.trim().equals("") || Float.parseFloat(altura)< 100
                        || Float.parseFloat(altura)>250 || Float.parseFloat(peso)< 20 || Float.parseFloat(peso)>250) {
                    Log.d(getClass().getCanonicalName(), "Preparo Toast: " + altura + "(cm)" + peso+ "(kg)");

                    /*
                     * Construyo el Toast Message
                     */
                    Toast toast=Toast.makeText(activity, R.string.comrueba_peso_altura, Toast.LENGTH_LONG);

                    /*
                     * Defino LinearLayout para poder personalizar el Toast Message
                     */
                    LinearLayout layout = (LinearLayout) toast.getView();


                    if (layout.getChildCount() > 0) {
                        TextView textView = (TextView) layout.getChildAt(0);

                        /*
                         * Personalizo textView. TextAligment center.
                         */
                        textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
                    }

                    /*
                     * El Toast Message aparecera en el centro de pantalla.
                     */
                    toast.setGravity(Gravity.CENTER, 0,0);
                    toast.show();
                    return;
                }

                /*
                *Si Usario introducido altura y peso adecuado entro en bucle
                */
                if (peso.length() > 0 && altura.length() > 0) {
                    Log.d(getClass().getCanonicalName(), "Preparo Intent: ");
                            Intent intent = new Intent(activity, ResultadoActivity.class);
                            intent.putExtra("PESO", peso);
                            intent.putExtra("ALTURA", altura);
                            activity.startActivity(intent);
                }break;

            /*
            *Caso para botton Ver Tabla.
             */
            case R.id.ver_tabla_button:
                activity.startActivity(new Intent(activity, TablaActivity.class));
                break;
            /*
            *Caso para botton Volver. Vuelve a Main Activity
             */
            case R.id.volver_button:
               activity.finish();
                break;
        }
    }
}
