package models;

public abstract class Produto {
    protected String nome;
    protected String marca;
    protected double preco;
    protected String descricao;

    public Produto(String nome, String marca, double preco, String descricao) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
        this.descricao = descricao;
    }

    public abstract String getDetalhesTecnicos();

    public String getInformacoesAdicionais() {
        return "Marca: " + marca + " | Preço: R$" + preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void aplicarDesconto(double percentual) {
        preco -= preco * (percentual / 100);
    }

    public boolean estaEmPromocao() {
        return preco < 100;
    }

    public void atualizarDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }
}
