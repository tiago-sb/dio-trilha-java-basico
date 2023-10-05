package enuns;

public enum EstadoBrasileiro {
	// lista de objetos que sejam imutáveis
	// os ddd são ilustrativos
	RIO_DE_JANEIRO("RJ","Rio de Janeiro",21),
	BAHIA("BA","Bahia",71),
	MARANHAO("MA","Maranhao",90),
	PIAUI("PI","Piaui",89),
	PERNANBUCO("PB","Pernanbuco",98),
	SAO_PAULO("SP","Sao Paulo",11),
	CEARA("CE","Ceara",45),
	ESPIRITO_SANTO("ES","Espirito Santo",34);
	// atributos pertencentes ao objeto
	private String sigla;
	private String nome;
	private int ddd;
	// privado, uma vez que nao existe a necessidade de se acessar um enum fora da classe
	private EstadoBrasileiro(String sigla, String nome, int ddd) {
		this.sigla = sigla;
		this.nome = nome;
		this.ddd = ddd;
	} 
	
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public int getDdd() {
		return ddd;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
}
