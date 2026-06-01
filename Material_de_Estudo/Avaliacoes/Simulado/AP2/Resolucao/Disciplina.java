
public class Disciplina {
    private String nome;
    private String codigo;
    private Integer cargaHoraria;

    Disciplina(){}
    Disciplina(final String codigo, String nome, Integer cargaHoraria){
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome(){return this.nome;}
    public void setNome(String nome){this.nome = nome;}

    public String getCodigo(){return this.codigo;}
    public final void setCodigo(final String codigo){this.codigo = codigo;}

    public Integer getCargaHoraria(){return this.cargaHoraria;}
    public void setCargaHoraria(Integer cargaHoraria){this.cargaHoraria = cargaHoraria;}

    @Override
    public String toString(){
        return "Código: " + this.codigo +
                ", Nome: " + this.nome +
                ", Carga Horária: " + this.cargaHoraria;
    }
}
