package br.estacio.sample;

public class ClienteJuridico extends Cliente {
	private Long cnpj;

	public ClienteJuridico() {
		// TODO Auto-generated constructor stub
	}

	public ClienteJuridico(Integer id, String nomeCliente, Long cnpj) {
		super(id, nomeCliente);
		this.cnpj = cnpj;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}

	public static void main(String[] args) {
		ClienteJuridico juridico = new ClienteJuridico(10, "Jose", 1234567000114L);
		System.out.println(juridico.getId());
		System.out.println(juridico.getNomeCliente());
		System.out.println(juridico.getCnpj());
	}
}
