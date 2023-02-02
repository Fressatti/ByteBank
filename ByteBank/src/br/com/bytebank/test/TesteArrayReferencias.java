package  br.com.bytebank.test;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayReferencias  {

      public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(11,22);
        ContaCorrente cc2 = new ContaCorrente(22,11);

        contas[0] = cc1;
        contas[1] = cc2;

        System.out.println(contas[0].getnumeroConta());

    }

}