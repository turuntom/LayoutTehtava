package tomi.layouttehtava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button nappi1,nappi2,nappi3;
    private ImageView kuva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nappi1 = (Button) findViewById(R.id.button1);
        nappi2 = (Button) findViewById(R.id.button2);
        nappi3 = (Button) findViewById(R.id.button3);

        kuva = (ImageView) findViewById(R.id.imageView);


        View.OnClickListener kuuntelija1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nappi2.isEnabled() && nappi3.isEnabled()){
                    nappi2.setEnabled(false);
                    nappi3.setEnabled(false);
                }else{
                    nappi2.setEnabled(true);
                    nappi3.setEnabled(true);
                }

            }
        };

        nappi1.setOnClickListener(kuuntelija1);

        View.OnClickListener kuuntelija2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kuva.setVisibility(View.INVISIBLE);
            }
        };
        nappi2.setOnClickListener(kuuntelija2);

        View.OnLongClickListener kuuntelija3 = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                kuva.setVisibility(View.VISIBLE);
                return true;
            }
        };

        nappi3.setOnLongClickListener(kuuntelija3);

    }



}



//imageView.visibility = false true
//linearLyaout.visibility = fasle rue