package br.com.victor.Modulo13.agregacao;

/**
 * @author Victor$
 * @date 31/08/2023$
 * Description:
 */
public class Programa {

    public static void main(String[] args) {
        Produto produtoTV = criarProduto(1L, 10d, "TV");
        Produto produtoCell = criarProduto(2L, 1000d, "Celular");

        Vendedor vendedor = criarVendedor("Renan", 10d);

        Comprador comprador = criarComprador("Gizelle", 2000d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTV);
        venda.add(produtoCell);

        venda.concretizarVenda();
        System.out.println(venda);
        venda.cancelarVenda();
        venda = null;
        System.out.println(venda);
        System.out.println(produtoTV.getNome());
    }

    private static Comprador criarComprador(String nome, double verba) {
        return new Comprador(nome, verba);
    }

    private static Vendedor criarVendedor(String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setNome(nome);
        vendedor.setComissao(comissao);

        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double valor, String nome) {
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);

        return produto;
    }

}
