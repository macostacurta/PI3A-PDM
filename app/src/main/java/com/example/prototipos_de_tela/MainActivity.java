package com.example.prototipos_de_tela;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tela_agendar);

    }

    public void loadLinearLayout(View view){
        setContentView(R.layout.tela_login);
    }

    public void CarregarCadastro(View view){
        setContentView(R.layout.activity_main);
    }



}