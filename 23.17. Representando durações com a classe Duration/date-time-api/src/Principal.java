import java.time.Duration;

public class Principal {

    public static void main(String[] args) {
//        Duration duracao = Duration.ofHours(5);
//        Duration duracao = Duration.ofDays(2);
//        Duration duracao = Duration.parse("PT5H");
        Duration duracao = Duration.parse("P1DT5H"); //29 horas
        System.out.println(duracao);

        /*A partir da duração, adiciona mais 30 minutos*/
//        Duration duracaoCalculada = duracao.plus(Duration.ofMinutes(30));
//        Duration duracaoCalculada = duracao.plusMinutes(10);
        /*A partir da duração, multiplica por 3*/
//        Duration duracaoCalculada = duracao.multipliedBy(3);
        /*A partir da duração, dividi por 2 */
        Duration duracaoCalculada = duracao.dividedBy(2);

        System.out.println(duracaoCalculada);

        System.out.println(duracaoCalculada.getSeconds());

        System.out.println(duracaoCalculada.toMinutes());
        System.out.println(duracaoCalculada.toHours());

        System.out.println(duracaoCalculada.toMinutesPart());
        System.out.println(duracaoCalculada.toHoursPart());
    }

}
