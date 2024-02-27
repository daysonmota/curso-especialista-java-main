import java.io.File;

public class Principal {

    public static void main(String[] args) {
        File pasta1 = new File("docs");
        File pasta2 = new File("io-arquivos/docs");
        File arquivo1 = new File(pasta1, "contrato.txt");

//        System.out.println(pasta1.renameTo(pasta2));
        System.out.println(arquivo1.delete());
//        System.out.println(pasta2.delete());
    }

}
