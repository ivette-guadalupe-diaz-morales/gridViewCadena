package igdmitics.tesoem.edu.gridviewcadena;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gvdatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos = findViewById(R.id.gvDatos);

        String[] arreglo = new String[]{"Nom1", "Nom2", "Nom3", "Nom4", "Nom5", "Nom6", "Nom7", "Nom8", "Nom9", "nom10", "Nom11", "Nom12", "Nom13", "Nom14", "Nom15", "Nom16", "Nom17", "Nom18", "Nom19", "nom20", "Nom21", "Nom22", "Nom23", "Nom24", "Nom25", "Nom26", "Nom27", "Nom28", "Nom29", "nom30", "Nom31", "Nom32", "Nom33", "Nom34", "Nom35", "Nom36", "Nom37", "Nom38", "Nom39", "nom40", "Nom41", "Nom42", "Nom43", "Nom44", "Nom45", "Nom46", "Nom47", "Nom48"};
        ArrayAdapter adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arreglo);
        gvdatos.setAdapter(adaptador);
    }
}
