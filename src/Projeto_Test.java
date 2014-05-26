import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;


public class Projeto_Test {


	Jogo jogo = new Jogo();
	
	@Test
	public void adicionarJogadorTest(){
		String nome = jogo.adicionarJogador("lucas");
		assertEquals("lucas", nome );
	}
	@Test
	public void pontuacaoTest(){
		jogo.pontuacaoJogador(10);
		int resultado = jogo.getPontuacao();
		assertEquals(resultado, 10 );
	}
	@Test
	public void JogoAcabouTest(){
		boolean status = jogo.statusJogo(false);
		assertFalse(status);
	}
		



}
