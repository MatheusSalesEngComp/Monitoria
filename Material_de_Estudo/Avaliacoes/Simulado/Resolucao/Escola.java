package Monitoria.Material_de_Estudo.Avaliacoes.Simulado.Resolucao;

import java.util.List;
import java.util.ArrayList;
public class Escola {
    private String nome;
    private List<Pessoa> listaGeral = new ArrayList<>();

    Escola(String nome){this.nome = nome;}

    public List<Pessoa> getListaGeral(){return this.listaGeral;}

    public void lista(List<Pessoa> pessoa){
        if (pessoa != null){
            listaGeral.addAll(pessoa);
        }
    }

    public List<Aluno> alunoEprofessor(Professor professor){
        List<Aluno> alunos = new ArrayList<>();
        for (Pessoa p : listaGeral){
            if (p  instanceof Aluno){
                Aluno aluno = (Aluno) p;
                if (professor.getDisciplinas().contains(aluno.getDisciplina())){
                    alunos.add(aluno);
                }
            }
        }
        return alunos;
    }

    public void exibir(){
        System.out.println("Escola: " + nome);
        for(Pessoa p : listaGeral){
            System.out.println("\t" + p.toString().replace("\n", "\n\t"));
        }

        for (Pessoa p : listaGeral){
            if (p instanceof Professor){
                Professor professor = (Professor) p;
                List<Aluno> alunos = alunoEprofessor(professor);
                System.out.println("Professor: " + professor.getNome());
                System.out.println("Alunos:");
                for (Aluno a : alunos){
                    System.out.println("\t" + a.getNome());
                }
            }
        }
    }
}
