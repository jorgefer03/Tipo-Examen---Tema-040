# Tipo-Examen---Tema-040
Examen tipo de programación modular. DAW 2020


1. Un estudiante de programación diseña en Java una clase librería llamada
UtilesCalculos en el paquete org.japo.java.libraries escribiendo el código fuente que
se muestra a continuación:

-----------------------------------------------------------------------------------------
pakage org.japo.java.libraries
// Lotería Primitiva
constant PRIM_MIN = 1;
constant PRIM_MAX = 1;
// Tipos IVA
constant IVA01 = 4;
constant IVA01 = 10;
constant IVA01 = 21;
class UtilesCalculos (
 // Validar paridad
 static validarParidad(int n) {
 return n % 2 == 0;
 }
 / Validar positivo
 static validarPositivo(int n) {
 return n != 0
 }
 / Validar primitiva - Entre 1 y 49
 static validarNumeroPrimitiva(int n) {
 return n <= 1 && >= PRIM_MAX;
 }
 / Validar IVA
 static validarTipoIVA(iva) {
 return iva == IVA01 || 10 || 21;
}
--------------------------------------------------------------------------------------------

Al primer vistazo del código se hace evidente la existencia de errores que hay que corregir.

2. La clase librería anterior debe completarse con el método:
public static int calcularCuadrado(int n);
que permite calcular el cuadrado del número entero suministrado.
Con la ayuda del IDE NetBeans se debe de construir un Proyecto de tipo Aplicación Java
que realice una pequeña demostración del funcionamiento de la clase librería
UtilesCalculos llamado TestUtilesCalculos que auxiliándose de aquella pueda realizar la
siguiente funcionalidad:
✔ Pedir e introducir un número entero por consola.
✔ Analizar e informar si el número es par.
✔ Analizar e informar si el número es positivo.
✔ Analizar e informar si el número es válido para la Lotería Primitiva (Entre 1 y 49).
✔ Analizar e informar si el número es un valor de IVA (4, 10 ó 21).
✔ Calcular y mostrar el cuadrado del número.

3. Para introducir por consola un número entero se utilizará el método de la clase librería
UtilesEntrada llamado:
public static final int leerEntero(String msgUsr, String msgErr);
Este método recibe el mensaje de invitación al usuario a introducir el dato y el mensaje de
error en caso de que la entrada del usuario no sea correcta. En caso de error se volverá a
pedir el dato hasta que sea correcto.
Página 1 de 2
MP 0485 – PRG Tema 040 – Modularización
4. Toda la transacción se realizará en un formato similar al de la siguiente captura:

Demo Librería UtilesCalculos
============================
Número entero ...: 12
Paridad .........: true
Positividad .....: true
Primitiva .......: true
Tipo IVA ........: false
Cuadrado ........: 144
