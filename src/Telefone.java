public class Telefone {
    private int codArea;
    private String numero;
    private String descricao;

    public Telefone() {
    }

    public Telefone(int codArea, String numero, String descricao) {
        this.codArea = codArea;
        this.numero = numero;
        this.descricao = descricao;
    }

    public int getCodArea() {
        return codArea;
    }

    public void setCodArea(int codArea) {
        this.codArea = codArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "codArea=" + codArea +
                ", numero='" + numero + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }


}
