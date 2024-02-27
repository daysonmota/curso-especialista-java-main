import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
//        LocalDate dataHoje = LocalDate.now();
//        System.out.println(dataHoje);

//        LocalDate dataNascimento = LocalDate.of(1981, 9, 13);
//        System.out.println(dataNascimento);

        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate localDate = now.withYear(2030);

        System.out.println(localDate);
        LocalDate diaDoProgramador = LocalDate.ofYearDay(2022, 256);
        System.out.println(diaDoProgramador);
    }

}
