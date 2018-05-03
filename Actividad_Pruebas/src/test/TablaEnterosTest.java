/**
 * @author 21752434
 */
package test;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.BeforeClass;
import org.junit.Test;


public class TablaEnterosTest {
	
	/*Definimos arrays para pasar como argumentos al constructor*/
	private static Integer[] tabla;
	private static Integer[] tablaTam0;
	
	/*Inicialización necesarias
	 * Se ejecuta antes de las otras pruebas*/
	@BeforeClass
	public static void inicioPruebas() {
		tablaTam0 = new Integer[0];
		tabla = new Integer[5];
		for (Integer i=0; i<tabla.length ; i++) {
			tabla[i] = i*30+3;
		}//fin for
		
	}

	@Test
	public void testTablaEnteros() {
		TablaEnteros tab1 = new TablaEnteros(tabla);
		assertNotNull(tab1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testTablaEnterosNull() {
		TablaEnteros tab1 = new TablaEnteros(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testTablaEnterosVacio() {
		TablaEnteros tab1 = new TablaEnteros(tablaTam0);
	}
	

	@Test
	public void testSumaTabla() {
		TablaEnteros tab1 = new TablaEnteros(tabla);
		assertEquals(315, tab1.sumaTabla());
	}

	@Test
	public void testMayorTabla() {
		TablaEnteros tab1 = new TablaEnteros(tabla);
		assertEquals(123, tab1.mayorTabla());
	}

	@Test
	public void testPosicionTabla() {
		TablaEnteros tab1 = new TablaEnteros(tabla);
		assertEquals(3, tab1.posicionTabla(93));
	}

	@Test(expected = NoSuchElementException.class)
	public void testCalculoExcep3() {
		TablaEnteros tab1 = new TablaEnteros(tabla);
		assertEquals(1,tab1.posicionTabla(0));
	}
}
