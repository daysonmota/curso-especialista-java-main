import java.io.*;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        /*Fazendo com Scanner*/
        //        InputStream inputStream = System.in;
//        Scanner scanner = new Scanner(inputStream);
//
//        String linha = null;
//        while (!(linha = scanner.nextLine()).equals("sair")) {
//            System.out.println("Você digitou: " + linha);
//        }

        /*Fazendo com BufferReader*/
//        InputStream inputStream = System.in;
//        BufferedReader leitor = new BufferedReader(new InputStreamReader(inputStream));
//
//        String linha = null;
//        while (!(linha = leitor.readLine()).equals("sair")) {
//            System.out.println("Você digitou: " + linha);
//        }

        /*Mais simples*/
        Scanner scanner = new Scanner(new FileInputStream("docs/lista.txt"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }

}
