import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.WRITE;

public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João",
                LocalDate.of(2005, Month.MARCH, 2),
                new BigDecimal("25000"));

        System.out.println(funcionario);

        Path path = Path.of("/Users/daysonmota/Downloads/curso-especialista-java-main/30.03. Serializando objetos com ObjectOutputStream/serializacao/joao.ser");

        /*Usando API Clássica*/
//        try (var outputStream = new ObjectOutputStream(
//                new FileOutputStream(path.toFile()))) {
//            outputStream.writeObject(funcionario);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        /*Usando NIO*/
        try (var outputStream = new ObjectOutputStream(
                Files.newOutputStream(path, WRITE, CREATE))) {
            outputStream.writeObject(funcionario);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
