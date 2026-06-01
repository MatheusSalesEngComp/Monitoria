
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Curso curso1 = new CursoOnline("Java Avançado", 300.0, 30);
        Curso curso2 = new CursoOnline("Master MBA Executivo", 5000.0, 40);
        
        Curso curso3 = new WorkshopPresencial("Design Patterns", 200.0, "São Paulo");
        Curso curso4 = new WorkshopPresencial("UX Design", 150.0, "Rio de Janeiro");
        
        List<Curso> listaCursos = new ArrayList<>();
        listaCursos.add(curso1);
        listaCursos.add(curso2);
        listaCursos.add(curso3);
        listaCursos.add(curso4);

        for (Curso curso : listaCursos) {
            curso.exibirInfo();
            System.out.println("Preço Final: R$ " + curso.calcularPrecoFinal());
            System.out.println("-----------------------------");
        }

        Map<String, Curso> catalogoCursos = new HashMap<>();
        
        catalogoCursos.put("cur_java_Avancado", curso1);
        catalogoCursos.put("cur_Master", curso2);
        catalogoCursos.put("cur_DesignerPatterns", curso3);
        catalogoCursos.put("cur_ux", curso4);

        Matriculavel sistema = new SistemaMatricula(catalogoCursos);

        try {
            sistema.matricular("cur_java_Avancado", "1234567890123456"); // Sucesso!
            sistema.matricular("cur_ux", "123456789");
            sistema.matricular("cur_Master", "1234567890123456");
            sistema.matricular("cur_Inexistente", "1234567890123456");   
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try{
            sistema.cancelarMatricula("cur_java_Avancado", "1234567890123456", 250); // Sucesso!
            sistema.cancelarMatricula("cur_java_Avancado", "1234567890123456", 400.0);
            sistema.cancelarMatricula("cur_Inexistente", "1234567890123456", 200.0);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}