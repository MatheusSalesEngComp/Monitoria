package src.main.java.com.sistemadecursos.service;

public interface Matriculavel {
    public void matricular(String idCurso, String numeroCartao);

    public void cancelarMatricula(String idCurso, String numeroCartao, double valorReembolso);
}
