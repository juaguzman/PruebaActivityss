package app.example.juancarlos.com.pruebaactivitys;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class coloresjuego extends AppCompatActivity implements View.OnClickListener
{
    MediaPlayer mp1;
    private Button btnIniciar, btnDetener;
    private RelativeLayout rl;
    private ImageButton ibAnim,ibAnm2,ibAnm3,ibAnm4;
    private AnimationDrawable savingAnimation1,savingAnimation2,savingAnimation3,savingAnimation4;
    private MediaPlayer mp;
    private TextView txt;
    private int cont;
    private String as="Aciertos = ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juegocolores);

        cont=0;
        mp = MediaPlayer.create(this,R.raw.error);
        mp1 = MediaPlayer.create(this, R.raw.rojo);
        String font_path = "font/timkid.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(),font_path);
        txt= (TextView) findViewById(R.id.txtAcierto);
        txt.setTypeface(TF);
        txt.setTextColor(Color.parseColor("#FF000000"));
        txt.setText(as + cont);

        rl=(RelativeLayout) findViewById(R.id.fondoColores);
        rl.setBackgroundColor(Color.parseColor("#2f2fff"));
        btnIniciar = (Button)findViewById(R.id.btn_iniciar_animacion);
        btnDetener = (Button)findViewById(R.id.btn_detener_animacion);

        btnIniciar.setOnClickListener(this);
        btnDetener.setOnClickListener(this);



        ibAnim = (ImageButton) findViewById(R.id.ib1_animacion);
        ibAnim.setOnClickListener(this);
        ibAnim.setBackgroundResource(R.drawable.animacion);
        savingAnimation1=(AnimationDrawable)ibAnim.getBackground();

        ibAnm2 = (ImageButton) findViewById(R.id.ib2_animation);
        ibAnm2.setOnClickListener(this);
        ibAnm2.setBackgroundResource(R.drawable.animaciona);
        savingAnimation2=(AnimationDrawable)ibAnm2.getBackground();

        ibAnm3 = (ImageButton) findViewById(R.id.ib3_animation);
        ibAnm3.setOnClickListener(this);
        ibAnm3.setBackgroundResource(R.drawable.animacionver);
        savingAnimation3=(AnimationDrawable)ibAnm3.getBackground();

        ibAnm4 = (ImageButton) findViewById(R.id.ib4_animation);
        ibAnm4.setOnClickListener(this);
        ibAnm4.setBackgroundResource(R.drawable.animacionama);
        savingAnimation4=(AnimationDrawable)ibAnm4.getBackground();


    }

    public int ran()
    {
        int num;
        num=(int)(Math.random()*4+ 1);

        return num;
    }

    public void girar()
    {
        int num=ran();
        switch (num)
        {
            case 1:
                if (mp.isPlaying()) {
                    mp.stop();
                    mp.release();
                }
                mp = MediaPlayer.create(this, R.raw.rojo);
                mp.start();
                savingAnimation1.start();
                rl.setBackgroundColor(Color.parseColor("#FFFF1511"));

                break;
            case 2:
                if (mp.isPlaying()) {
                    mp.stop();
                    mp.release();
                }
                mp = MediaPlayer.create(this, R.raw.azul);
                mp.start();
                    savingAnimation2.start();
                    rl.setBackgroundColor(Color.parseColor("#2f2fff"));


                break;
            case 3:
                if (mp.isPlaying()) {
                    mp.stop();
                    mp.release();
                }
                mp = MediaPlayer.create(this, R.raw.verde);
                mp.start();
                    savingAnimation3.start();
                    rl.setBackgroundColor(Color.parseColor("#FF0FFF0D"));



                break;
            case 4:
                if (mp.isPlaying()) {
                    mp.stop();
                    mp.release();
                }
                mp = MediaPlayer.create(this, R.raw.amarillo);
                mp.start();
                    savingAnimation4.start();
                    rl.setBackgroundColor(Color.parseColor("#FFABA90E"));

                break;

        }
    }


    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.btn_iniciar_animacion:
                btnIniciar.setVisibility(View.INVISIBLE);
                girar();
                break;
            case R.id.btn_detener_animacion:
                Intent in1 = new Intent(coloresjuego.this,menu3a6.class);
                startActivity(in1);

                break;
            case R.id.ib1_animacion:
                if(savingAnimation1.isRunning())
                {
                   cont ++;
                    txt.setText(as + cont);
                    savingAnimation1.stop();
                    girar();

                }
                else
                mp.start();

                break;
            case R.id.ib2_animation:
                if(savingAnimation2.isRunning())
                {
                    cont ++;
                    txt.setText(as + cont);
                    savingAnimation2.stop();
                    girar();
                }
                else
                mp.start();

                break;
            case R.id.ib3_animation:
                if(savingAnimation3.isRunning() )
                {
                    cont ++;
                    txt.setText(as + cont);
                    savingAnimation3.stop();
                    girar();
                }
                else
                mp.start();

                break;
            case R.id.ib4_animation:
                if(savingAnimation4.isRunning())
                {
                    cont ++;
                    txt.setText(as + cont);
                    savingAnimation4.stop();
                    girar();
                }
                else
                mp.start();

                break;
        }
    }
}

