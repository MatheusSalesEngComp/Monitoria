package Metodos_Atributos_Estaticos.Lista_7.Questoes_Praticas;

public class Calculadora {
    private static int contadorOperacoes;
    
    public static int getContadorOperacoes() {
        return contadorOperacoes;
    }   
    
    public static void resetarContador() {
        contadorOperacoes = 0;
    }
    
    public static int somar(int a, int b) {
        contadorOperacoes++;
        return a + b;
    }

    public static int subtrair(int a, int b) {
        contadorOperacoes++;
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        contadorOperacoes++;
        return a * b;
    }

    public static int dividir(int a, int b) {
        contadorOperacoes++;
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

}
