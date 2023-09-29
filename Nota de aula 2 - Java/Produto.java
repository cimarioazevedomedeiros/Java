public class Produto {

    private String codigo;

    private String nome;

    private int qtd;

    private int qtdVendas;

    private int qtdFinal;

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public int getQtdFinal(){
        qtdFinal = qtd - qtdVendas;
        return qtdFinal;
    }
}