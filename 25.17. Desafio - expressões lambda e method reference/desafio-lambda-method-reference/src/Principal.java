import java.math.BigDecimal;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
		var funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
		funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
		funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
		funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));

		// TODO remover funcionários inativos

		funcionarios.removeIf(Funcionario::isInativo);

		// TODO ordenar funcionários pelo valor do salário

		funcionarios.forEach(Funcionario::getSalario);

		// TODO iterar e imprimir funcionários usando o método estático imprimir

		funcionarios.forEach(Principal::imprimir);
	}

	private static void imprimir(Funcionario funcionario) {
		// TODO implementar a impressão do nome, salário e impostos (20%)

		BigDecimal percentualAumento = new BigDecimal("0.20");

		BigDecimal valorAlterado = funcionario.getSalario().multiply(BigDecimal.ONE.add(percentualAumento));

		System.out.println("Salário original: " + funcionario.getSalario());
		System.out.println("Percentual de aumento: " + percentualAumento.multiply(BigDecimal.valueOf(100)) + "%");
		System.out.println("Valor total com aumento: " + valorAlterado);

		System.out.println("----------------------");

	}

}