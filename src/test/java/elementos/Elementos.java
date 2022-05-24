package elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By campoFacaLogin = By.xpath("/html/body/div[1]/div/div/header/div[1]/div[1]/div/div[2]/div[1]/span");
	private By campoCadastrar = By.xpath("/html/body/div[1]/div/div/header/div[1]/div[1]/div/div[2]/div[2]/div/a[2]");
	private By campoNome = By.name("name");
	private By campoGenero = By.xpath("/html/body/div[2]/div/div[2]/form/div[2]/div[2]/label[1]/span/font/font");
	private By preencherDataNascimento = By.xpath("birthDate");
	private By preencherCpf = By.name("cpf");
	private By preencherTelefone = By.name("phone");
	private By preencherEmail = By.name("email");
	private By preencherSenha = By.id("formField__password");
	private By campoCriarSeuCadstro = By.xpath("/html/body/div[2]/div/div[2]/form/button/font/font");
	private By campoGeradordePessoa4fordeves = By.xpath("//*[@id=\"top-nav\"]/li[23]/a");
	private By btnSexto4fordevs = By.xpath("//*[@id=\"app-wrapper\"]/div[2]/div[2]/div[1]/div[1]/div[3]/label");
	private By btnIdade4fordeves = By.id("idade");
	private By btnEstado4fordeves = By.id("cep_estado");
	private By btnCidade4fordeves = By.id("cep_cidade");
	private By btnPontuacao4fordeves = By.xpath("//*[@id=\"app-wrapper\"]/div[2]/div[2]/div[4]/div[1]/div[3]/label");
	private By btnGerarPessoa4fordeves = By.id("bt_gerar_pessoa");
	public By getCampoFacaLogin() {
		return campoFacaLogin;
	}
	public By getCampoCadastrar() {
		return campoCadastrar;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoGenero() {
		return campoGenero;
	}
	public By getPreencherDataNascimento() {
		return preencherDataNascimento;
	}
	public By getPreencherCpf() {
		return preencherCpf;
	}
	public By getPreencherTelefone() {
		return preencherTelefone;
	}
	public By getPreencherEmail() {
		return preencherEmail;
	}
	public By getPreencherSenha() {
		return preencherSenha;
	}
	public By getCampoCriarSeuCadstro() {
		return campoCriarSeuCadstro;
	}
	public By getCampoGeradordePessoa4fordeves() {
		return campoGeradordePessoa4fordeves;
	}
	public By getBtnSexto4fordevs() {
		return btnSexto4fordevs;
	}
	public By getBtnIdade4fordeves() {
		return btnIdade4fordeves;
	}
	public By getBtnEstado4fordeves() {
		return btnEstado4fordeves;
	}
	public By getBtnCidade4fordeves() {
		return btnCidade4fordeves;
	}
	public By getBtnPontuacao4fordeves() {
		return btnPontuacao4fordeves;
	}
	public By getBtnGerarPessoa4fordeves() {
		return btnGerarPessoa4fordeves;
	}
}
