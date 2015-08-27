package app.example.juancarlos.com.pruebaactivitys;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class menu3a6 extends AppCompatActivity implements View.OnClickListener
{
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu3a6);
        btn1 = (Button) findViewById(R.id.btnJuegColor);
        btn1.setOnClickListener(this);

        btn2 = (Button) findViewById(R.id.btnJuegEncuen);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnJuegColor:
                Intent in1 = new Intent(menu3a6.this,coloresjuego.class);
                startActivity(in1);
                break;
        }

    }
}
