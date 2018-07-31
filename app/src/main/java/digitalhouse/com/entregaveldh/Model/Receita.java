package digitalhouse.com.entregaveldh.Model;

public class Receita {

    private String nome;
    private String conteudo;
    private String imagem;

    public Receita(String nome, String conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
