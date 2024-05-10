package com.example.prototipos_de_tela;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.tela_login);



    }

    public void CarregarLogin(View view){

        setContentView(R.layout.tela_login);
    }

    public void CarregarCadastro(View view){
        setContentView(R.layout.activity_main);
    }

    public void CarregarTelaPrincipal(View view){
        setContentView(R.layout.calendario);
    }

    public void CarregarConfiguracoes(View view){
        setContentView(R.layout.tela_configuracoes);
    }

    public void CarregarNotificacoes(View view){
        setContentView(R.layout.tela_notificacao);
    }

    public void CarregarAgendamento(View view){
        setContentView(R.layout.tela_agendar);
    }
}