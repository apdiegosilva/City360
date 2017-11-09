package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginCidadaoActivity extends AppCompatActivity {

    private Button btnAcessar;
    private TextView CriarConta;
    private TextView EsqueciSenha;
    private TextView cpf;
    private TextView senha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_cidadao);

        btnAcessar = (Button) findViewById(R.id.btnAcessoCidadaoId);
        CriarConta = (TextView) findViewById(R.id.txtCriarContaId);
        EsqueciSenha = (TextView) findViewById(R.id.txtEsqueciSenhaId);
        cpf = (TextView) findViewById(R.id.txtCPF);
        senha = (TextView) findViewById(R.id.txtSenhaId);

        btnAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String senhaDigitada = senha.getText().toString().trim();
                String cpfDigitado = cpf.getText().toString().trim();
                if (senhaDigitada.equals("") || cpfDigitado.equals("")){
                    Toast.makeText(LoginCidadaoActivity.this, "Digite todos os dados antes de prosseguir !", Toast.LENGTH_SHORT).show();
                }else{
                    startActivity(new Intent(LoginCidadaoActivity.this, PrincipalCidadaoActivity.class));
                }
                    
                
            }
        });

        EsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginCidadaoActivity.this, EsqueciSenhaActivity.class));
            }
        });
        CriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity (new Intent(LoginCidadaoActivity.this, CadastroCidadaoActivity.class));

            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
