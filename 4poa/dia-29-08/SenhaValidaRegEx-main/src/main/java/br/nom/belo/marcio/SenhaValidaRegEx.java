package br.nom.belo.marcio;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SenhaValidaRegEx {
    
    public boolean ehSenhaValida(String senha) {

        String expressao = "^(?:[1-9]\\d{1,3}|\\d)(?:[.,]\\d)?$";
        Pattern pattern = Pattern.compile( expressao);
        Matcher matcher = pattern.matcher( senha);
        return matcher.matches();
    }
}
