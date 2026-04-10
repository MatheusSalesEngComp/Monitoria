package Metodos_Atributos_Estaticos.Lista_7.Questoes_Praticas;

/**
 * Classe de log que mantém registro acumulado estaticamente.
 */
public class Logger {

    // Atributo estático que mantém o log vivo na memória da classe
    private static String logAcumulado = "--- INÍCIO DO LOG ---\n";

    public static void adicionarInfo(String mensagem) {
        logAcumulado += "[INFO]: " + mensagem + "\n";
    }

    public static void adicionarAviso(String mensagem) {
        logAcumulado += "[AVISO]: " + mensagem + "\n";
    }

    public static void adicionarErro(String mensagem) {
        logAcumulado += "[ERRO]: " + mensagem + "\n";
    }

    public static String getHistoricoLog() {
        return logAcumulado;
    }

    
       
}