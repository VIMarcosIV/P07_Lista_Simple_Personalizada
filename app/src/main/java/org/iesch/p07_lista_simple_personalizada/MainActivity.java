package org.iesch.p07_lista_simple_personalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvPeliculas;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 10.- Lo enlazo
        lvPeliculas = findViewById(R.id.lvlista);
        adaptador = new Adaptador(obtenerListaPeliculas(), this);

        // 12.- Asignamos el adaptador al ListView
        lvPeliculas.setAdapter(adaptador);
    }

    // 11.- Método obtener peliculas
    private ArrayList<Pelicula> obtenerListaPeliculas() {
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

        listaPeliculas.add(new Pelicula(R.drawable.fiestasalchicha, "La fiesta de la salchicha", "2016"));
        listaPeliculas.add(new Pelicula(R.drawable.hoteltransilvania, "Hotel Transilvania", "2018"));
        listaPeliculas.add(new Pelicula(R.drawable.titanic, "Titanic", "1989"));
        listaPeliculas.add(new Pelicula(R.drawable.jurassicpark, "Jurassic Park", "1992"));
        listaPeliculas.add(new Pelicula(R.drawable.regeresoalfuturo, "Regreso al Futuro", "1988"));
        listaPeliculas.add(new Pelicula(R.drawable.shrek, "Shrek", "2003"));
        listaPeliculas.add(new Pelicula(R.drawable.ultimallamada, "Última Llamada", "2010"));
        return listaPeliculas;
    }

}