
public class Prova {
    private String nome;
    private int matricula;
    private char []resultado = new char[6];

    public Prova(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }   

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return this.matricula;
    }

    public void respostaAluno(char[] resposta) {
        if (resposta.length >  6 || resposta == null){
            return;
        }
        this.resultado = resposta.clone();
    }

    public int acertos(char[] gabarito) {
        int qtd = 0;
        for (int i = 0; i < gabarito.length; i++){
            if (this.resultado[i] == gabarito[i]){
                qtd++;
            }
        }
        return qtd;
    }

    public int nota(char[] gabarito){
        int nota = 0;

        for (int i = 0; i < gabarito.length; i++){
            if (this.resultado[i] == gabarito[i] && i < 3){
                nota++;
            }
            else if (this.resultado[i] == gabarito[i] && i >= 3){
                nota+=2;
            }

        }
        return nota;
    }

    public int maior(Prova outra, String[] gabarito){
        int n1, n2;
        char respostaChar[] = new char[6];
        for (int i = 0; i < gabarito.length; i++){
            respostaChar[i] = gabarito[i].charAt(0);
        }
        n1 = nota(respostaChar);
        n2 = outra.nota(respostaChar);

        if (n1 > n2){return 1;}
        if (n1 < n2){return 0;}
        if (n1 == n2){return -1;}
        return 0;
    }
}
