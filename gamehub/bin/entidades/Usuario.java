package entidades;

public class Usuario {
    private int id;
    private String nome;
    private String email;
    private int senha; 
    private int data_cadastro;

    public Usuario(int id, string nome, string email, int senha, int data_cadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;

    }

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

    public int getDataDeCadastro() {
        return data_cadastro;
    }


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

    public void setDataDeCadastro(int data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    @Override
    public String toString() {
        return "Id: " + id + " | Nome:" + nome + " | Email:" + email + " | Senha:" + senha + " | Data de Cadastro:" + data_cadastro;
    }
}
public class Main {
	static List<usuario> lista = new ArrayList<>();
	
	 public static void main(String[] args) {

	        create(new Usuario(1, "Ana", "ana@gmail.com", 1234, 23/01/2026));

	        read();

	        update(1, "Ana Maria", "ana@gmail.com", 1234, 23/01/2026);
	        delete(1);

	        read();
	    }

	    static void create(Usuario u) {
	        lista.add(u);
	    }

	    static void read() {
	        for (Usuario u : lista) {
	            System.out.println(u.id + " - " + u.nome);
	        }
	    }

	    static void update(int id, String novoNome) {
	        for (Usuario u : lista) {
	            if (u.id == id) {
	                u.nome = novoNome;
	            }
	        }
	    }

	    static void delete(int id) {
	        lista.removeIf(u -> u.id == id);
	    }
	}
}