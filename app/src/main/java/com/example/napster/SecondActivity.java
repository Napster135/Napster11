package com.example.napster;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.napster.adaptador.GaleriaFotosAdapter;

public class SecondActivity extends Activity {



    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        gridView = (GridView) findViewById(R.id.gv_imagenes);
        gridView.setAdapter(new GaleriaFotosAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                                                Intent intent = new Intent(getApplicationContext(), ImagenCompleta.class );
                                                intent.putExtra("misImagenes", position);
                                                startActivity(intent);

                                            }
                                        }
        );
    }
}
