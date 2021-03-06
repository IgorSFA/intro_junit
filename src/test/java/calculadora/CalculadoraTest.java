package calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois n�meros")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exce��o n�o lan�ada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}

	@Test
	public void testSubtracaoDoisNumeros() {
		assertEquals(1, calc.subtracao(2,1));
	}

	@Test
	public void testSubtracaoDoisNumerosIguais() {
		assertEquals(0, calc.subtracao(2,2));
	}

	@Test
	public void testMultiplicacaoDoisNumeros() {
		assertEquals(4, calc.multiplicacao(2, 2));
	}

	@Test
	public void testMultiplicacaoPorZero() {
		assertEquals(0, calc.multiplicacao(5, 0));
	}

	@Test
	public void testSomatoriaDe2() {
		assertEquals(3, calc.somatoria(2));
	}

	@Test
	public void testEhPositivoPositivo() {
		assertEquals(true, calc.ehPositivo(1));
	}

	@Test
	public void testEhPositivoNegativo() {
		assertEquals(false, calc.ehPositivo(-1));
	}

	@Test
	public void testEhPositivoZero() {
		assertEquals(true, calc.ehPositivo(0));
	}

	@Test
	public void testComparaAMaiorB() {
		assertEquals(1, calc.compara(2,1));
	}

	@Test
	public void testComparaAMenorB() {
		assertEquals(-1, calc.compara(1,2));
	}

	@Test
	public void testComparaAIgualB() {
		assertEquals(0, calc.compara(1,1));
	}

}
