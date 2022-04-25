package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import model.Retangulo;

public class RetanguloTest {
	public Retangulo retangulo;
	
	@Test 
	public void testCalcularArea() {
		retangulo = new Retangulo(12, 5);
		assertEquals(60, retangulo.calcularArea(), 0);
	}

	@Test
	public void testPerimetro() {
		retangulo = new Retangulo(4, 10);
		assertEquals(28, retangulo.calcularPerimetro(), 0);
	}
}
