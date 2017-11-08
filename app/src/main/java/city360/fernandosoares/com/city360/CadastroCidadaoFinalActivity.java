package city360.fernandosoares.com.city360;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CadastroCidadaoFinalActivity extends AppCompatActivity {

    private Button btnConfirmarCadastro;
    private TextView txtNome;
    private TextView txtCpf;
    private TextView txtTelefone;
    private TextView txtCep;
    private TextView txtEndereco;
    private TextView txtNumero;
    private TextView txtBairro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cidadao_final);
        btnConfirmarCadastro = (Button) findViewById(R.id.btnConfirmarCadastroId);
        txtNome = (TextView) findViewById(R.id.txtNome);
        txtCpf = (TextView) findViewById(R.id.txtCPF);
        txtTelefone = (TextView) findViewById(R.id.txtTelefone);
        txtCep = (TextView) findViewById(R.id.txtCep);
        txtEndereco = (TextView) findViewById(R.id.txtEndereco);
        txtNumero = (TextView) findViewById(R.id.txtNumero);
        txtBairro = (TextView) findViewById(R.id.txtBairro);

        btnConfirmarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = txtNome.getText().toString().trim();
                String cpf = txtCpf.getText().toString().trim();
                String cep = txtCep.getText().toString().trim();
                String endereco = txtEndereco.getText().toString().trim();
                String numero = txtNumero.getText().toString().trim();
                String bairro = txtBairro.getText().toString().trim();
                String telefone = txtTelefone.getText().toString().trim();
                if(nome.equals("") || cpf.equals("") || cep.equals("") || endereco.equals("") || telefone.equals("")
                        || numero.equals("") || bairro.equals("")){
                    Toast.makeText(CadastroCidadaoFinalActivity.this, "Insira todos os dados antes de prosseguir", Toast.LENGTH_SHORT).show();
                }else{
                    AlertDialog.Builder dialog;
                    dialog = new AlertDialog.Builder(CadastroCidadaoFinalActivity.this);
                    dialog.setTitle("Confirmar os dados ? ");
                    dialog.setMessage("Nome: "+nome+ "\n" +
                            "CPF: "+cep+"\n"+
                            "Telefone: "+telefone+"\n"+
                            "CEP: "+cep+"\n"+
                            "Endereço: "+endereco+"\n"+
                            "Número: "+numero+"\n"+
                            "Bairro: "+bairro);
                    dialog.setCancelable(false);
                    dialog.setIcon(android.R.drawable.ic_dialog_info);
                    dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(CadastroCidadaoFinalActivity.this,"Cadastro Efetuado com Sucesso! Agora faça seu Login." , Toast.LENGTH_LONG).show();
                            startActivity(new Intent(CadastroCidadaoFinalActivity.this, LoginCidadaoActivity.class));
                        }
                    });
                    dialog.create();
                    dialog.show();

                }

            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
