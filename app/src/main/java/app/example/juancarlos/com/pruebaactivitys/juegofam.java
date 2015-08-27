package app.example.juancarlos.com.pruebaactivitys;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;


public class juegofam extends AppCompatActivity  implements OnClickListener{
    ImageView visor, papa, mama, nino,bebe;
    ImageButton ayuda;
    MediaPlayer mp;
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
        mp = MediaPlayer.create(this, R.raw.ranita);


        papa.setOnClickListener(this);
        mama.setOnClickListener(this);
        nino.setOnClickListener(this);
        bebe.setOnClickListener(this);
        ayuda.setOnClickListener(this);




    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mp.isPlaying()) {
            mp.stop();
            mp.release();

        }
    }


    @Override
    protected void onPause() {
        super.onPause();
        mp.pause();

    }



    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.ivPapa:
                visor.setImageResource(R.drawable.papafondo);
                mp = MediaPlayer.create(this, R.raw.papa);
                mp.setLooping(true);
                mp.setVolume(100, 100);
                mp.start();
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

        }


    }

    public void limpiar()
    {
        Runtime basura = Runtime.getRuntime();
        basura.gc();
    }
}
