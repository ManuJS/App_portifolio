package em.android.appportifolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void selecionarOpcao(View view) {

        Button button = (Button) view;
        String opcao = "Opção" + button.getText().toString();
        Toast.makeText(this, opcao, Toast.LENGTH_LONG).show();

    }
}
