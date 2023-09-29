public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double media;
    private String situacao;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNota1(double nota1){
        this.nota1 = nota1;
    }
    public double getNota1(){
        return nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
    public double getNota2() {
        return nota2;
    }
    public double getMedia(){
        media = (nota1 + nota2) / 2;
        return media;
    }
    public String getSituacao() {
        if (media >= 7){
            situacao = "APROVADO!";
            return situacao;
        } else if (media < 7 && media >= 4) {
            situacao = "NA FINAL!";
            return situacao;
        } else{
            situacao = "REPROVADO!";
            return situacao;
        }

    }

}