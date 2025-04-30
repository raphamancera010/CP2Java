package models;

public class Bolsa extends Produto {
    private String tipo;
    private double capacidadeLitros;
    private boolean impermeavel;

    public Bolsa(String nome, String marca, double preco, String descricao, String tipo, double capacidadeLitros, boolean impermeavel) {
        super(nome, marca, preco, descricao);
        this.tipo = tipo;
        this.capacidadeLitros = capacidadeLitros;
        this.impermeavel = impermeavel;
    }

    @Override
    public String getDetalhesTecnicos() {
        return "Tipo: " + tipo +
                " | Capacidade: " + capacidadeLitros + "L" +
                " | Impermeável: " + (impermeavel ? "Sim" : "Não");
    }
}
