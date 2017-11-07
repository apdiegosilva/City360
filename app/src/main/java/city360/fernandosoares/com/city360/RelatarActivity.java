package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
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
    private ImageView imgCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatar);

        btnEnviarRelato = (Button) findViewById(R.id.btnEnviarSolicitacaoId);
        final Spinner spSetores = (Spinner) findViewById(R.id.spnSetores);
        Spinner spMotivos = (Spinner) findViewById(R.id.spnMotivos);
        btnLimpar = (Button) findViewById(R.id.btnLimparId);
        txtMensagem = (EditText) findViewById(R.id.txtMensagemId);
        imgCamera = (ImageView) findViewById(R.id.imgCameraId);

        imgCamera.setOnClickListener(new View.OnClickListener() {
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

        ArrayAdapter setores = ArrayAdapter.createFromResource(this,
                R.array.Setores, android.R.layout.simple_spinner_item);
        spSetores.setAdapter(setores);
        String texto = spSetores.getSelectedItem().toString();
        int a = spSetores.getSelectedItemPosition();

        ArrayAdapter motivos = ArrayAdapter.createFromResource(this,
                R.array.Motivos, android.R.layout.simple_spinner_item);
        spMotivos.setAdapter(motivos);

        btnEnviarRelato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RelatarActivity.this, "Relato enviado com Sucesso!",
                        Toast.LENGTH_LONG).show();
                startActivity(new Intent(RelatarActivity.this, PrincipalCidadaoActivity.class));
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
