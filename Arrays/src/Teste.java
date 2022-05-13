import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {

        int[] nome = new int[5];

        nome[0] =12;
        nome[1] =10;
        nome[2] =89;
        nome[3] =35;
        nome[4] =250;

        int idade2= nome[3];

        for (int i = 0; i < nome.length; i++){
            System.out.println(nome[i]);
        }

        for (int lista : nome) {
            System.out.println(Arrays.toString(nome).length());
        }

        System.out.println(idade2);

    }

}
