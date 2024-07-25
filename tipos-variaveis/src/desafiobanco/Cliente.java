package desafiobanco;

public class Cliente {
    private String nome;
    private String cpf;
    private String profissao;
    private String telefone;
    private String tipoConta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", cpf=" + cpf + ", profissao=" + profissao + ", telefone=" + telefone
                + ", tipoConta=" + tipoConta + "]";
    }

    public Cliente(String nome, String cpf, String profissao, String telefone, String tipoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.telefone = telefone;
        this.tipoConta = tipoConta;
    }

    

}
