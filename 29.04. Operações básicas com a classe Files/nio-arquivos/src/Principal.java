import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) throws IOException {
        Path pastaDocs = Path.of("docs");
        Files.createDirectory(pastaDocs); // cria uma pasta só

        Path pastaFornecedores = Path.of("docs/contratos/fornecedores");
        Files.createDirectories(pastaFornecedores); // cria a hierarquia

        Path arquivoContrato = pastaFornecedores.resolve(Path.of("contrato-venda.txt"));
//        Files.createFile(arquivoContrato); //cria arquivo
        System.out.println(Files.exists(arquivoContrato));
    }

}
