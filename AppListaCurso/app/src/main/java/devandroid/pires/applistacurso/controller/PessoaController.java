package devandroid.pires.applistacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.pires.applistacurso.model.Pessoa;

public class PessoaController {

    @NonNull
    @Override
    public String toString() {

        Log.d("MVC", "Controller Iniciada...");
        return super.toString();
    }

    public void salvar(Pessoa pessoa) {

        Log.d("MVC", "Salvo: "+pessoa.toString());
    }
}
