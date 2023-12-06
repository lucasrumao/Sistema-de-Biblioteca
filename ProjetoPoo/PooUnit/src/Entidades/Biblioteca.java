package Entidades;

public abstract class Biblioteca {
    private String titulo;

    public Biblioteca(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public abstract void exibirDetalhes();
}