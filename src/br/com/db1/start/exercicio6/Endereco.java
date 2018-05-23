package br.com.db1.start.exercicio6;

public class Endereco {

	private TipoLogradouro tipologradouro;
	
	private String logradouro;
	
	private Integer cep;
	
	public String exibirCepFormatado(){
		return null;
	}

	public TipoLogradouro getTipologradouro() {
		return tipologradouro;
	}

	public void setTipologradouro(TipoLogradouro tipologradouro) {
		this.tipologradouro = tipologradouro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}
}
