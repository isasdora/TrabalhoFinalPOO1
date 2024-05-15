package poo;

public class Atua {

    private Ator ator;
    private Filme filme;
    private String papel;

    public Atua(String codFilme, String cpf, String papel) {
        filme = new Filme();
        getFilme().setCodFilme(codFilme);
        ator = new Ator();
        getAtor().setCpf(cpf);
        this.papel = papel;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public Ator getAtor() {
        return ator;
    }

    public Filme getFilme() {
        return filme;
    }

    public String getPapel() {
        return papel;
    }

}
