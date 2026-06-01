package Metodos_Atributos_Estaticos.Lista_7.Questoes_Praticas;


public class ContadorPalavra {

    /**
     * Conta palavras em uma String usando lógica estática.
     * @param texto String a ser analisada.
     * @return quantidade de palavras.
     */
    public static int contarPalavras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }
        // trim() limpa as bordas, \\s+ captura um ou mais espaços
        String[] palavras = texto.trim().split("\\s+");
        return palavras.length;
    }

        
}