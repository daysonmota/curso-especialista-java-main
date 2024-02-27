import com.algaworks.comercial.Cliente;
import com.algaworks.comercial.ServicoDeVenda;
import com.algaworks.comercial.Venda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Principal3 {

    public static void main(String[] args) {
        var servicoDeVenda = new ServicoDeVenda();
        List<Venda> vendas = servicoDeVenda.obterTodas();
//
//        List<String> descricoes = new ArrayList<>();
//        for (Venda venda : vendas) {
//            if (venda.isFechada()) {
//                for (Venda.Item item : venda.getItens()) {
//                    if (!descricoes.contains(item.descricao())) {
//                        descricoes.add(item.descricao());
//                    }
//                }
//            }
//        }
//
//        Collections.sort(descricoes);
//
//        for (String descricao : descricoes) {
//            System.out.println(descricao);
//        }

        System.out.println("---------------------");
        vendas.stream()
                .filter(Venda::isFechada)
                .flatMap(venda -> venda.getItens().stream()
                        .map(Venda.Item::descricao))
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

}
