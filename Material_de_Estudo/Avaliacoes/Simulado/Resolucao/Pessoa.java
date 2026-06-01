package Monitoria.Material_de_Estudo.Avaliacoes.Simulado.Resolucao;

public abstract class Pessoa {
    private String nome;

    public Pessoa(){}
    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome(){return this.nome;}
    public final void setNome(final String nome){this.nome = nome;}


    public abstract String toString();
}
