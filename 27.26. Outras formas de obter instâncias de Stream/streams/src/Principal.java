import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
//        String[] nomes = { "Maria", "Sebastião", "João" };
//        Arrays.stream(nomes) //Adiciona na Stream
//                .map(String::toUpperCase) //Coloca como maiúscula
//                .sorted() //ordena
//                .forEach(System.out::println); // imprimi

//        Stream.iterate(new BigDecimal("1000"), //Valor inicial
//                valor -> valor.compareTo(BigDecimal.ZERO) >= 0,
//                valor -> valor.subtract(new BigDecimal("10"))) // cada interação ele vai subtrair 10 em 10.
//                .forEach(System.out::println);

//        Stream<Integer> stream = Stream.empty(); //Criando Stream vazio


//        Stream.of(1, 2, 3,0)
//                .sorted()
//                .forEach(System.out::println); //Criando Stream com valor


//        int total = IntStream.of(1, 2, 3)
//                .sum();
//        System.out.println(total); //No IntStream já temos o sum

        /*Concatenando Stream*/
//        Stream<Integer> stream1 = Stream.of(1, 2, 3);
//        Stream<Integer> stream2 = Stream.of(9, 8, 7);
//        Stream.concat(stream1, stream2)
//                .forEach(System.out::println);

        /*Gerando Stream de um intervalo*/
//        IntStream.range(1, 10)
//                .forEach(System.out::println);

        /*Gera Stream de 1 a 10, o Skip ele imprimi de 6 até 10*/
        IntStream.rangeClosed(1, 10)
                .skip(5)
                .forEach(System.out::println);

//        Random random = new Random();
//        Stream.generate(() -> random.nextInt(9) + 1) //O Stream Generate gera infinito, mas eu escolhi gerar de 0 até 10
//                .distinct() //nao repetir
//                .limit(6) //limite de 6 numeros.
//                .forEach(System.out::println);
    }

}
