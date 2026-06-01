public class CursoOnline extends Curso{
    private int duracaoHoras;

    public CursoOnline(String titulo, Double preco, int duracaoHoras) {
        super(titulo, preco);
        this.duracaoHoras = duracaoHoras;
    }

    public int getDuracaoHoras() {return duracaoHoras;}
    
    @Override
    public Double calcularPrecoFinal() {
        if(this.duracaoHoras > 20) {
            return getPreco() * 0.9; 
        }
        return getPreco();
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Duração: " + duracaoHoras + " horas");
    }
}
