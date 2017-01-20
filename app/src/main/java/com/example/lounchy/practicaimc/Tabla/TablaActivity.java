package com.example.lounchy.practicaimc.Tabla;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import com.example.lounchy.practicaimc.EscuchaButton;
import com.example.lounchy.practicaimc.MainActivity;
import com.example.lounchy.practicaimc.R;
import java.util.ArrayList;

    /**
    * {@link TablaActivity} pinta la lista
    *  para cada version, altura, bajopeso, peso ideal, sobrepeso, obesidad y obesidad mórbida.
    */
public class TablaActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contenido_tabla);

        /*
        *Creo ArrayList de TablaModelo objetos
        */
        ArrayList<TablaModelo> tablaModelo = new ArrayList<>();

        tablaModelo.add(new TablaModelo("1.50","<42","42-56","56-67","57-90",">92"));
        tablaModelo.add(new TablaModelo("1.51","<42","42-57","57-68","68-91",">91"));
        tablaModelo.add(new TablaModelo("1.52","<43","43-58","58-69","69-92",">92"));
        tablaModelo.add(new TablaModelo("1.53","<43","43-59","59-70","70-94",">94"));
        tablaModelo.add(new TablaModelo("1.54","<44","44-59","59-71","71-95",">95"));
        tablaModelo.add(new TablaModelo("1.55","<44","44-60","60-72","72-96",">96"));
        tablaModelo.add(new TablaModelo("1.56","<45","45-61","61-73","73-97",">97"));
        tablaModelo.add(new TablaModelo("1.57","<46","46-62","62-74","74-99",">99"));
        tablaModelo.add(new TablaModelo("1.58","<46","46-62","62-75","75-100",">100"));
        tablaModelo.add(new TablaModelo("1.59","<47","47-63","63-76","76-101",">101"));
        tablaModelo.add(new TablaModelo("1.60","<47","47-64","64-77","77-102",">102"));
        tablaModelo.add(new TablaModelo("1.61","<48","48-65","65-78","78-104",">104"));
        tablaModelo.add(new TablaModelo("1.62","<49","49-66","66-79","79-105",">105"));
        tablaModelo.add(new TablaModelo("1.63","<49","49-66","66-80","80-107",">107"));
        tablaModelo.add(new TablaModelo("1.64","<50","50-67","67-81","81-108",">108"));
        tablaModelo.add(new TablaModelo("1.65","<50","50-68","68-82","82-109",">109"));
        tablaModelo.add(new TablaModelo("1.66","<51","51-69","69-83","83-110",">110"));
        tablaModelo.add(new TablaModelo("1.67","<52","52-70","70-84","84-112",">112"));
        tablaModelo.add(new TablaModelo("1.68","<52","52-71","71-85","85-113",">113"));
        tablaModelo.add(new TablaModelo("1.69","<53","53-71","71-86","86-114",">114"));
        tablaModelo.add(new TablaModelo("1.70","<53","53-72","72-87","87-116",">116"));
        tablaModelo.add(new TablaModelo("1.71","<54","54-73","73-88","88-117",">117"));
        tablaModelo.add(new TablaModelo("1.72","<55","55-74","74-89","89-118",">118"));
        tablaModelo.add(new TablaModelo("1.73","<55","55-75","75-90","90-120",">120"));
        tablaModelo.add(new TablaModelo("1.74","<56","56-76","76-91","91-121",">121"));
        tablaModelo.add(new TablaModelo("1.75","<57","57-77","77-92","92-122",">122"));
        tablaModelo.add(new TablaModelo("1.76","<57","57-77","77-93","93-124",">124"));
        tablaModelo.add(new TablaModelo("1.77","<58","58-78","78-94","94-125",">125"));
        tablaModelo.add(new TablaModelo("1.78","<59","59-79","79-95","95-127",">127"));
        tablaModelo.add(new TablaModelo("1.79","<59","59-80","80-96","96-128",">128"));
        tablaModelo.add(new TablaModelo("1.80","<60","60-81","81-97","97-130",">130"));
        tablaModelo.add(new TablaModelo("1.81","<61","61-82","82-98","98-131",">131"));
        tablaModelo.add(new TablaModelo("1.82","<61","61-83","83-99","99-132",">132"));
        tablaModelo.add(new TablaModelo("1.83","<62","62-84","84-100","100-134",">134"));
        tablaModelo.add(new TablaModelo("1.84","<63","63-85","85-102","102-135",">135"));
        tablaModelo.add(new TablaModelo("1.85","<63","63-86","86-103","103-137",">137"));
        tablaModelo.add(new TablaModelo("1.86","<64","64-86","86-104","104-138",">138"));
        tablaModelo.add(new TablaModelo("1.87","<65","65-87","87-105","105-140",">140"));
        tablaModelo.add(new TablaModelo("1.88","<65","65-88","88-106","106-141",">141"));
        tablaModelo.add(new TablaModelo("1.89","<66","66-89","89-107","107-143",">143"));
        tablaModelo.add(new TablaModelo("1.90","<67","67-90","90-108","108-144",">144"));
        tablaModelo.add(new TablaModelo("1.91","<67","67-91","91-109","109-146",">146"));
        tablaModelo.add(new TablaModelo("1.92","<68","69-92","92-111","111-147",">147"));
        tablaModelo.add(new TablaModelo("1.93","<69","69-93","93-112","112-149",">149"));
        tablaModelo.add(new TablaModelo("1.94","<70","70-94","94-113","113-151",">151"));
        tablaModelo.add(new TablaModelo("1.95","<70","70-95","95-114","114-152",">152"));
        tablaModelo.add(new TablaModelo("1.96","<71","71-96","96-115","115-154",">154"));
        tablaModelo.add(new TablaModelo("1.97","<72","72-97","97-116","116-155",">155"));
        tablaModelo.add(new TablaModelo("1.98","<73","73-98","98-118","118-157",">157"));
        tablaModelo.add(new TablaModelo("1.99","<73","73-99","99-119","119-185",">158"));
        tablaModelo.add(new TablaModelo("2.00","<74","74-99","100-120","120-160",">160"));




        /**
        *Creo{@link TablaAdapter}, cuya fuente de datos es una lista de
        *{@link TablaModelo}
        */
        TablaAdapter listAdapter = new TablaAdapter(this, tablaModelo);
        /*
        *Obtenga una referencia al ListView y adjunta el adaptador al listView.
        */
        ListView listView = (ListView)findViewById(R.id.lista);
        listView.setAdapter(listAdapter);


        EscuchaButton escuchaButton = new EscuchaButton(this);
        Button volver = (Button)findViewById(R.id.volver_button);
        volver.setOnClickListener(escuchaButton);

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
