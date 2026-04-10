
/**
 * Representa o padrão de "Estado Global Compartilhado".
 * Usa o static para que todos os objetos consultem o mesmo cronômetro.
 */
public class GerenciadorTempo {
    // Atributo estático: o valor é o mesmo para todo o sistema
    private static long tempoInicial;

    public static void iniciarCronometro() {
        // Guarda o tempo atual em milissegundos
        tempoInicial = System.currentTimeMillis();
    }

    public static long getTempoDecorrido() {
        // Calcula a diferença desde o início
        return System.currentTimeMillis() - tempoInicial;
    }
}