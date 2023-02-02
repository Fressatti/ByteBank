package br.com.bytebank.modelo;

import java.util.Random;

public abstract class Conta {
    private double saldo;
    private int agencia = 001;
    private int numeroConta;
    Cliente titular;
    Random random = new Random();

    public Conta( int numeroConta){

        this.numeroConta =numeroConta;
        this.saldo= 0 ;
    }


    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    private void setAgencia(int agencia) {
        if( agencia <= 0){
            System.out.println("Não Pode valor 0");
            return;
        } else {
            this.agencia = agencia;
        }
    }

    public int getnumeroConta(){
        return numeroConta;
    }

    public void setnumeroConta(int numeroConta){
        if( numeroConta <= 0) {
            System.out.println("Não Pode valor 0");
        }else {
            this.numeroConta = numeroConta;
        }
    }
    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
        destino.deposita(valor);
    }


    }
