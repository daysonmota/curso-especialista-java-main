import com.algaworks.io.FragmentadorDeArquivo;

import java.io.File;
import java.io.IOException;

public class Principal1 {

    public static void main(String[] args) {
        try {
            var fragmentador = new FragmentadorDeArquivo(
                    new File("/Users/daysonmota/Downloads/curso-especialista-java-main/28.18. Desafio - API clássica de IO/desafio-io-solucionado/arquivos/fotos/picanha.jpg"),
                    1024 * 40);
            fragmentador.fragmentar();
        } catch (IOException e) {
            System.out.println("Erro fragmentando arquivo");
            e.printStackTrace();
        }
    }

}
