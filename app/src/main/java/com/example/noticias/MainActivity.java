package com.example.noticias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void anterior(View view){
        Toast.makeText(this,"Clicou no anterior",Toast.LENGTH_SHORT).show();
    }

    public void proximo(View view){
        Toast.makeText(this,"Clicou no próximo",Toast.LENGTH_SHORT).show();
    }
}