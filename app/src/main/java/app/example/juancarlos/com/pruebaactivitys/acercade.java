package app.example.juancarlos.com.pruebaactivitys;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class acercade extends AppCompatActivity {
    private TextView tx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acerca);


        tx = (TextView) findViewById(R.id.txt_AcercaDe);
        String font_path = "font/timkid.ttf";
        Typeface tf = Typeface.createFromAsset(getAssets(), font_path);
        tx.setTypeface(tf);
        //Typeface TF = Typeface.createFromAsset(getAssets(), font_path);

        //tx.setTypeface(TF);


    }
}
