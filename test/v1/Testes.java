package v1;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class Testes {

	@Test
	public void exemplo() {
		Pessoa p1 = new Pessoa("Fulano", false, false);
		Pessoa p2 = new Pessoa("Ciclana", false, false);
		Pessoa p3 = new Pessoa("Beltrana", false, false);
		
		Fila f = new Fila();
		
		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);
		
		Pessoa proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Fulano");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "Ciclana");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Beltrana");
		
		f.removePessoa(proximo);
	}

	@Test
	public void TesteGravida(){
		Pessoa p1 = new Pessoa("F�bio", false, false);
		Pessoa p2 = new Pessoa("Fulana", true, false);
		Pessoa p3 = new Pessoa("Ciclana", false, false);
		
		Fila f = new Fila();
		
		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);
		
		Pessoa proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Fulana");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "F�bio");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Ciclana");
		
		f.removePessoa(proximo);
	}
	
	@Test
	public void TesteIdoso(){
		Pessoa p1 = new Pessoa("F�bio", false, false);
		Pessoa p2 = new Pessoa("Fulana", true, false);
		Pessoa p3 = new Pessoa("Beltrano", false, true);
		
		Fila f = new Fila();
		
		f.addPessoa(p1);
		f.addPessoa(p2);
		f.addPessoa(p3);
		
		Pessoa proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "Beltrano");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
			
		Assert.assertEquals(proximo.getNome(), "Fulana");
		
		f.removePessoa(proximo);
		proximo = f.proximoFila();
		
		Assert.assertEquals(proximo.getNome(), "F�bio");
		
		f.removePessoa(proximo);
	}
}
