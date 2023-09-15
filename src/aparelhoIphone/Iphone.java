package aparelhoIphone;

import aparelhoTelefonico.AparelhoTelefonicoInterface;
import navegadorInternet.NavegadorDeInternetInterface;
import reprodutorMusical.ReprodutorMusicalInterface;

public class Iphone implements AparelhoTelefonicoInterface, NavegadorDeInternetInterface, ReprodutorMusicalInterface {
	protected String nome;
	protected String musicaAtual;
	
	
	public Iphone(String nome) {	
		this.nome = nome;
	}

	@Override
	public void tocar() {
		System.out.println(this.nome + " está tocando "+this.musicaAtual+".");
	}

	@Override
	public void pausar() {
		System.out.println(this.musicaAtual+ " está pausada.");		
	}

	@Override
	public void selecionarMusica(String musica) {
		this.musicaAtual = musica;
		System.out.println("Música selecionada: "+ musica);
		
	}

	@Override
	public void pesquisarPagina(String url) {
		System.out.println("Acessando a página "+ url);
	}

	@Override
	public void abrirNovaAba() {
		System.out.println("Uma nova aba foi aberta");
	}

	@Override
	public void fecharAbaAtual() {
		System.out.println("Você fechou a aba atual");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");
	}

	@Override
	public void ligar(int numero) {
		System.out.println("Ligando para "+ numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendeu a ligação");
	}

	@Override
	public void desligar() {
		System.out.println("Encerrou a ligação");
		
	}

}
