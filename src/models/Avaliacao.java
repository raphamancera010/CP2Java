package models;

public class Avaliacao {
    private String usuario;
    private int nota; // de 1 a 5
    private String comentario;

    public Avaliacao(String usuario, int nota, String comentario) {
        this.usuario = usuario;
        this.nota = nota;
        this.comentario = comentario;
    }

    public String getResumoAvaliacao() {
        return usuario + " avaliou com nota " + nota + ": " + comentario;
    }
}
