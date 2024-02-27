import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

//        boolean temProdutoNoEstoque = produtos.stream()
//                .peek(System.out::println)
//                .anyMatch(Produto::temEstoque); //qualquer um possui estoque
//        System.out.println(temProdutoNoEstoque);

//        boolean todosProdutoPossuemEstoque = produtos.stream()
//                .peek(System.out::println)
//                .allMatch(Produto::temEstoque); //todos elementos possui estoque
//        System.out.println(todosProdutoPossuemEstoque);

        boolean nenhumProdutoPossuiEstoque = produtos.stream()
                .peek(System.out::println)
                .noneMatch(Produto::temEstoque); // nenhum produto tem estoque, se tiver algum que tenha é false
        System.out.println(nenhumProdutoPossuiEstoque);
    }

}
