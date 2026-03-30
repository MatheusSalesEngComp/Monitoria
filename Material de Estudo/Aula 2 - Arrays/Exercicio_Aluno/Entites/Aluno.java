package Entites;

public class Aluno {
    //Atributos 
    private String nome;
    private int matricula;

    //Costrutor
    public Aluno(String nomeAluno, int matriculaInteiro){
        this.nome = nomeAluno;
        this.matricula = matriculaInteiro;
    }

    //Métodos
    public String toString(){
        return "Aluno: " + this.nome + ", Matrícula: " + this.matricula;
    }
}   
