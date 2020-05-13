package com.diogopinto.loginauthmanual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.diogopinto.loginauthmanual.controle.AutenticacaoFirebase;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }

    @Override
    public void onStart(){
        super.onStart();

        if (AutenticacaoFirebase.getUsuarioConectado()!=null){
            startActivity(new Intent(this, HomePageActivity.class));
        }
    }

    public void login(View view){

    }

    public void criarConta(View view){

    }
}
