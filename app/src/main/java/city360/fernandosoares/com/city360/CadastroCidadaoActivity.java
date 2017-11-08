package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class CadastroCidadaoActivity extends AppCompatActivity {

    private Button btnCadastrar;
    private TextView txtCpf;
    private TextView txtSenha;
    private TextView txtConfirmaSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cidadao);
        btnCadastrar = (Button) findViewById(R.id.btnCadastrarId);
        txtCpf = (TextView) findViewById(R.id.txtCpfId);
        txtSenha = (TextView) findViewById(R.id.txtSenhaId);
        txtConfirmaSenha = (TextView) findViewById(R.id.txtConfirmarSenhaId);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cpf = txtCpf.getText().toString().trim();
                String senha = txtSenha.getText().toString().trim();
                String confirmarSenha = txtConfirmaSenha.getText().toString().trim();
                if(cpf.equals("") || senha.equals("") || confirmarSenha.equals("")){
                    Toast.makeText(CadastroCidadaoActivity.this, "Preecha todos os campos antes de prosseguir", Toast.LENGTH_SHORT).show();
                }else if(! senha.equals(confirmarSenha)){
                    Toast.makeText(CadastroCidadaoActivity.this, "As senhas estão diferentes, confira !", Toast.LENGTH_SHORT).show();
                }
                else{
                    startActivity(new Intent(CadastroCidadaoActivity.this, CadastroCidadaoFinalActivity.class));
                }

            }
        });
            }
}
