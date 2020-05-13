package com.diogopinto.loginauthmanual.controle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AutenticacaoFirebase {

    private static FirebaseAuth autenticacao;
    private static FirebaseUser usuarioConectado;

    public static FirebaseAuth getAutenticacaoFirebase(){
        if (autenticacao==null){
            autenticacao = FirebaseAuth.getInstance();
        }
        return autenticacao;
    }

    public static FirebaseUser getUsuarioConectado(){
        if (usuarioConectado==null){
            usuarioConectado = getAutenticacaoFirebase().getCurrentUser();
        }
        return usuarioConectado;
    }
}
