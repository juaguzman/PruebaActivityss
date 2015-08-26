package app.example.juancarlos.com.pruebaactivitys;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by JUANCARLOS on 26/08/2015.
 */
public class activityP2  extends AppCompatActivity implements View.OnClickListener
{
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prueba2);
        btn1 = (Button) findViewById(R.id.btnJuego);
        btn1.setOnClickListener(this);

        btn1 = (Button) findViewById(R.id.btnColores);
        btn1.setOnClickListener(this);
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnJuego:
                Intent in1 = new Intent(activityP2.this,juegofam.class);
                startActivity(in1);
                break;
            case R.id.btnColores:
                Intent in2 = new Intent(activityP2.this,coloresjuego.class);
                startActivity(in2);
        }

    }
}
