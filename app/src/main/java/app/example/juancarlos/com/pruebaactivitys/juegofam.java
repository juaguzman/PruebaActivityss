package app.example.juancarlos.com.pruebaactivitys;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;


public class juegofam extends AppCompatActivity  implements OnClickListener{
    ImageView visor, papa, mama, nino,bebe;
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

        mp = MediaPlayer.create(this, R.raw.ranita);


        papa.setOnClickListener(this);
        mama.setOnClickListener(this);
        nino.setOnClickListener(this);
        bebe.setOnClickListener(this);




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
                if (mp.isPlaying()) {
                    mp.stop();
                    mp.release();
                }
                visor.setImageResource(R.drawable.papafondo);
                mp = MediaPlayer.create(this, R.raw.papa);

                mp.start();
                break;
            case R.id.ivMama:
                if (mp.isPlaying()) {
                    mp.stop();
                    mp.release();
                }
                visor.setImageResource(R.drawable.mamafondo);
                mp = MediaPlayer.create(this, R.raw.mama);
                mp.start();
                break;
            case R.id.ivNino:
                if (mp.isPlaying()) {
                    mp.stop();
                    mp.release();
                }
                visor.setImageResource(R.drawable.ninofondo);
                mp = MediaPlayer.create(this, R.raw.nino);

                mp.start();
                break;
            case R.id.ivBebe:
                if (mp.isPlaying()) {
                    mp.stop();
                    mp.release();
                }
                visor.setImageResource(R.drawable.bebefondo);
                mp = MediaPlayer.create(this, R.raw.bebe);

                mp.start();
                break;


        }


    }

    public void limpiar()
    {
        Runtime basura = Runtime.getRuntime();
        basura.gc();
    }
}
