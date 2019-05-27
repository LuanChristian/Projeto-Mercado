package beans;

public class Usuario extends Endereco {

	private String nome,email,user;
	private int idade;
	private String cpf;
	private String password;
	private Endereco endereco;
	private float valorApagar;
	
	
	public float getValorApagar() {
		return valorApagar;
	}
	public void setValorApagar(float valorApagar) {
		this.valorApagar = valorApagar;
	}
	//getts and setts
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getuser() {
		return user;
	}
	public void setuser(String user) {
		this.user = user;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
