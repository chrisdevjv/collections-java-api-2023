package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Produto> produtoList;

    public CarrinhoCompras(){
        this.produtoList = new ArrayList<>();
    }

    public void adicionarProduto(String nomeProduto, String descricao, double price) {
        produtoList.add(new Produto(nomeProduto, descricao, price));
    }


    public void removerProduto(String nomeProduto) {
        List<Produto> produtosParaRemover = new ArrayList<>();
        for (Produto p : produtoList) {
            if (p.getNomeProduto().equalsIgnoreCase(nomeProduto)){
                produtosParaRemover.add(p);
            }
        }
        produtoList.removeAll(produtosParaRemover);
    }

    public int obterNumeroTotalProdutos() {
        return produtoList.size();
    }

    public void obterNomeProdutos() {
        System.out.println(produtoList);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        System.out.println("O número total de produtos no carrinho é: " + carrinho.obterNumeroTotalProdutos());

        carrinho.adicionarProduto("relogio", "relogio digital smartwatch android", 800.0);
        carrinho.adicionarProduto("teclado gamer", "teclado para pc gamer com rgb", 450.0);
        carrinho.adicionarProduto("monitor", "monitor gamer 200hz", 1000.0);

        System.out.println("O número total de produtos no carrinho é: " + carrinho.obterNumeroTotalProdutos());

        carrinho.removerProduto("teclado gamer");
        System.out.println("O número total de produtos no carrinho é: " + carrinho.obterNumeroTotalProdutos());

        carrinho.obterNomeProdutos();
    }
}
