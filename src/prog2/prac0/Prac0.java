package prog2.prac0;

public class Prac0
{
	public static int[] combinarOrdenados(int[] a, int[] b) {
		int la = a.length;
		int lb = b.length;
		int i = 0, j = 0, r = 0;
		int[] ret = new int[la + lb];

		while (i < la && j < lb) {
			if (a[i] <= b[j])
				ret[r++] = a[i++];
			else
				ret[r++] = b[j++];
		}

		while (i < la)
			ret[r++] = a[i++];

		while (j < lb)
			ret[r++] = b[j++];

		return ret;
	}

	public static boolean pertenecenTodos(int[] elems, int[] conjunto) {
		boolean ret = true;

		for (int x : elems) {
			ret = ret && perteneceElem(x, conjunto);
		}

		return ret;
	}

	private static boolean perteneceElem(int elem, int[] arreglo) {
		boolean ret = false;

		for (int x : arreglo) {
			ret = ret || (x == elem);
		}

		return ret;
	}

	public static int indicePico(int[] arr) {
		int pico = -1;
		boolean unimodal = true;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				unimodal = unimodal && pico < 0;
			} else if (arr[i] == arr[i + 1]) {
				unimodal = false;
			} else if (pico < 0) {
				pico = i;
			}
		}

		return (unimodal && pico > 0) ? pico : -1;
	}

	public static int indicePicoLog(int[] arreglo) {
		// Se resuelve usando búsqueda binaria.
		return -1;
	}
}
