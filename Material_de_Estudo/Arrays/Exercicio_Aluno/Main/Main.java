package Main;
import Entites.Aluno;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //*********Instância de uma classe
        Aluno aluno1 = new Aluno("João", 123456);
        String info = aluno1.toString();
        System.out.println(info);

        //Criando um array de objetos
        List<Aluno> alunos = new ArrayList<>();
        
        alunos.add(new Aluno("Pedro", 987654));
        alunos.add(new Aluno("Maria", 147852));

        //Mostrar cada objeto do array
        for (Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }
}
