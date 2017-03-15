# Práctica 0 con arreglos estáticos

La fecha de entrega de esta práctica es el **28 de marzo de 2017**, siguiendo las [instrucciones de entrega de la materia](entrega.md). Sólo se debe entregar código; no se precisa informe.

Todo el código debe estar en una única clase: `prog2.prac0.Prac0`.

Material de apoyo:

  - el archivo de pruebas [TestPrac0.java][test], para correr desde Eclipse con [JUnit](junit.md).

[test]: ../src/prog2/prac0/test/TestPrac0.java


## Ejercicio 1

Implementar una función que reciba dos arreglos ordenados y devuelva un tercer arreglo ordenado que sea la unión de ambos:

    public static int[] combinarOrdenados(int[] a, int[] b) ...

No se permite modificar ninguno de los arreglos originales, ni usar estructuras auxiliares. Ejemplo:

```
Arreglo A: [4 7 9 15 35 39]
Arreglo B: [1 2 5 9 14 30 50]

Resultado:

    [1 2 4 5 7 9 9 14 15 30 35 39 50]
```


## Ejercicio 2

Implementar una función que determine si un arreglo es subconjunto de otro:

    public static boolean pertenecenTodos(int[] elems,
                                          int[] arreglo) ...

Casos borde a tener en cuenta:

  - _elems_ está vacío (y la función devuelve verdadero)

  - _arreglo_ está vacío (y la función devuelve falso)

  - alguno de los arreglos contiene duplicados (no influye, es suficiente con que estén una vez)

Algunos ejemplos:

```
[1, 2] ⊆ [3, 2, 1]
[4, 1] ⊈ [1, 2, 3]
[2, 2] ⊆ [1, 2, 3]
```


## Ejercicio 3

Un arreglo se dice unimodal o en forma de pico si es estrictamente creciente hasta una posición P, y estrictamente decreciente a partir de ella.

Implementar una función que devuelva el índice del pico en un arreglo unimodal, o -1 si el arreglo no tiene forma de pico.

    public static int indicePico(int[] arreglo) ...

Ejemplos:

```
[2, 4, 6, 19, 15, 8, -2] → se devuelve 3 (19 es el pico)
[10, 20, 30, 40, 50, 15] → se devuelve 4 (50 es el pico)
[50, 100, 75]            → se devuelve 1 (100 es el pico)
[50, 75, 100]            → se devuelve -1 (no es unimodal)
```

Nota: siempre se cumple que 0 < P < N-1, por lo que todos los arreglos unimodales tienen al menos tres elementos.


## Ejercicio opcional

Implementar un método estático `indicePicoLog()` que, con complejidad logarítmica, encuentre el pico en un arreglo que se sabe es unimodal.

**NOTA**: el ejercicio es opcional, pero la función _debe_ estar presente para que la corrección automática funcione. De no estar implementada, la función debe devolver -42:

```java
public static int indicePicoLog(int[] arreglo) {
    return -42;  // No se entrega ejercicio opcional.
```
