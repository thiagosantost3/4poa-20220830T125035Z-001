package br.nom.belo.marcio;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SenhaValidaRegEx {
    
    public boolean ehSenhaValida(String senha) {

        String expressao = "[a-zA-Z][a-zA-Z0-9]{5}";
        Pattern pattern = Pattern.compile( expressao);
        Matcher matcher = pattern.matcher( senha);
        return matcher.matches();
    }
}
