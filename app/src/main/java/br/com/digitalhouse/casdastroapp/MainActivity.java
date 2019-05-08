package br.com.digitalhouse.casdastroapp;

import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editTextNome;
    EditText editTextEmail;
    EditText editTextEndereco;
    EditText editTextProfissao;
    Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        editTextNome = findViewById(R.id.editTextNome);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextEndereco = findViewById(R.id.editTextEndereco);
        editTextProfissao = findViewById(R.id.editTextProfissao);
        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = editTextNome.getText().toString();
                String email = editTextEmail.getText().toString();
                String endereco = editTextEndereco.getText().toString();
                String profissao = editTextProfissao.getText().toString();

                if (nome.equals("")) {
                    Toast.makeText(MainActivity.this, "Preencha o campo NOME, meu consagrado!", Toast.LENGTH_LONG).show();
                    return;
                }

                if (email.equals("")) {
                    Toast.makeText(MainActivity.this, "Preencha o campo EMAIL, puta que pariu!", Toast.LENGTH_LONG).show();
                    return;
                }

                if (!email.contains("@", ".com")) {
                    Toast.makeText(MainActivity.this, "Já viu e-mail sem @, mano?", Toast.LENGTH_LONG).show();
                    return;
                }

                if (endereco.equals("")) {
                    Toast.makeText(MainActivity.this, "Preencha o campo ENDEREÇO, bicho burro!", Toast.LENGTH_LONG).show();
                    return;
                }

                if (profissao.equals("")) {
                    Toast.makeText(MainActivity.this, "Agora entendi o motivo de você deixar esse campo em branco, seu BURRO!", Toast.LENGTH_LONG).show();
                    return;

                } else {
                    Toast.makeText(MainActivity.this, "Finalmente, seu bosta.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        });
    }
}
