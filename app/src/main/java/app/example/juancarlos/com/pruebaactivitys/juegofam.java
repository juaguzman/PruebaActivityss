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
public class juegofam extends AppCompatActivity  implements OnClickListener{
    ImageView visor, papa, mama, nino,bebe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juegofamilia);
        visor=(ImageView)findViewById(R.id.ivVisor);
        papa=(ImageView)findViewById(R.id.ivPapa);
        mama=(ImageView)findViewById(R.id.ivMama);
        nino=(ImageView)findViewById(R.id.ivNino);
        bebe=(ImageView)findViewById(R.id.ivBebe);

        papa.setOnClickListener(this);
        mama.setOnClickListener(this);
        nino.setOnClickListener(this);
        bebe.setOnClickListener(this);

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

        }

    }
}
