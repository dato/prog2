---
title: >
  Programación II: TP llamado libre
cursada: 2016/2
deadline: 2016-12-20T17:00:00-0300
math: true
footnotes: true
---

El TP del llamado libre se realiza de manera individual. Consta de dos ejercicios que se entregarán de manera conjunta en un único ZIP con el código Java.

El código de apoyo para los ejercicios se puede descargar en: [libre_2016_2.zip][zip].

La entrega se puede realizar, como muy tarde, el día del segundo llamado, siguiendo siempre las instrucciones especificadas en la sección [Instrucciones para la entrega](#entrega).

[zip]: https://github.com/ungs-prog2/tps/archive/libre_2016_2.zip


Índice
======
{:.no_toc}

* Contents
{:toc}


Ejercicio 1: TAD diccionario sobre ABB
======================================

En el código de apoyo se define la interfaz _Diccionario\<K, V>_ con las siguientes primitivas (la documentación de cada método está en el archivo [Diccionario.java]):

```java
public interface Diccionario<K, V> extends Iterable<K>
{
    boolean guardar(K clave, V valor);

    V obtener(K clave);

    boolean pertenece(K clave);

    void eliminar(K clave);

    int cantidad();
}
```

Se pide implementar la interfaz mediante un árbol binario de búsqueda cuyo iterador recorra las claves de manera ordenada. La definición de la clase será similar a:

```java
public class ABB<K, V> implements Diccionario<K, V> {
    // ...
}
```

La complejidad temporal de la implementación debe ser como sigue:

  - $$\mathcal{O}(\log{n})$$:
    - _guardar()_
    - _obtener()_
    - _pertenece()_
    - _eliminar()_

  - $$\mathcal{O}(1)$$:
    - _cantidad()_
    - _iterator()_ (meramente la llamada al método, no consumirlo)

  - $$\mathcal{O}(n)$$:
    - recorrer el árbol (es decir, consumir el iterador devuelto por _iterator())._

[Diccionario.java]: https://github.com/ungs-prog2/tps/blob/libre_2016_2/Diccionario.java


Guía de implementación
----------------------

Se recomienda implementar todos los métodos en la misma clase _ABB_,  mantener una clase interna _Nodo_ que simplemente almacene las claves y valores:

```java
public class ABB<...> implements Diccionario<K, V>
{
    private class Nodo {
        K clave;
        V valor;
        Nodo izq, der;

        // Constructor.
        Nodo(K k, V v) {
            clave = k;
            valor = v;
        }
    }

    @Override
    public void guardar(K clave, V valor) {
        // ...
    }
}
```

Para la implementación del iterador, se recomienda usar un recorrido pre-orden.


Pruebas automáticas
-------------------

...


Ejercicio 2: polimorfismo
=========================

...


Instrucciones para la entrega  {#entrega}
=============================
{:.no_toc}

### Formato ###
{:.no_toc}

La entrega se realizará por correo electrónico a la dirección `entregas.prog2@gmail.com` antes de la fecha de entrega indicada. El asunto debe seguir el formato:

    Asunto: Libre 2016/2 - APELLIDO, NOMBRE

El mensaje debe contener _dos_ archivos adjuntos.

  1. Un archivo PDF con el informe (una carilla) del ejercicio 2.

  2. Un único archivo ZIP con los archivos fuente del proyecto.[^nojar]

[^nojar]: Se debe exportar desde Eclipse únicamente el directorio ‘src’. No debe incluirse ningún archivo en formato JAR o _.class_, pues el ZIP será rechazado por el servidor de correo.


### Compilación automática ###
{:.no_toc}

Todo el código entregado debe compilar para considerarse una entrega válida.

Además, la implementación de _Diccionario_ debe validar los casos de prueba que se incluyeron en el código de apoyo (_TestABB.java_).


### Copia en papel ###
{:.no_toc}

Se debe entregar una copia impresa de código e informe. Se puede entregar en mano durante el horario de examen del segundo llamado, o en el casillero de los profesores **antes** del comienzo del mismo.

