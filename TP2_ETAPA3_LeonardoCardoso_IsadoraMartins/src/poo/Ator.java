package poo;

public class Ator {

    private String cpf;
    private String dtNasc;
    private String nome;
    private String tel;
    private String email;

    public Ator() {

    }

    public Ator(String cpf, String dtNasc, String nome, String tel, String email) {
        this.cpf = cpf;
        this.dtNasc = dtNasc;
        this.nome = nome;
        this.tel = tel;
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public String getNome() {
        return nome;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

}
