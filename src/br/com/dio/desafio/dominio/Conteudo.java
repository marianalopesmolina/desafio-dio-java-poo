package br.com.dio.desafio.dominio;

// HERANÇA: Classe "Conteudo" criada para que seja estendida e seus atributos
// e métodos sejam implementados nas classes filhas sem repetição de código.
// Classe definida como "abstrata" para evitar instanciamento.
public abstract class Conteudo {

//    Todas as instâncias "Conteudo" serão criadas com a classe "XP_PADRAO"
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

//    Classes que estendem de "Conteudo" implementarão obrigatoriamente este método
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
