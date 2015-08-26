package app.example.juancarlos.com.pruebaactivitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.content.DialogInterface;
import android.view.View.OnClickListener;
import android.view.View;

/**
 * Created by usuario on 26/08/2015.
 */
public class juegoanimales extends AppCompatActivity implements OnClickListener
{
    ImageView visor, leon, perro, rana,pato, mono, oso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juegoanimales);
        visor=(ImageView)findViewById(R.id.ivVisor);
        leon=(ImageView)findViewById(R.id.ivLeon);
        perro=(ImageView)findViewById(R.id.ivPerro);
        rana=(ImageView)findViewById(R.id.ivRana);
        pato=(ImageView)findViewById(R.id.ivPato);
        mono=(ImageView)findViewById(R.id.ivMono);
        oso=(ImageView)findViewById(R.id.ivOso);

        leon.setOnClickListener(this);
        perro.setOnClickListener(this);
        rana.setOnClickListener(this);
        pato.setOnClickListener(this);
        mono.setOnClickListener(this);
        oso.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.ivLeon:
                visor.setImageResource(R.drawable.leonfin);
                break;
            case R.id.ivPerro:
                visor.setImageResource(R.drawable.perrofin);
                break;
            case R.id.ivRana:
                visor.setImageResource(R.drawable.ranafim);
                break;
            case R.id.ivPato:
                visor.setImageResource(R.drawable.patofin);
                break;
            case R.id.ivMono:
                visor.setImageResource(R.drawable.monofin);
                break;
            case R.id.ivOso:
                visor.setImageResource(R.drawable.osofin);
                break;

        }

    }
}
