import java.util.Arrays;

public class ArrayRef {

    public static void main(String[] args) {

        Conta[] conta = new Conta[5];
        
        Conta cc1 = new Conta();
        
        cc1.setId(1);
        cc1.setAgencia(222);
        cc1.setNumeroConta(4888);
        conta[0] = cc1;

        Conta cc2 = new Conta();

        cc2.setId(2);
        cc2.setAgencia(111);
        cc2.setNumeroConta(785);
        conta[1] = cc2;

        Conta cc3 = new Conta();

        cc3.setId(3);
        cc3.setAgencia(444);
        cc3.setNumeroConta(555);
        conta[2] = cc3;

        System.out.println(conta[0].getNumeroConta() );

        for(int i = 0; i < conta.length; i++ ){
            System.out.println(conta[i]);
        }


        for (Conta contas: conta
             ) {

            System.out.println(Arrays.toString(conta));

        }

    }

}
