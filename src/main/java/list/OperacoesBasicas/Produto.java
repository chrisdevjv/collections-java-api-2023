package main.java.list.OperacoesBasicas;

public class Produto {
    private String nomeProduto;
    private String descricao;
    private double price;

    public Produto(String nomeProduto, String descricao, double price) {
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.price = price;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return ("Produto: " + nomeProduto + "\n" + "Descrição: " + descricao + "\n" + "Preço: " + price + "\n" + "------------" + "\n");
    }
}
