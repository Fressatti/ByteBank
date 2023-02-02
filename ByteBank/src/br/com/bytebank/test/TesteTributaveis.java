package br.com.bytebank.test;

import br.com.bytebank.modelo.CalculadorImposto;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.SeguroDeVida;

public class TesteTributaveis {
    public static void main(String[] args) {
         ContaCorrente cc = new ContaCorrente(55,20);
         cc.deposita(100);
         SeguroDeVida Seguro = new SeguroDeVida();
         CalculadorImposto Calculadora = new CalculadorImposto();
         Calculadora.registra(cc);
         Calculadora.registra(Seguro);
        System.out.println(Calculadora.getTotalImposto());

     }
}
