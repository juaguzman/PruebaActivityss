package app.example.juancarlos.com.pruebaactivitys;

/**
 * Created by JUANCARLOS on 26/08/2015.
 */


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
    private ImageButton ibAnim,ibAnm2,ibAnm3;
    private AnimationDrawable savingAnimation,savingAnimation1,savingAnimation2,savingAnimation3;

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


    }



    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_iniciar_animacion:
                savingAnimation.start();
                savingAnimation1.start();
                savingAnimation2.start();
                savingAnimation3.start();
                break;
            case R.id.btn_detener_animacion:
                savingAnimation.stop();
                break;
            case R.id.ib1_animacion:
                savingAnimation1.stop();
                break;
            case R.id.ib2_animation:
                savingAnimation1.stop();
                break;
            case R.id.ib3_animation:
                savingAnimation3.stop();
                break;
        }
    }
}

