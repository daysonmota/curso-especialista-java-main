import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Principal4 {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();

        //Somar 30 dias
        LocalDate dataProximaParcela = agora.plus(30, ChronoUnit.DAYS);
        LocalDate localDate = ChronoUnit.DAYS.addTo(agora, 30); //outra forma

        //Subtraindo 10 anos
        LocalDate minus = agora.minus(10, ChronoUnit.YEARS);
        //Subtraindo 10 anos
//        LocalDate minus = agora.minus(1, ChronoUnit.DECADES);

        System.out.println(agora);
        System.out.println(minus);
        System.out.println(dataProximaParcela);

    }
}
