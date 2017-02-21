# Práctica 1: complejidad y estructuras de datos

La fecha de entrega de esta práctica es el **8 de abril de 2017**, siguiendo las [instrucciones de entrega de la materia](entrega.md). Sólo se debe entregar código; no se precisa informe.


## Ejercicio 1

¿Cuál es la complejidad de las siguientes dos funciones?

```java
public static int sumarA(ArrayList<Integer> lista) {
    int suma = 0;

    for (int i = 0; i < lista.size(); i++)
        suma += lista.get(i);

    return suma;
}

public static int sumarL(LinkedList<Integer> lista) {
    int suma = 0;

    for (int i = 0; i < lista.size(); i++)
        suma += lista.get(i);

    return suma;
}
```

Si no tienen el mismo orden, rescribir la de mayor complejidad para que sean iguales:

```java
public static int sumarNueva(...) ...
```



## Ejercicio 2

Dada la siguiente definición de nodo:

```java
package prog2.prac1;

public class Nodo {
    int val;
    Nodo sig;

    public Nodo(int x, Nodo n) {
        val = x;
        sig = n;
    }
}
```

implementar un método que, con complejidad lineal y manteniendo el ordenamiento previo, combine dos secuencias de nodos ordenados:

```java
public static Nodo combinarOrdenados(Nodo seqA, Nodo seqB) ...
```

No se debe crear ningún nuevo nodo. Se entrelazan ambas secuencias, devolviendo la cabeza de aquella que empezara con menor valor.


## Ejercicio 3

Implementar una función lineal que elimine cadenas duplicadas en una lista enlazada:

```java
public static void eliminarDuplicados(LinkedList<String> lista) ...
```

Se debe conservar, siempre, la primera aparición de cada elemento, por ejemplo:

```
Entrada: ["Elena", "Martín", "Juan", "Elena", "Ana", "Juan"]
Salida:  ["Elena", "Martín", "Juan", "Ana"]
```

Se permite el uso de estructuras auxiliares.


## Ejercicio 4

**(A)**

Los legajos de la UNGS siempre incluyen el año de su creación en su numeración, por ejemplo: 482392/2014.

Escribir una función que, dado un arreglo estático de números de legajo, devuelva el año con mayor representación:

```java
public static int mayorCohorte(String[] legajos) { ... }
```

En caso de empate, devolver el año mayor.

Indicaciones:

  - Se permite el uso de estructuras auxiliares.

  - Compejidad deseada: _O(n)_, siendo _n_ la longitud del arreglo `legajos`.

**(B)**

Sabiendo que los años de legajo no pueden ser mayores que el año actual, ni menores que el año de fundación de la UNGS (1992), escribir una segunda versión de _mayorCohorte_ que, sin usar estructuras auxiliares, mantenga la misma complejidad asintótica lineal:

```java
public static int mayorCohorteLim(String[] legajos) { ... }
```


## Ejercicio opcional

Eliminar duplicados, con complejidad lineal, de un arreglo dinámico de cadenas:

```java
public static void eliminarDuplicados(ArrayList<String> arreglo) ...
```

