package app.example.juancarlos.com.pruebaactivitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.content.DialogInterface;
import android.view.View.OnClickListener;
import android.view.View;


public class juegofam extends AppCompatActivity  implements OnClickListener{
    ImageView visor, papa, mama, nino,bebe;
    ImageButton ayuda;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juegofamilia);
        visor=(ImageView)findViewById(R.id.ivVisor);
        papa=(ImageView)findViewById(R.id.ivPapa);
        mama=(ImageView)findViewById(R.id.ivMama);
        nino=(ImageView)findViewById(R.id.ivNino);
        bebe=(ImageView)findViewById(R.id.ivBebe);
        ayuda=(ImageButton)findViewById(R.id.ibtnayuda);
        btn = (Button)findViewById(R.id.btnatrfm);

        papa.setOnClickListener(this);
        mama.setOnClickListener(this);
        nino.setOnClickListener(this);
        bebe.setOnClickListener(this);
        ayuda.setOnClickListener(this);
        btn.setOnClickListener(this);



    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.ivPapa:
                visor.setImageResource(R.drawable.papafondo);
                break;
            case R.id.ivMama:
                visor.setImageResource(R.drawable.mamafondo);
                break;
            case R.id.ivNino:
                visor.setImageResource(R.drawable.ninofondo);
                break;
            case R.id.ivBebe:
                visor.setImageResource(R.drawable.bebefondo);
                break;
            case R.id.ibtnayuda:
                Intent in = new Intent(juegofam.this,inst1.class);
                startActivity(in);
            case R.id.btnatrfm:
                finish();
                Intent in1 = new Intent(juegofam.this,activityP2.class);
                startActivity(in1);

        }


    }

    public void limpiar()
    {
        Runtime basura = Runtime.getRuntime();
        basura.gc();
    }
}
