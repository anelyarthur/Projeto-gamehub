package entidades;

public class Jogo {

    private int id;
    private String titulo;
    private int lancamento;
    private String desenvolvedor;
    private String descricao;
    private int id_genero;
   
   
    

    public Jogo(int id, String titulo,
                int lancamento, String desenvolvedor, String descricao, int id_genero) {

        this.id = id;
        this.lancamento = lancamento;
        this.titulo = titulo;
        this.desenvolvedor = desenvolvedor;
        this.descricao = descricao;
        this.id_genero = id_genero;
    }

    public int getId() {
        return id;
    }

    public int getLancamento() {
        return lancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDesenvolvedor() {
        return desenvolvedor;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public int getGenero() {
        return id_genero;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public void setNome(String titulo) {
        this.titulo = titulo;
    }

    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setGenero(int id_genero) {
        this.id_genero = id_genero;
    }
    
    @Override
    public String toString() {
        return "Id: " + id +
               " | Gênero: " + id_genero +
               " | Lançamento: " + lancamento +
               " | Nome: " + titulo  +
               " | Desenvolvedor: " + desenvolvedor +
               " | Descrição: " + descricao;
    }
}