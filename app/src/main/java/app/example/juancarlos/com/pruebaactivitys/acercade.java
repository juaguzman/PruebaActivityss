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

        String font_path = "font/timkid.ttf";
        Typeface TF = Typeface.createFromAsset(getAssets(), font_path);
        tx = (TextView) findViewById(R.id.txtAcierto);
        tx.setTypeface(TF);


    }
}
