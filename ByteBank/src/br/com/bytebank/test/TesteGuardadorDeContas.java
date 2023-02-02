package br.com.bytebank.test;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.GuardadorDeContas;


public class TesteGuardadorDeContas {

    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente(56, 55);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(112, 55);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadesDeElementos();
        System.out.println(tamanho );

        Conta ref =guardador.getReferencia(0);
        System.out.println(ref.getnumeroConta());
    }
}
