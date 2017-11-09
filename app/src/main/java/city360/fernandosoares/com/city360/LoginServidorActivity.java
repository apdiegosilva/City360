package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginServidorActivity extends AppCompatActivity {

    private Button btnAcessar;
    private TextView txtEsqueciSenha;
    private EditText txtcpf;
    private EditText txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_servidor);

        btnAcessar = (Button) findViewById(R.id.btnAcessoServidorId);
        txtEsqueciSenha = (TextView) findViewById(R.id.txtEsqueciSenhaId);
        txtcpf = (EditText) findViewById(R.id.txtCPF);
        txtSenha = (EditText) findViewById(R.id.txtSenhaId);

        txtEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginServidorActivity.this, EsqueciSenhaActivity.class));
            }
        });


        btnAcessar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String senha = txtSenha.getText().toString().trim();
                String cpf = txtcpf.getText().toString().trim();
                if(cpf.equals("") || senha.equals("")){
                    Toast.makeText(LoginServidorActivity.this, "Digite todos os dados antes de prosseguir", Toast.LENGTH_SHORT).show();
                }else{
                    startActivity(new Intent(LoginServidorActivity.this, PrincipalServidorActivity.class));
                }

            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
