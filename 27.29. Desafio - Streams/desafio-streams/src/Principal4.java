import com.algaworks.comercial.ServicoDeVenda;
import com.algaworks.comercial.Venda;

import java.math.BigDecimal;
import java.util.List;

public class Principal4 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();

        BigDecimal totalVendas = BigDecimal.ZERO;
        for (Venda venda : vendas) {
            if (venda.isFechada()) {
                totalVendas = totalVendas.add(venda.getValorTotal());
            }
        }

        System.out.println(totalVendas);

        System.out.println("---------");


        BigDecimal ValorTotal = vendas.stream()
                .filter(Venda::isFechada)
                .map(Venda::getValorTotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(ValorTotal);
    }

}
