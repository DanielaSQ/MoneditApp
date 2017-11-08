package appmovil.proyecto.monedita.dany.moneditapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text_Saludo, text_nombre;
    ImageView image_logo;
    Button bonton_ini, boton_regi;





    @Override // es una sobreescritura de metodo, corresponde a la clase appcompatActivate, en ella hay un metodo oncreate
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_Saludo = (TextView) findViewById(R.id.txt_bienvenida);
        text_nombre = (TextView) findViewById(R.id.text_app);
        image_logo = (ImageView) findViewById(R.id.image_id);
        bonton_ini = (Button) findViewById(R.id.btn_iniciar);
        boton_regi = (Button) findViewById(R.id.btn_registra);


        bonton_ini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent boton_ini = new Intent();
                startActivity(boton_ini);
            }
        });








    }
    //R es un recurso de android, es una clase que esta en android,nos ayudara a utilizar too
    // lo que esta en el proyecto
}
