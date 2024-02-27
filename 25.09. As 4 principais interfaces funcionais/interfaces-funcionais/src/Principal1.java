import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Principal1 {

    public static void main(String[] args) {

        /*Representa uma confirmação de teste*/
        Predicate<String> predicate = str -> str.startsWith("T");
        boolean comecaComT = predicate.test("Thiago");
        System.out.println(comecaComT);

        /*É passado um tipo e retorna outro tipo convertido  */
        Function<String, LocalDate> function = str -> LocalDate.parse(str);
        LocalDate data = function.apply("2023-09-13");
        System.out.println(data);

        /*É uma função que retorna um resultado */
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        LocalDateTime dataHora = supplier.get();
        System.out.println(dataHora);

        /*Representa uma operação que representa unico argumento do tipo e nao retorna nada*/
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Olá, mergulhador");
    }

}
