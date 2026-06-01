
import java.util.LinkedList;
import java.util.List;


public class Professor extends Pessoa{
    private Double salario;
    private List<Disciplina> disciplinas;

    Professor(){}
    Professor(Double salario, String nome, List<Disciplina> disciplinas){
        super(nome);
        this.salario = salario;
        this.disciplinas = disciplinas;
    }

    public Double getSalario(){return this.salario;}
    public List<Disciplina> getDisciplinas(){return this.disciplinas;}

    public void setSalario(Double salario){this.salario = salario;}
      
    public void adicionarDisciplina(List<Disciplina> disciplina){
        if (this.disciplinas == null){
            this.disciplinas = new LinkedList<>(disciplina);
            return;
        }

        /*for(int i = 0; i < disciplina.size(); i++){
            if (!this.disciplinas.contains(disciplina.get(i))){
                this.disciplinas.add(disciplina.get(i));
            }
        }*/

        for(Disciplina d : disciplina){
            if (!this.disciplinas.contains(d)){
                this.disciplinas.add(d);
            }            
        }
    }



    public void removerDisciplinas(List<Disciplina> disciplina){
        if (this.disciplinas == null){return;}
        this.disciplinas.removeAll(disciplina);
    }

    @Override
    public String toString(){
        return "\nNome do Professor: " + getNome() + "\n" +
                            "Disciplina: " + this.disciplinas + "\n" + 
                            "Salário: " + this.salario + " R$\n";
    }
}

