package br.com.bytebank.modelo;

public class GuardadorDeContas {
    private Conta[] refecencias;
    private int posicaoLivre;

    public GuardadorDeContas(){
        this.refecencias = new Conta[10];
        this.posicaoLivre = 0;

    }
    public  void  adiciona(Conta ref){
        this.refecencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }


    public int getQuantidadesDeElementos() {
        return this.posicaoLivre;
    }

    public Conta getReferencia(int pos) {
        return this.refecencias[pos];
    }
}
