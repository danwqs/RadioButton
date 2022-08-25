package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde;
    private CheckBox checkBranco;
    private CheckBox checkVermelho;

    //RadioButton
    private RadioButton sexoMasculino;
    private RadioButton sexoFeminino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResultado);

        //CheckBox
        checkVerde = findViewById(R.id.checkVerde);
        checkBranco = findViewById(R.id.checkBranco);
        checkVermelho = findViewById(R.id.checkVermelho);

        //RadioButton
        sexoFeminino = findViewById(R.id.radioButtonFeminino);
        sexoMasculino = findViewById(R.id.radioButtonMasculino);
    }

    public void radioButton() {

        if (sexoMasculino.isChecked()) {
            textoResultado.setText("Masculino");
        } else if (sexoFeminino.isChecked()) {
            textoResultado.setText("Feminino");
        }


    }

    public void enviar(View view) {

        radioButton();
        //checkbox();

        /*
        EditText campoNome = findViewById(R.id.editNome);
        TextInputEditText campoEmail = findViewById(R.id.editEmail);
        TextView textoResultado = findViewById(R.id.textResultado);

        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textoResultado.setText("nome: " + nome + " email: " + email);
        */

    }

    public void checkbox() {

        String texto = "";
        if (checkVerde.isChecked()) {
            texto = "Verde selecionado -";
        }
        if (checkBranco.isChecked()) {
            texto = texto + "Branco selecionado -";
        }
        if (checkVermelho.isChecked()) {
            texto = texto + "Vermelho selecionado - ";
        }

        textoResultado.setText(texto);

    }


}