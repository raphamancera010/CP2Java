package models;

import enums.TipoSugestao;

public class Sugestao {
    private String usuario;
    private TipoSugestao tipo;
    private String mensagem;

    public Sugestao(String usuario, TipoSugestao tipo, String mensagem) {
        this.usuario = usuario;
        this.tipo = tipo;
        this.mensagem = mensagem;
    }

    public String getResumoSugestao() {
        return "[" + tipo + "] de " + usuario + ": " + mensagem;
    }
}
