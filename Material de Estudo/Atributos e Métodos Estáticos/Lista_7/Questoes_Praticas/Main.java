package Metodos_Atributos_Estaticos.Lista_7.Questoes_Praticas;

public class Main {
    public static void main(String[] args){
        //Qestão 12: Contar palavras em uma String usando lógica estática.
        System.out.println("Questão 12: Contar palavras em uma String usando lógica estática.");      
        String frase = "  Java   é uma linguagem poderosa  ";
        int total = ContadorPalavra.contarPalavras(frase);
        
        System.out.println("Texto analisado: \"" + frase + "\"");
        System.out.println("Total de palavras: " + total + "\n");
    
        //--------------------------------------------------------------------------
        //Questão 13: Criar uma calculadora com métodos estáticos e um contador de operações.
        System.out.println("Questão 13: Criar uma calculadora com métodos estáticos e um contador de operações.");
        // Forma padrão de definir um objeto
        Calculadora calc = new Calculadora();
        
        //Modo de chamar um método estático: sem criar um objeto, usando a classe diretamente
        System.out.println(Calculadora.somar(7, 4));

        //Note que é possível chamar o método estático passando um objeto.
        System.out.println(calc.somar(4,5));
    
        //--------------------------------------------------------------------------
        //Questão 14: Implementar um sistema de log que acumula mensagens usando métodos estáticos.
        System.out.println("\nQuestão 14: Implementar um sistema de log que acumula mensagens usando métodos estáticos.");

        Logger.adicionarInfo("Sistema iniciado com sucesso.");
        Logger.adicionarAviso("A conexão com a rede está lenta.");
        Logger.adicionarErro("Falha ao carregar módulo de usuários.");

        System.out.println(Logger.getHistoricoLog());
    
        //--------------------------------------------------------------------------
        //Questão 15: Criar um conversor de moedas com métodos estáticos.
        System.out.println("Questão 15: Criar um conversor de moedas com métodos estáticos.");
        double valorEmReais = 150.00;
        
        System.out.println("Valor Original: R$ " + valorEmReais);
        System.out.println("Convertido para Dólar: $ " + ConversorMoeda.converterRealParaDolar(valorEmReais));
        System.out.println("Convertido para Euro: € " + ConversorMoeda.converterRealParaEuro(valorEmReais));    
    }
}
