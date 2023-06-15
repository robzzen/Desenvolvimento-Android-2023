package devandroid.pires.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.pires.applistacurso.R;
import devandroid.pires.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("ROBSON");
        pessoa.setSobreNome("PIRES");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("11-99999999");
    }
}