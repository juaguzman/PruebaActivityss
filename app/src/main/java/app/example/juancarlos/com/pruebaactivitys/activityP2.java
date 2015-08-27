package app.example.juancarlos.com.pruebaactivitys;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class activityP2  extends AppCompatActivity implements View.OnClickListener
{
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prueba2);
        btn1 = (Button) findViewById(R.id.btnJuegAnm);
        btn1.setOnClickListener(this);

        btn2 = (Button) findViewById(R.id.btnJuegFam);
        btn2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnJuegAnm:
                Intent in1 = new Intent(activityP2.this,juegoanimales.class);
                startActivity(in1);
                break;
            case R.id.btnJuegFam:
                Intent in2 = new Intent(activityP2.this,juegofam.class);
                startActivity(in2);
        }

    }
}
