import java.io.File;
import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException {
        File pasta = new File("/Users/daysonmota/Downloads/curso-especialista-java-main/28.06. Listando arquivos e diretórios/io-arquivos/docs").getCanonicalFile();

//        File[] arquivos = pasta.listFiles(); //lista arquivo ou pasta que está dentro da pasta docs
//        File[] arquivos = pasta.listFiles(File::isFile); //lista só arquivo
//        File[] arquivos = pasta.listFiles(File::isDirectory); //lista só diretorio
        File[] arquivos = pasta.listFiles((dir, nome) -> nome.startsWith("c")); //arquivo começa com letra c.

        if (arquivos != null) {
            for (File arquivo : arquivos) {
                System.out.println(arquivo.getName());
            }
        }
    }

}
