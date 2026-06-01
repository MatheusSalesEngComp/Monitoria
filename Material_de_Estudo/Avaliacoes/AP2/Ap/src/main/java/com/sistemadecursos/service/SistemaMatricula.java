import java.util.Map;

import src.main.java.com.sistemadecursos.exceptions.*;
import src.main.java.com.sistemadecursos.model.*;

public class SistemaMatricula  implements Matriculavel {
    private Map<String, Curso> catalogo;


    public SistemaMatricula(Map<String, Curso> catalogo) {
        this.catalogo = catalogo;
    }

    @Override
    public void matricular(String idCurso, String numeroCartao) throws CursoNaoEncontradoException, CartaoInvalidoException, PagamentoRecusadoException {
        Curso curso = catalogo.get(idCurso);
        double valorCurso;
        
        
        if (idCurso == null || idCurso.trim().isEmpty()){
            throw new CursoNaoEncontradoException("Curso não encontrado");
        }
        
        if (!catalogo.containsKey(idCurso)){
            throw new CursoNaoEncontradoException("Curso não encontrado"); 
        }
        
        if (numeroCartao.length() < 16){
            throw new CartaoInvalidoException("Cartão inválido");
        }
        
        valorCurso = curso.calcularPrecoFinal();

        if (valorCurso > 1000){
            throw new PagamentoRecusadoException("Pagamento recusado");
        }
        
        System.out.println("Matrícula realizada com sucesso para o curso: " + idCurso +
        "\nValor pago: R$ " + valorCurso);
    }

    @Override
    public void cancelarMatricula(String idCurso, String numeroCartao, double valorReembolso) {
        Curso curso = catalogo.get(idCurso);

        if (idCurso == null || idCurso.trim().isEmpty()){
            throw new CursoNaoEncontradoException("Curso não encontrado");
        }
        if (!catalogo.containsKey(idCurso)){
            throw new CursoNaoEncontradoException("Curso não encontrado");
        }
        if (numeroCartao.length() < 16){
            throw new CartaoInvalidoException("Cartão inválido");
        }
        if (valorReembolso < 0 || valorReembolso != catalogo.get(idCurso).calcularPrecoFinal()){
            throw new PagamentoRecusadoException("Valor de reembolso inválido");
        }

        System.out.println("Matrícula cancelada para o curso: " + curso.getTitulo() +
                           "\nValor reembolsado: R$ " + valorReembolso +
                           "\nReembolso processado para o cartão: ****" +  numeroCartao.substring(numeroCartao.length() - 4));

        /*System.out.print("\nReembolso processado para o cartão: ");
        System.out.print("****");
        for (int i = numeroCartao.length() - 4; i < numeroCartao.length(); i++) {
            System.out.print(numeroCartao.charAt(i)); 
        }*/
    }
    
}


