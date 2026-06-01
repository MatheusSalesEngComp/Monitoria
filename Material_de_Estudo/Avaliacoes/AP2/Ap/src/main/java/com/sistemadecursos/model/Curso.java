package src.main.java.com.sistemadecursos.model;
public abstract class Curso {
    private String titulo;
    private Double preco;

    public Curso(String titulo, Double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {return titulo;}
    public Double getPreco() {return preco;}

    public abstract Double calcularPrecoFinal();

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Preço: R$ " + preco);
    }
}