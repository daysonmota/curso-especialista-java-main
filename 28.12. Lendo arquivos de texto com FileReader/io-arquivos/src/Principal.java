import java.io.*;

public class Principal {

    public static void main(String[] args) {
        File arquivoOrigem = new File("docs/contrato.txt");
        StringBuilder texto = new StringBuilder();

        try (Reader leitor = new FileReader(arquivoOrigem)) {
            char[] conteudo = new char[1000]; //1000 characheres para ler
            int quantidadeCaracteres;

            while ((quantidadeCaracteres = leitor.read(conteudo)) > 0) {
                /*
                * começa adiciona na posição 0 e concatena até o tamanho que consegue ler.
                * Se tiver só 500 characteres, só vai adicionar 500 characteres*/
                texto.append(conteudo, 0, quantidadeCaracteres);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro de I/O", e);
        }

        System.out.println(texto);
    }

}
