package aparelhoIphone;

public class Main{
	public static void main(String[] args) {
		Iphone aparelho = new Iphone("Iphone 7");

	    System.out.println("--------------");
	    aparelho.selecionarMusica("Los Hermanos");
	    aparelho.tocar();
	    aparelho.pausar();

	    System.out.println("--------------");
	    aparelho.atender();
	    aparelho.ligar(40028922);

	    System.out.println("--------------");
	    aparelho.atualizarPagina();
	    aparelho.abrirNovaAba();

	    System.out.println("--------------");
	  }

}
