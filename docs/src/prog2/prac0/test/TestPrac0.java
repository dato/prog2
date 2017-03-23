package prog2.prac0.test;

import static org.junit.Assert.*;

import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import prog2.prac0.Prac0;

@RunWith(Enclosed.class)
public class TestPrac0
{
	//
	// Tests para combinarOrdenados().
	//
	public static class TestCombinar
	{
		@Test
		public void ejemploConsigna() {
			int[] a = {4, 7, 9, 15, 35, 39};
			int[] b = {1, 2, 5, 9, 14, 30, 50};
			int[] res = {1, 2, 4, 5, 7, 9, 9, 14, 15, 30, 35, 39, 50};
			assertArrayEquals(res, Prac0.combinarOrdenados(a, b));
		}

		@Test
		public void secuenciados() {
			int[] a = {0, 1, 2, 3, 4};
			int[] b = {5, 6, 7, 8, 9};
			int[] res = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			assertArrayEquals(res, Prac0.combinarOrdenados(b, a));
		}

		@Test
		public void cantidadesDiferentes() {
			int[] a = {2, 4, 6};
			int[] b = {1, 3, 5, 7, 8, 9, 10, 11, 12};
			int[] res = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
			assertArrayEquals(res, Prac0.combinarOrdenados(b, a));
		}

		@Test
		public void valoresNegativos() {
			int[] a = {-10, -5, 15};
			int[] b = {0, 10, 20};
			int[] res = {-10, -5, 0, 10, 15, 20};
			assertArrayEquals(res, Prac0.combinarOrdenados(b, a));
		}

		@Test
		public void duplicados() {
			int[] a = {20, 25, 40, 50, 60};
			int[] b = {20, 30, 40, 50, 50, 50};
			int[] res = {20, 20, 25, 30, 40, 40, 50, 50, 50, 50, 60};
			assertArrayEquals(res, Prac0.combinarOrdenados(b, a));
		}

		@Test
		public void arreglosVacios() {
			int vacio[] = {};
			int arreglo[] = {2, 4, 6};
			assertArrayEquals(vacio, Prac0.combinarOrdenados(vacio, vacio));
			assertArrayEquals(arreglo, Prac0.combinarOrdenados(vacio, arreglo));
			assertArrayEquals(arreglo, Prac0.combinarOrdenados(arreglo, vacio));
		}
	}

	//
	// Tests para pertenecenTodos().
	//
	public static class TestPertenecen
	{
		@Test
		public void perteneceUno() {
			int elems[] = { 6 };
			int conjunto[] = { 2, 4, 6, 8 };
			assertTrue(Prac0.pertenecenTodos(elems, conjunto));
		}

		@Test
		public void pertenecenVarios() {
			int elems[] = { 2, 4, 6 };
			int conjunto[] = { 1, 2, 3, 4, 5, 6, 7 };
			assertTrue(Prac0.pertenecenTodos(elems, conjunto));
		}

		@Test
		public void perteneceConDuplicadosElems() {
			int elems[] = { 2, 4, 2 };
			int conjunto[] = { 4, 2 };
			assertTrue(Prac0.pertenecenTodos(elems, conjunto));
		}

		@Test
		public void noPerteneceNinguno() {
			int elems[] = { 2, 4, 6 };
			int conjunto[] = { 1, 3, 5, 7, 9 };
			assertFalse(Prac0.pertenecenTodos(elems, conjunto));
		}

		@Test
		public void noPerteneceUltimo() {
			int elems[] = { 2, 4, 6 };
			int conjunto[] = { 5, 4, 3, 2, 1 };
			assertFalse(Prac0.pertenecenTodos(elems, conjunto));
		}

		@Test
		public void noPerteneceConDuplicadosCjto() {
			int elems[] = { 2, 4, 6 };
			int conjunto[] = { 2, 4, 2 };
			assertFalse(Prac0.pertenecenTodos(elems, conjunto));
		}

		@Test
		public void perteneceVacio() {
			int elems[] = {};
			int conjunto[] = { 1, 2, 3 };
			assertTrue(Prac0.pertenecenTodos(elems, conjunto));
		}

		@Test
		public void perteneceVacioEnVacio() {
			int elems[] = {};
			int conjunto[] = {};
			assertTrue(Prac0.pertenecenTodos(elems, conjunto));
		}

		@Test
		public void noPerteneceNadieEnVacio() {
			int elems[] = { 1 };
			int conjunto[] = {};
			assertFalse(Prac0.pertenecenTodos(elems, conjunto));
		}
	}

	//
	// Tests para indicePico().
	//
	public static class TestPico
	{
		@Test
		public void picoMedio() {
			int arreglo[] = { 1, 3, 5, 2, 0 };
			assertEquals(2, Prac0.indicePico(arreglo));
		}

		@Test
		public void picoIzquierdo() {
			int arreglo[] = { 1, 5, 4, 3, 2, 1 };
			assertEquals(1, Prac0.indicePico(arreglo));
		}

		@Test
		public void picoDerecho() {
			int arreglo[] = { 1, 2, 3, 4, 5, 0 };
			assertEquals(4, Prac0.indicePico(arreglo));
		}

		@Test
		public void tresElementos() {
			int arreglo[] = { 20, 30, 15 };
			assertEquals(1, Prac0.indicePico(arreglo));
		}

		@Test
		public void numerosNegativos() {
			int arreglo[] = { -99, -97, -95, -96, -98 };
			assertEquals(2, Prac0.indicePico(arreglo));
		}

		@Test
		public void todoDescendente() {
			int arreglo5[] = {5, 4, 3, 2, 1};
			int arreglo3[] = {5, 4, 3};
			assertEquals(-1, Prac0.indicePico(arreglo5));
			assertEquals(-1, Prac0.indicePico(arreglo3));
		}

		@Test
		public void todoAscendente() {
			int arreglo5[] = {1, 2, 3, 4, 5};
			int arreglo3[] = {1, 2, 3};
			assertEquals(-1, Prac0.indicePico(arreglo5));
			assertEquals(-1, Prac0.indicePico(arreglo3));
		}

		@Test
		public void fallaDescenso() {
			int arreglo[] = {10, 20, 30, 40, 25, 10, 15};
			assertEquals(-1, Prac0.indicePico(arreglo));
		}

		@Test
		public void noCrecienteEstricto() {
			int arreglo[] = {10, 20, 30, 30, 40, 25, 10, 5};
			assertEquals(-1, Prac0.indicePico(arreglo));
		}

		@Test
		public void noDecrecienteEstricto() {
			int arreglo[] = {10, 20, 30, 40, 25, 10, 10, 5};
			assertEquals(-1, Prac0.indicePico(arreglo));
		}

		@Test
		public void arregloPocosElementosNoUnimodal() {
			int arreglo0[] = {};
			int arreglo1[] = {1};
			int arreglo2a[] = {1, 2};
			int arreglo2b[] = {3, 2};
			assertEquals(-1, Prac0.indicePico(arreglo0));
			assertEquals(-1, Prac0.indicePico(arreglo1));
			assertEquals(-1, Prac0.indicePico(arreglo2a));
			assertEquals(-1, Prac0.indicePico(arreglo2b));
		}
	}

	//
	// Tests para indicePicoLog().
	//
	public static class TestPicoLog
	{
		@BeforeClass
		public static void isImplemented() {
			int arreglo[] = {1, 3, 2};
			Assume.assumeTrue("Ejercicio opcional", Prac0.indicePicoLog(arreglo) != -42);
		}

		@Test
		public void len3() {
			int arreglo[] = { 1, 3, 2 };
			assertEquals(1, Prac0.indicePicoLog(arreglo));
		}

		@Test
		public void len4a() {
			int arreglo[] = {2, 3, 1, 0};
			assertEquals(1, Prac0.indicePicoLog(arreglo));
		}

		@Test
		public void len4b() {
			int arreglo[] = {1, 2, 3, 0};
			assertEquals(2, Prac0.indicePicoLog(arreglo));
		}

		@Test
		public void len5a() {
			int arreglo[] = {3, 4, 2, 1, 0};
			assertEquals(1, Prac0.indicePicoLog(arreglo));
		}

		@Test
		public void len5b() {
			int arreglo[] = {2, 3, 4, 1, 0};
			assertEquals(2, Prac0.indicePicoLog(arreglo));
		}

		@Test
		public void len5c() {
			int arreglo[] = {1, 2, 3, 4, 0};
			assertEquals(3, Prac0.indicePicoLog(arreglo));
		}
	}
}
