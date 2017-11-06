package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RelatarActivity extends AppCompatActivity {

    private Button btnEnviarRelato;
    private ImageView imgElogio;
    private ImageView imgSolicitacao;
    private ImageView imgDenuncia;
    private ImageView imgReclamacao;
    private ImageView imgSugestao;
    private TextView txtMotivo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatar);

        btnEnviarRelato = (Button) findViewById(R.id.btnEnviarSolicitacaoId);
        imgElogio = (ImageView) findViewById(R.id.imgElogioId);
        imgSolicitacao = (ImageView) findViewById(R.id.imgSolicitacaoId);
        imgDenuncia = (ImageView) findViewById(R.id.imgDenunciaId);
        imgReclamacao = (ImageView) findViewById(R.id.imgReclamacaoId);
        imgSugestao = (ImageView) findViewById(R.id.imgSugestaoId);
        txtMotivo = (TextView) findViewById(R.id.txtMotivoId);

        final Spinner spSetores = (Spinner) findViewById(R.id.spinnerId);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
                R.array.Setores, android.R.layout.simple_spinner_item);
        spSetores.setAdapter(adapter);
        String texto = spSetores.getSelectedItem().toString();
        int a = spSetores.getSelectedItemPosition();

        imgElogio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMotivo.setText("Elogio");
            }
        });

        imgSugestao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMotivo.setText("Sugestão");
            }
        });

        imgSolicitacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMotivo.setText("Solicitação");
            }
        });

        imgDenuncia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMotivo.setText("Denúncia");
            }
        });

        imgReclamacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtMotivo.setText("Reclamação");
            }
        });

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
