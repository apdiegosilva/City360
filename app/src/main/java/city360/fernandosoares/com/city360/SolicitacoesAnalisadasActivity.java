package city360.fernandosoares.com.city360;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ViewAnimator;

public class SolicitacoesAnalisadasActivity extends AppCompatActivity {
    String itens[] = {"Requisição Férias Prêmio","Contagem de Tempo","Adiantamento de 13° salário","Transporte"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solicitacoes_analisadas);
        final ListView lista = (ListView) findViewById(R.id.lstSolicitacoes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codigoPosicao = position;
                String valorClicado = lista.getItemAtPosition(position).toString();
                AlertDialog.Builder dialog;
                dialog = new AlertDialog.Builder(SolicitacoesAnalisadasActivity.this);
                //Titulo do Dialog
                dialog.setTitle("Situação");
                //Mensagem da Dialog
                dialog.setMessage("PENDENTE");
                //Não deixar cancelar a Dialog
                dialog.setCancelable(false);
                //Definindo ícone
                dialog.setIcon(android.R.drawable.ic_dialog_info);
                //Botao Negativo
                dialog.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                //Criar a Dialog
                dialog.create();
                //Mostrar a Dialog
                dialog.show();

            }
        });
    }
}
