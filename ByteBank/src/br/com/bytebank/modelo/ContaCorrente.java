package br.com.bytebank.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    private int agencia;

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    public ContaCorrente(int numeroConta, int agencia ){
        super(numeroConta);
        this.agencia = agencia;
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo()*0.01;
    }
}
