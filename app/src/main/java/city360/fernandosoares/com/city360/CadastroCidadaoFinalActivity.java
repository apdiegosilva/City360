package city360.fernandosoares.com.city360;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CadastroCidadaoFinalActivity extends AppCompatActivity {

    private Button btnConfirmarCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_cidadao_final);
        btnConfirmarCadastro = (Button) findViewById(R.id.btnConfirmarCadastroId);

        btnConfirmarCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CadastroCidadaoFinalActivity.this,"Cadastro Efetuado com Sucesso! Agora faça seu Login." , Toast.LENGTH_LONG).show();
                startActivity(new Intent(CadastroCidadaoFinalActivity.this, LoginCidadaoActivity.class));
            }
        });

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
