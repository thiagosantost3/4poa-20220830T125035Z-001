package br.nom.belo.marcio;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.Before;

public class SenhaValidaRegExTest  {

    private SenhaValidaRegEx testador;

    @Before
    public void setUp() {

        testador = new SenhaValidaRegEx();
    }

    @Test
    public void testEhSenhaValida() {

        // ok: 6 caracteres letras
        assertTrue(  testador.ehSenhaValida( "abcdef"));
        // ok: 6 caracteres combinando letras e numeros
        assertTrue(  testador.ehSenhaValida( "a1c2e3"));
        // ok: 6 caracteres combinando letras maiusculas e numeros
        assertTrue(  testador.ehSenhaValida( "A1C2E3"));
        // não ok: mais que 6 caracteres
        assertFalse(  testador.ehSenhaValida( "abcdefg"));
        // não ok: menor que 6 caracteres
        assertFalse( testador.ehSenhaValida( "abcde"));
        // não ok: não comeca por letra
        assertFalse( testador.ehSenhaValida( "1bcdef"));
        // não ok: contém símbolos inválidos
        assertFalse( testador.ehSenhaValida( "ab@def"));
    }
}
