package city360.fernandosoares.com.city360;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MinhasSolicitacoesActivity extends AppCompatActivity {
    String itens[] = {"Requisição Férias Prêmio","Contagem de Tempo","Adiantamento de 13° salário","Transporte"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minhas_solicitacoes);
        final ListView lista = (ListView) findViewById(R.id.lstSolicitacoes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosicao = position;
                String valorClicado = lista.getItemAtPosition(position).toString();
                Toast.makeText(MinhasSolicitacoesActivity.this, valorClicado, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
