/**
 * 
 */
package es.ltc.primeraprueba.PrimeroVariables;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Leticia
 *
 */
public class BasicosImplTest {
	private static BasicosImpl basicos;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		basicos=new BasicosImpl();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		basicos=null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link es.ltc.primeraprueba.PrimeroVariables.BasicosImpl#esPar(int)}.
	 */
	@Test
	public final void testEsPar1() {
		assertEquals(true, basicos.esPar(4));
		
	}

	/**
	 * Test method for {@link es.ltc.primeraprueba.PrimeroVariables.BasicosImpl#esPar(int)}.
	 */
	@Test
	public final void testEsPar2() {
		assertEquals(false, basicos.esPar(3));
		
	}

	/**
	 * Test method for {@link es.ltc.primeraprueba.PrimeroVariables.BasicosImpl#esImpar(int)}.
	 */
	@Test
	public final void testEsImpar1() {
		assertEquals(true, basicos.esImpar(3));
	}

	/**
	 * Test method for {@link es.ltc.primeraprueba.PrimeroVariables.BasicosImpl#esImpar(int)}.
	 */
	@Test
	public final void testEsImpar2() {
		assertEquals(false, basicos.esImpar(2));
	}

}
