import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametro1 = scan.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametro2 = scan.nextInt();

        try {
            contar(parametro1, parametro2);
        }catch (ParametroInvalidoException e){
            e.printStackTrace();
        }
    }

    private static void contar(int parametro1, int parametro2) throws ParametroInvalidoException{

        if(parametro1 > parametro2)
            throw new ParametroInvalidoException("Primeiro parametro não pode ser maior que o segundo");

        int contagem = -(parametro1 - parametro2);
        for (int i = 0; i <= contagem; i++) {
            System.out.println("Imprimindo número " + i);
        }
    }
}