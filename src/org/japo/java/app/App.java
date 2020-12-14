/* 
 * Copyright 2020 Jorge Fernández Majid - jorge.fernandez.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

import java.util.Locale;
import org.japo.java.libraries.UtilesCalculos;
import org.japo.java.libraries.UtilesEntrada;


/**
 *
 * @author Jorge Fernández Majid - jorge.fernandez.alum@iescamp.es
 */
public class App {
    
    public static final String MSG_USR = "Número entero ...: ";
    public static final String MSG_ERR = "ERROR: Entrada incorrecta";

    public void launchApp() {
        
        System.out.println("Demo Librería UtilesCalculos");
        System.out.println("============================");
        
        //Llamada a métodos
        
        int num = UtilesEntrada.leerEntero(MSG_USR, MSG_ERR);
        boolean par = UtilesCalculos.validarParidad(num);
        boolean positivo = UtilesCalculos.validarPositivo(num);
        boolean primitiva = UtilesCalculos.validarNumeroPrimitiva(num);
        boolean iva = UtilesCalculos.validarTipoIVA(num);
        int cuadrado = UtilesCalculos.calcularCuadrado(num);
        
        //Mensaje
        
        System.out.printf("Paridad .........: %b%n", par);
        System.out.printf("Positividad .....: %b%n", positivo);
        System.out.printf("Primitiva .......: %b%n", primitiva);
        System.out.printf("Tipo IVA ........: %b%n", iva);
        System.out.printf("Cuadrado ........: %d%n", cuadrado);
        
        
        
       

    }

}
