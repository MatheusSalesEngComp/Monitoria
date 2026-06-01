package Metodos_Atributos_Estaticos.Lista_7.Questoes_Praticas;

public class ConversorMoeda {

    // Atributos estáticos para as taxas (valores fictícios para exemplo)
    public static double taxaDolar = 5.00;
    public static double taxaEuro = 5.40;

    public static double converterRealParaDolar(double reais) {
        return reais / taxaDolar;
    }

    public static double converterDolarParaReal(double dolares) {
        return dolares * taxaDolar;
    }

    public static double converterRealParaEuro(double reais) {
        return reais / taxaEuro;
    }

}