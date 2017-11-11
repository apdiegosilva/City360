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
import android.widget.Spinner;
import android.widget.Toast;

public class SolicitarAtendimentoActivity extends AppCompatActivity {


    private Button btnEnviarSolicitacao;
    private Button imgCamera;
    private Button btnLimpar;
    private EditText txtFundamentacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitar_atendimento);

        btnEnviarSolicitacao = (Button) findViewById(R.id.btnEnviarSolicitacaoId);
        imgCamera = (Button) findViewById(R.id.btnCameraId);
        btnLimpar = (Button) findViewById(R.id.btnLimpar);
        txtFundamentacao = (EditText) findViewById(R.id.txtFundamentacao);
        final Spinner spTipoSolicitacao = (Spinner) findViewById(R.id.spinnerId);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.TipoSolicitacao, android.R.layout.simple_spinner_item);
        spTipoSolicitacao.setAdapter(adapter);
        String texto = spTipoSolicitacao.getSelectedItem().toString();
        int a = spTipoSolicitacao.getSelectedItemPosition();
        
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFundamentacao.setText("");
                Toast.makeText(SolicitarAtendimentoActivity.this, "LIMPO!", Toast.LENGTH_SHORT).show();
            }
        });

        imgCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
            }
        });
        btnEnviarSolicitacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fundamentacao = txtFundamentacao.getText().toString();
                String solicitacao = spTipoSolicitacao.getSelectedItem().toString();
                if (fundamentacao.equals("") || solicitacao.equals("")) {
                    Toast.makeText(SolicitarAtendimentoActivity.this, "Favor inserir todos os dados !", Toast.LENGTH_SHORT).show();
                } else {
                    AlertDialog.Builder dialog;
                    dialog = new AlertDialog.Builder(SolicitarAtendimentoActivity.this);
                    dialog.setTitle("Confirmar os dados ? ");
                    dialog.setMessage("Solicitação : " + solicitacao + "\n" +
                            "Fundamentação : " + fundamentacao);
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
                            startActivity(new Intent(SolicitarAtendimentoActivity.this, PrincipalCidadaoActivity.class));
                            Toast.makeText(SolicitarAtendimentoActivity.this, "Solicitação realizada com Sucesso! Obrigado !", Toast.LENGTH_SHORT).show();
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
