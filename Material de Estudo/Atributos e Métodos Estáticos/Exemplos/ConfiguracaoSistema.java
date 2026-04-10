
/**
 * Representa o padrão "Objeto Permanente" (Singleton).
 * Garante que exista apenas uma instância de configuração no Heap.
 */
public class ConfiguracaoSistema {
    // Referência única guardada na memória de classe (Metaspace)
    private static ConfiguracaoSistema instancia;

    private int volumeSom;
    private String temaInterface;

    // Construtor privado impede o uso de 'new' fora desta classe
    private ConfiguracaoSistema() {
        this.volumeSom = 50;
        this.temaInterface = "Escuro";
    }

    // Método estático para obter a instância única
    public static synchronized ConfiguracaoSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }

    // Métodos de instância para gerenciar os dados do objeto
    public int getVolumeSom() { return volumeSom; }
    public void setVolumeSom(int volume) { this.volumeSom = volume; }
    
    public String getTemaInterface() { return temaInterface; }
    public void setTemaInterface(String tema) { this.temaInterface = tema; }
}
