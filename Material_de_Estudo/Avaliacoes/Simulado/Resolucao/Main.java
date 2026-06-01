package Monitoria.Material_de_Estudo.Avaliacoes.Simulado.Resolucao;

import Monitoria.Material_de_Estudo.Avaliacoes.Simulado.Resolucao.*;

import java.util.List;

public class Main {
    public static void main(String[] args){

        Pessoa p2 = criarPessoa("Professor");
        Pessoa p1 = criarPessoa("Aluno");
        Pessoa p3 = criarPessoa("Aluno");
        Pessoa p4 = criarPessoa("Aluno");
        Pessoa p5 = criarPessoa("Aluno");
        Pessoa p6 = criarPessoa("Aluno");
        
        Disciplina d1 = new Disciplina("CRT034", "POO", 64);
        Disciplina d2 = new Disciplina("CRT035", "FUP", 96);
        Disciplina d3 = new Disciplina("CRT036", "BD", 64);


        if (p1 instanceof Aluno) {
            Aluno aluno1 = (Aluno) p1;
            aluno1.setDiscplina(d1);
            aluno1.setMatricula(586937);
            aluno1.setNome("Matheus");
        }
        if (p3 instanceof Aluno) {
            Aluno aluno2 = (Aluno) p3;
            aluno2.setDiscplina(d1);
            aluno2.setMatricula(789456);
            aluno2.setNome("Pedro");
        }
        if (p4 instanceof Aluno) {
            Aluno aluno3 = (Aluno) p4;
            aluno3.setDiscplina(d1);
            aluno3.setMatricula(456213);
            aluno3.setNome("João");
        }
        if (p5 instanceof Aluno) {
            Aluno aluno4 = (Aluno) p5;
            aluno4.setDiscplina(d2);
            aluno4.setMatricula(123456);
            aluno4.setNome("Maria");
        }
        if (p6 instanceof Aluno) {
            Aluno aluno5 = (Aluno) p6;
            aluno5.setDiscplina(d3);
            aluno5.setMatricula(412365);
            aluno5.setNome("Tiago");
        }

        
        if (p2 instanceof Professor) {
            Professor professor = (Professor) p2;
            professor.setNome("Alan");
            List<Disciplina> disciplinas = List.of(d1, d2);
            professor.adicionarDisciplina(disciplinas);
            professor.setSalario(8000.0);
        }
    
        
        System.out.println(p2);           
        System.out.println(p1);
        System.out.println(p3);           
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        
        Escola ufc = new Escola("UFC");
        ufc.lista(List.of(p2, p1, p3, p4, p5, p6));

        ufc.exibir();
    }

    public static Pessoa criarPessoa(String opcao){
        Pessoa p = null;
        if (opcao == "Aluno"){
            p = new Aluno();
        } 

        else{
            p = new Professor();
        }

        return p;
    } 
}
