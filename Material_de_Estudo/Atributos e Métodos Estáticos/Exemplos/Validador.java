
/**
 * Representa o padrão "Método de Operação" (Utilitário).
 * Não guarda estado, apenas processa entradas e retorna resultados.
 */
public class Validador {

    // Método estático puro: não depende de atributos do objeto
    public static boolean validarEmail(String email) {
        if (email == null) return false;
        return email.contains("@") && (email.contains(".com")||email.contains(".br"));
    }

    public static boolean validarSenha(String senha) {
        // Regra simples: mínimo de 8 caracteres
        return senha != null && senha.length() >= 8;
    }
}