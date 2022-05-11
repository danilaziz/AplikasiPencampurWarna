package me.gara.aplikasipencampurwarna;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView tvmerah;
    ImageView tvputih;
    Button btnButton;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tvmerah = (ImageView) findViewById(R.id.merah);
        //tvputih = (ImageView) findViewById(R.id.putih);
        btnButton = (Button) findViewById(R.id.KLIK_DISINI_GAESSS);

        //tvmerah.setImageDrawable("10");
        //tvputih.setImageDrawable(getColor(R.color.white));    }
    }

    public void isi(View view) {
        Intent intent = new Intent(MainActivity.this,isi.class);
        startActivity(intent);
    }
}