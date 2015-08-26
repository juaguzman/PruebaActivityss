package app.example.juancarlos.com.pruebaactivitys;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class coloresjuego extends AppCompatActivity implements View.OnClickListener
{
    private Button btnIniciar, btnDetener;
    private ImageView ivAnimacion;
    private ImageButton ibAnim,ibAnm2,ibAnm3,ibAnm4;
    private AnimationDrawable savingAnimation,savingAnimation1,savingAnimation2,savingAnimation3,savingAnimation4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juegocolores);

        btnIniciar = (Button)findViewById(R.id.btn_iniciar_animacion);
        btnDetener = (Button)findViewById(R.id.btn_detener_animacion);

        btnIniciar.setOnClickListener(this);
        btnDetener.setOnClickListener(this);

        ivAnimacion = (ImageView)findViewById(R.id.iv_animacion);
        ivAnimacion.setBackgroundResource(R.drawable.animacion);
        savingAnimation = (AnimationDrawable)ivAnimacion.getBackground();

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
                savingAnimation1.start();
                break;
            case 2:
                savingAnimation2.start();
                break;
            case 3:
                savingAnimation3.start();
                break;
            case 4:
                savingAnimation4.start();
                break;


        }
    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_iniciar_animacion:
                savingAnimation.start();
                girar();
                break;
            case R.id.btn_detener_animacion:
                savingAnimation.stop();
                girar();
                break;
            case R.id.ib1_animacion:
                savingAnimation1.stop();
                girar();
                break;
            case R.id.ib2_animation:
                savingAnimation2.stop();
                girar();
                break;
            case R.id.ib3_animation:
                savingAnimation3.stop();
                girar();
                break;
            case R.id.ib4_animation:
                savingAnimation4.stop();
                girar();
                break;
        }
    }
}

