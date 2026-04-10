
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Iniciando Aplicação ===\n");

        // 1. Uso do Utilitário (Validação)
        String email = "aluno@universidade.br";
        if (Validador.validarEmail(email)) {
            System.out.println("E-mail validado com sucesso!");
        }
        else{
            System.out.println("E-mail inválido: " + email);
        }

        // 2. Uso do Estado Global (Tempo)
        GerenciadorTempo.iniciarCronometro();
        System.out.println("Cronômetro iniciado...");

        // 3. Uso do Objeto Permanente (Configuração)
        // Note que não usamos 'new', pedimos a instância para a classe
        ConfiguracaoSistema config = ConfiguracaoSistema.getInstancia();
        config.setVolumeSom(75);
        
        System.out.println("Configuração aplicada: Volume em " + config.getVolumeSom());
        
        // Simulação de verificação de tempo após as operações
        System.out.println("Tempo total de execução: " + GerenciadorTempo.getTempoDecorrido() + "ms");
    }
}