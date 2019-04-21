package com.example.smallassistant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bottomless;
    private EditText textNome;
    private EditText textSena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        bottomless = findViewById ( R.id.botaoEntrarId );
        textNome = findViewById ( R.id.textoNomeId );
        textSena = findViewById ( R.id.textoSenhaId );


        bottomless.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if ( textNome.getText ().toString ().equals ( "Iago") && textSena.getText ().toString ().equals ( "admin" )) {
                    Intent pagePrincipal = new Intent ( MainActivity.this, PaginaPrincipal.class );
                    startActivity ( pagePrincipal );
                    Toast.makeText ( getApplicationContext (), "Seja Bem Vindo " + textNome.getText ().toString (), Toast.LENGTH_LONG ).show ();
                    finish ();
                }else {
                    Toast.makeText ( getApplicationContext (), "Assinante não encontrado", Toast.LENGTH_LONG ).show ();
                }
            }
        } );

    }
}
