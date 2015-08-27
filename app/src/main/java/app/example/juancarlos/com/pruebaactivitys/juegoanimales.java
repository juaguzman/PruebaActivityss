package app.example.juancarlos.com.pruebaactivitys;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.content.DialogInterface;
import android.view.View.OnClickListener;
import android.view.View;


public class juegoanimales extends AppCompatActivity implements OnClickListener
{
    ImageView visor, leon, perro, rana,pato, mono, oso;
    MediaPlayer mp,mp1;
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
        mp=MediaPlayer.create(this,R.raw.ranita);
        mp1=MediaPlayer.create(this,R.raw.clasica);
        mp1.setLooping(true);
        mp1.setVolume(2, 2);
        mp1.start();

        leon.setOnClickListener(this);
        perro.setOnClickListener(this);
        rana.setOnClickListener(this);
        pato.setOnClickListener(this);
        mono.setOnClickListener(this);
        oso.setOnClickListener(this);

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        if(mp.isPlaying())
        {
            mp.stop();
            mp.release();
            mp1.stop();
            mp1.release();
        }
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        mp1.start();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        mp.pause();
        mp1.pause();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.ivLeon:
                if(mp.isPlaying())
                {
                    mp.stop();
                }
                visor.setImageResource(R.drawable.leonfin);
                mp = MediaPlayer.create(this,R.raw.leon);
                mp.setLooping(true);
                mp.setVolume(100,100);
                mp.start();
                break;
            case R.id.ivPerro:
                if(mp.isPlaying())
                {
                    mp.stop();
                }
                visor.setImageResource(R.drawable.perrofin);
                mp = MediaPlayer.create(this,R.raw.perro);
                mp.setLooping(true);
                mp.start();
                break;
            case R.id.ivRana:
                if(mp.isPlaying())
                {
                    mp.stop();
                }
                visor.setImageResource(R.drawable.ranafim);
                mp = MediaPlayer.create(this,R.raw.ranita);
                mp.setLooping(true);
                mp.start();
                break;
            case R.id.ivPato:
                if(mp.isPlaying())
                {
                    mp.stop();
                }
                visor.setImageResource(R.drawable.patofin);
                mp = MediaPlayer.create(this,R.raw.pato);
                mp.setLooping(true);
                mp.start();
                break;
            case R.id.ivMono:
                if(mp.isPlaying())
                {
                    mp.stop();
                }
                visor.setImageResource(R.drawable.monofin);
                mp = MediaPlayer.create(this,R.raw.mono);
                mp.setLooping(true);
                mp.start();
                break;
            case R.id.ivOso:
                if(mp.isPlaying())
                {
                    mp.stop();
                }
                visor.setImageResource(R.drawable.osofin);
                mp = MediaPlayer.create(this,R.raw.oso);
                mp.setLooping(true);
                mp.start();
                break;

        }

    }
}
