package city360.fernandosoares.com.city360;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class EsqueciSenhaActivity extends AppCompatActivity {

    private Button btnEnviar;
    private RadioButton rbtCidadao;
    private RadioButton rbtServidor;
    private TextView txtEmail;
    private RadioGroup rdgPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_senha);
        btnEnviar = (Button) findViewById(R.id.btnEnviarId);
        rbtCidadao = (RadioButton) findViewById(R.id.rbtCidadaoId);
        rbtServidor = (RadioButton) findViewById(R.id.rbtServidorId);
        txtEmail = (TextView) findViewById(R.id.txtEmail);
        rdgPerfil = (RadioGroup) findViewById(R.id.radioGrupoId);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = txtEmail.getText().toString().trim();
                Integer perfil = rdgPerfil.getCheckedRadioButtonId();
                if(email.equals("")){
                    Toast.makeText(EsqueciSenhaActivity.this, "Insira todos os dados antes de prosseguir!", Toast.LENGTH_SHORT).show();
                }else{
                    AlertDialog.Builder dialog;
                    dialog = new AlertDialog.Builder(EsqueciSenhaActivity.this);
                    dialog.setTitle("Confirmar os dados ? ");
                    dialog.setMessage("Email: "+email+"\n"+
                                    "Perfil: "+perfil);
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
                            if (rbtCidadao.isChecked()) {
                                Toast.makeText(EsqueciSenhaActivity.this, "E-mail de redefinição de senha enviado com Sucesso!",
                                        Toast.LENGTH_LONG).show();
                                startActivity(new Intent(EsqueciSenhaActivity.this, LoginCidadaoActivity.class));
                            }

                            if (rbtServidor.isChecked()){
                                Toast.makeText(EsqueciSenhaActivity.this, "E-mail de redefinição de senha enviado com Sucesso!",
                                        Toast.LENGTH_LONG).show();
                                startActivity(new Intent(EsqueciSenhaActivity.this, LoginServidorActivity.class));
                            }
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
