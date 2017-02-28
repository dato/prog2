# Entrega de TPs y prácticas

Todos las entregas se realizan por correo electrónico a la dirección de la materia: `ungs.prog2@gmail.com`. Cada envío recibe una respuesta automática indicando si se recibió correctamente.

Todas las entregas constan de _uno o dos_ archivos adjuntos:

  1. un archivo **ZIP** con el código

  2. un informe en formato **PDF** (solo si lo pide la consigna)

El archivo ZIP debe contener todos los archivos _.java_ que compongan la entrega, sin ningún código compilado _(\*.class)_ ni bibliotecas _(\*.jar)_.

Se puede usar la opción de Eclipse _File → Export → General → Archive_, con cuidado de solo incluir el directorio con el código (normalmente con nombre `‘src’`).


## Asunto

El asunto del correo debe incluir nombre de la entrega, comisión, apellido y número de padrón; por ejemplo:

    Asunto: Prac0 COM1 - Simó, 12345/2015
    Asunto: Prac1 COM2 - Pustilnik, 67890/2014

En el caso de entregas grupales se incluye la información de los dos estudiantes:

    Asunto: TP1 COM3 - Nieto, 22334/2016 - Torre, 44556/2017


## Requisitos de la entrega y corrector automático

Es requisito indispensable que el código entregado compile sin errores. **No se aceptarán entregas con errores de compilación.** Tras realizar la entrega, la respuesta automática informará si el código compiló correctamente.

Asimismo, si la consigna incluye casos de prueba en formato [JUnit](junit.md), la entrega debe cumplir con su especificación.


## Colaboración y detección de copias

En todo entorno académico se valora y promueve la colaboración entre alumnos. No obstante, esa colaboración debe detenerse en el momento de _componer_ un trabajo propio (sea código o, en otras ocasiones, monografías, reportes, o similares).

Es válido:

  - conversar con otros estudantes sobre cómo resolver un problema o trabajo práctico (qué algoritmo, diseño o estrategia convienen) ✔

No se permite:

  - pedir, ofrecer, proporcionar o leer el código de otros estudiantes ❌

Todo el código entregado se somete a un programa de detección de copias. Los resultados son revisados a mano por los docentes y resultarán en acción disciplinaria cuando proceda.

A tener en cuenta: se someten a detección de copias, de manera conjunta, todas las entregas del cuatrimestre actual _y_ cuatrimestres anteriores.


## Preguntas frecuentes

**¿Qué estructura debe tener el ZIP entregado?**

De los archivos _*.java_ entregados importa:

  - el nombre (debe corresponder al nombre de la clase)
  - el paquete (debe ser consistente con lo especificado en la consigna)

No es importante:

  - la estructura de directorios (todos los archivos se compilan de manera conjunta)

**El corrector me responde: ‘errores en las firmas definidas’**

No compila el código entregado al ser combinado con las pruebas de la consigna. Esto significa que no se siguió algún detalle de la consigna (nombre de paquete, visibilidad _public_, parámetros de las funciones, etc.).

Ver también la pregunta siguiente.

**Realicé modificaciones en las pruebas, y no corren en el corrector**

El corrector no permite e ignora cualquier cambio realizado a los archivos de que forman parte de la consigna: pruebas, funciones de apoyo, etc.):

  - si estos archivos contienen algún error, debe comunicarse para que sean subsanados para todos los alumnos

  - si se desean enviar pruebas adicionales, deben estar en un archivo separado (por ejemplo _PruebasAlumno.java_).
