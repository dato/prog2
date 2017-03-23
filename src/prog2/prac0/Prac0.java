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
		// TODO(dato): usar <T extends Comparable<T>>. Con ello podríamos
		// contar en los tests el número de comparaciones de manera exacta,
		// sin recurrir a la medición de tiempos.
		if (arreglo.length < 3)
			return -1;

		int low = 0;
		int high = arreglo.length - 1;
		int mid = (high - low) / 2;

		// TODO: Revisar y escribir más tests.
		do {
			int cmp1 = compareTo(arreglo[mid-1], arreglo[mid]);
			int cmp2 = compareTo(arreglo[mid], arreglo[mid+1]);

			if (cmp1 == 0 || cmp2 == 0)
				return -1;

			if (cmp1 < 0 && cmp2 > 0)
				return mid;
			else if (cmp1 < 0)
				low = mid;
			else if (cmp1 > 0 && cmp2 > 0)
				high = mid;

			mid = (high - low) / 2 + low;
		}
		while (mid > 0);
		return -1;
	}

	private static int compareTo(int a, int b) {
		if (a < b)
			return -1;
		else if (a > b)
			return 1;
		return 0;
	}
}
