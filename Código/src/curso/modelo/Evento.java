package curso.modelo;

public class Evento {
    private String id;
    private String nome;
    private Palestrante palestrante;
    private String descricao;
    private String organizadores;
    private String data;
    private Endereco localizacao;
    
	public Evento(String id, String nome, Palestrante palestrante, String descricao, String organizadores, String data,
			Endereco localizacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.palestrante = palestrante;
		this.descricao = descricao;
		this.organizadores = organizadores;
		this.data = data;
		this.localizacao = localizacao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Palestrante getPalestrante() {
		return palestrante;
	}

	public void setPalestrante(Palestrante palestrante) {
		this.palestrante = palestrante;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getOrganizadores() {
		return organizadores;
	}

	public void setOrganizadores(String organizadores) {
		this.organizadores = organizadores;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Endereco getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Endereco localizacao) {
		this.localizacao = localizacao;
	}
    
}