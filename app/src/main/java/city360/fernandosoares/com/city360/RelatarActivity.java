package city360.fernandosoares.com.city360;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class RelatarActivity extends AppCompatActivity {

    private Button btnEnviarRelato;
    private Button btnLimpar;
    private EditText txtMensagem;
    private ImageView imgElogio;
    private ImageView imgSolicitacao;
    private ImageView imgDenuncia;
    private ImageView imgReclamacao;
    private ImageView imgSugestao;
    private TextView txtMotivo;
    private Button btnCamera;
    private Switch swtAnonimo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatar);

        btnEnviarRelato = (Button) findViewById(R.id.btnEnviarSolicitacaoId);
        final Spinner spSetores = (Spinner) findViewById(R.id.spnSetores);
        final Spinner spMotivos = (Spinner) findViewById(R.id.spnMotivos);
        btnLimpar = (Button) findViewById(R.id.btnLimparId);
        txtMensagem = (EditText) findViewById(R.id.txtMensagemId);
        btnCamera = (Button) findViewById(R.id.btnCameraId);
        swtAnonimo = (Switch) findViewById(R.id.swtAnonimo);

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMensagem.setText("");
                Toast.makeText(RelatarActivity.this, "LIMPO !", Toast.LENGTH_SHORT).show();
            }
        });

        final ArrayAdapter setores = ArrayAdapter.createFromResource(this,R.array.Setores, android.R.layout.simple_spinner_item);
        spSetores.setAdapter(setores);

        ArrayAdapter motivos = ArrayAdapter.createFromResource(this,R.array.Motivos, android.R.layout.simple_spinner_item);
        spMotivos.setAdapter(motivos);

        btnEnviarRelato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String anonimo = "";
                if(swtAnonimo.isChecked()){
                    anonimo = "SIM";
                }
                else{
                    anonimo = "NÃO";
                }
                String mensagem = txtMensagem.getText().toString();
                String setor = spSetores.getSelectedItem().toString();
                String motivo = spMotivos.getSelectedItem().toString();
                if(setor.equals("") || motivo.equals("") || mensagem.equals("")){
                    Toast.makeText(RelatarActivity.this, "Favor inserir todos os dados !", Toast.LENGTH_SHORT).show();
                }else{
                    AlertDialog.Builder dialog;
                    dialog = new AlertDialog.Builder(RelatarActivity.this);
                    dialog.setTitle("Confirmar os dados ? ");
                    dialog.setMessage("Motivo : "+motivo+ "\n" +
                            "Setor : "+setor+"\n"+
                    "Mensagem : "+mensagem+"\n"+
                    "Anônimo: "+anonimo);
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
                            startActivity(new Intent(RelatarActivity.this, PrincipalCidadaoActivity.class));
                            Toast.makeText(RelatarActivity.this, "Relato enviado com Sucesso! Obrigado !", Toast.LENGTH_SHORT).show();
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
