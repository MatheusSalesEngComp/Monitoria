package Monitoria.Material_de_Estudo.Avaliacoes.Simulado.Resolucao;
public class Aluno extends Pessoa{
    private Disciplina disciplina;
    private int matricula;

    public Aluno(){}
    public Aluno(int matricula, String nome, Disciplina disciplina){
        super(nome);        
        this.disciplina = disciplina;
        this.matricula = matricula;
    }

    public Disciplina getDisciplina(){return this.disciplina;}
    public void setDiscplina (Disciplina disciplina){this.disciplina = disciplina;}
    
    public int getMatricula(){return this.matricula;}
    public final void setMatricula (final int matricula){
        if (this.matricula == 0) { 
            this.matricula = matricula;
        } 
        else {
            System.out.println("Erro: A matrícula não pode ser alterada!");
        }    
    }
    
    @Override
    public String toString(){
        return "\nNome do Aluno: " + getNome()
                      + "\nMatricula: " + this.matricula
                      +" \nDisciplina: ["+ this.disciplina + "]\n";
    }
    
}
