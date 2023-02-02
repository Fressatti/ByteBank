package br.com.bytebank.test;

import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;
import br.com.bytebank.modelo.SaldoInsuficienteException;

public class TesteContas {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente cc = new ContaCorrente(111,55);


        cc.deposita(500);
        ContaPoupanca cp = new ContaPoupanca(2528);
        cp.saca(500);
        cc.transfere(500,cp );
        System.out.println("cc "  +cc.getSaldo()+ "\n"+ cc.getnumeroConta() +"\n"  + cc.getAgencia());
        System.out.println("cp " +cp.getSaldo()+ "\n" +cp.getnumeroConta() + "\n"  + cp.getAgencia());
        }
        }
