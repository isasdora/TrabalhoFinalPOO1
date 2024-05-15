package poo;

public class Filme {

    private String nomeFilme;
    private String codFilme;
    private String dtInicioGrav;
    private String dtFimGrav;
    private String custo;

    public Filme() {

    }

    public Filme(String nomeFilme, String codFilme, String dtInicioGrav, String dtFimGrav, String custo) {
        this.nomeFilme = nomeFilme;
        this.codFilme = codFilme;
        this.dtInicioGrav = dtInicioGrav;
        this.dtFimGrav = dtFimGrav;
        this.custo = custo;
    }

    public void setCodFilme(String codFilme) {
        this.codFilme = codFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public void setDtInicioGrav(String dtInicioGrav) {
        this.dtInicioGrav = dtInicioGrav;
    }

    public void setDtFimGrav(String dtFimGrav) {
        this.dtFimGrav = dtFimGrav;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public String getCodFilme() {
        return codFilme;
    }

    public String getDtInicioGrav() {
        return dtInicioGrav;
    }

    public String getDtFimGrav() {
        return dtFimGrav;
    }

    public String getCusto() {
        return custo;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Filme -> \nNome: " + nomeFilme + "\nCodigo: " + codFilme + "\nData inicial da gravacao: " + dtInicioGrav
                + "\nData final da gravacao: " + dtFimGrav + "\nCusto: " + custo;
    }
}
