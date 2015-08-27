package app.example.juancarlos.com.pruebaactivitys;


import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class menu3a6 extends AppCompatActivity implements View.OnClickListener
{

    ImageButton btn1;
    private AnimationDrawable anim1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu3a6);

        btn1 = (ImageButton) findViewById(R.id.ibtn_color);
        btn1.setOnClickListener(this);
        btn1.setBackgroundResource(R.drawable.anim_icon1);
        anim1=(AnimationDrawable)btn1.getBackground();
        anim1.start();


    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.ibtn_color:
                Intent in1 = new Intent(menu3a6.this,coloresjuego.class);
                startActivity(in1);
                break;
        }

    }
}
