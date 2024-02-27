import java.io.*;

public class Principal {

    public static void main(String[] args) {
        File arquivoOrigem = new File("/Users/daysonmota/Downloads/curso-especialista-java-main/28.14. Lendo arquivos texto de forma otimizada com BufferedReader/io-arquivos/docs/lista.txt");

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivoOrigem))) {
            String linha = null;

            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }
    }

}
