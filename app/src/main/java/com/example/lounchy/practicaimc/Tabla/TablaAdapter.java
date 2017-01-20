package com.example.lounchy.practicaimc.Tabla;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.lounchy.practicaimc.R;
import java.util.ArrayList;

/**
* {@link TablaAdapter} es {@link ArrayAdapter} que puede proporcionar el diseño de cada lista
*basado en fuente de datos,que es la lista de {@link TablaModelo} objetos.
*/

public class TablaAdapter extends ArrayAdapter<TablaModelo> {
    private static final  float TRANSPARENCIA = 0.5f;

    /**
     * Creo nuevo constructor para TablaAdapter
     * @param context    El context actual.Uso para inflar layout.
     * @param tablaModelo La lista de objetos en TablaModelo para visualizar en la lista
     */

    public TablaAdapter(Context context, ArrayList<TablaModelo> tablaModelo) {
        super(context, 0, tablaModelo);
    }

    /**
     * Proporciona una vista para un AdapterView (ListView, GridView, etc.)
     * @param position La posición en la lista de datos que debe mostrarse en la
     *vista de elemento de lista.
     * @param convertView La vista reciclada para mostrar.
     * @param parent El ViewGroup padre que se utiliza para la inflación.
     * @return La Vista para la posición en el AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*
         *Comprueba si se está reutilizando una vista existente, de lo contrario infle la vista
         */
        View elementoVista = convertView;
        if (elementoVista == null) {
            elementoVista = LayoutInflater.from(getContext()).inflate(
                    R.layout.pintar_tabla, parent, false);

        }
        /*
        * Obtener {@link TablaModelo} el objeto situado en esta posición en la lista
        */
        TablaModelo actualDato = getItem(position);


        /*
        *Encontrar TextView en pintar_tabla_xml
        */
        TextView tvAltura = (TextView)elementoVista.findViewById(R.id.tvAltura);
        TextView tvBajoPeso = (TextView)elementoVista.findViewById(R.id.tvBajoPeso);
        TextView tvPesoIdeal = (TextView)elementoVista.findViewById(R.id.tvPesoIdeal);
        TextView tvSobrepeso = (TextView)elementoVista.findViewById(R.id.tvSobrepeso);
        TextView tvObesidad = (TextView)elementoVista.findViewById(R.id.tvObesidad);
        TextView tvObesidadMorbida = (TextView)elementoVista.findViewById(R.id.tvObesidadMorbida);


        /*
        *Obtener los datos de actualDato y escoger el texto en TextView
        */
        tvAltura.setText(actualDato.getmAltura());
        tvBajoPeso.setText(actualDato.getmBajoPeso());
        tvPesoIdeal.setText(actualDato.getmPesoIdeal());
        tvSobrepeso.setText(actualDato.getmSobrepeso());
        tvObesidad.setText(actualDato.getmObesidad());
        tvObesidadMorbida.setText(actualDato.getmObesidadMorbida());

        /*
        *Obtener cada segunda lista y poner la transparencia.
        */
        if (position%2 == 0){
            elementoVista.setAlpha(TRANSPARENCIA);
        }

        /*
        *Devolver el diseño del elemento de lista para poder mostrar en ListView.
        */
        return elementoVista;
    }
}
