package app.example.juancarlos.com.pruebaactivitys;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class activityP2  extends AppCompatActivity implements View.OnClickListener
{
    Button btn1;
    Button btn2,btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prueba2);

        btn1 = (Button) findViewById(R.id.btnJuegAnm);
        btn1.setBackgroundResource(R.drawable.images);
        btn1.setOnClickListener(this);

        btn2 = (Button) findViewById(R.id.btnJuegFam);
        btn2.setBackgroundResource(R.drawable.familiaanim);
        btn2.setOnClickListener(this);

        btn3 = (Button)findViewById(R.id.btnatras);
        btn3.setOnClickListener(this);
    }

    public void pasarGarbageCollector(){

        Runtime garbage = Runtime.getRuntime();
        garbage.gc();

    }


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnJuegAnm:
                finish();
                pasarGarbageCollector();
                Intent in1 = new Intent(activityP2.this,juegoanimales.class);
                startActivity(in1);
                break;
            case R.id.btnJuegFam:
                finish();
                Intent in2 = new Intent(activityP2.this,juegofam.class);
                startActivity(in2);
            case R.id.btnatras:
                finish();
                Intent in3 = new Intent(activityP2.this,MainActivity.class);
                startActivity(in3);
                break;
        }

    }
}
