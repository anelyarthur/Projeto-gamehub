package entidades;

public class Jogo {
    private int id;
    private String genero;
    private int lancamento;
    private String nome;
    private String desenvolvedor;
    private string descricao; 

    public Jogo(int id, String genero, int lancamento, string nome, string desenvolvedor, string descricao) {
        this.id = id;
        this.genero = genero;
        this.lancamento = lancamento;
        this.nome = nome;
        this.desenvolvedor = desenvolvedor;
        this.descricao = descricao;

    }

    public int getId() {
        return id;
    }

    public String getGenero() {
        return genero;
    }

    public int getLancamento() {
        return lancamento;
    }
    public String getNome() {
        return nome;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    @Override
    public String toString() {
        return "Id: " + id + " | Gênero: " + genero + " | Lançamento: R$" + lancamento + " | Nome:" + nome + " | Desenvolvedor:" + desenvolvedor + " | Descrição:" + descricao;
    }
}

public class Main {
	static List<jogo> lista = new ArrayList<>();
	
	 public static void main(String[] args) {

	        create(new jogo(1, "ação", "20/03/2015", "the last of us", "seila", "jogo da ellie "));

	        read();

	        update(1, "ação", "20/03/2015", "the last of us", "seila", "jogo da ellie "));
	        delete("ação");

	        read();
	    }

	    static void create(jogo u) {
	        lista.add(u);
	    }

	    static void read() {
	        for (jogo u : lista) {
	            System.out.println(u.id + " - " + u.nome);
	        }
	    }

	    static void update(int id, String novoNome) {
	        for (jogo u : lista) {
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
