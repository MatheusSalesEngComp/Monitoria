public class WorkshopPresencial extends Curso {
    private String local;

    public WorkshopPresencial(String titulo, Double preco, String local) {
        super(titulo, preco);
        this.local = local;
    }

    public String getLocal() {return local;}

    @Override
    public Double calcularPrecoFinal() {
        return getPreco() + 50.0;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Local: " + local);
    }
}
