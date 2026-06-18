package entidades;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private int senha;
    private String dataCadastro;

    public Usuario(int id, String nome, String email, int senha, String dataCadastro) {

        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
    }

	// Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getSenha() {
        return senha;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Id: " + id +
               " | Nome: " + nome +
               " | Email: " + email +
               " | Senha: " + senha +
               " | Data de Cadastro: " + dataCadastro;
    }
}