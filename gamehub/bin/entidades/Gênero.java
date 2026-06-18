package entidades;

public class Gênero {
    private int id;
    private String nome;
    private string descricao; 

    public Jogo(int id, string nome, string descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;

    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return "Id: " + id + " | Nome:" + nome + " | Descrição:" + descricao;
    }
}
public class Main {
	static List<genero> lista = new ArrayList<>();
	
	 public static void main(String[] args) {

	        create(new genero(1, "ação", "jogo de ação"));

	        read();

	        update(1, "ação", "jogo de ação");
	        delete("jogo de ação");

	        read();
	    }

	    static void create(genero u) {
	        lista.add(u);
	    }

	    static void read() {
	        for (genero u : lista) {
	            System.out.println(u.id + " - " + u.nome);
	        }
	    }

	    static void update(int id, String novoNome) {
	        for (genero u : lista) {
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