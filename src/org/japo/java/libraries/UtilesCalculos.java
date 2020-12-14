/* 
 * Copyright 2020 Jorge Fernández Majid <jorge.fernandez.alum@iescamp.es>.
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
package org.japo.java.libraries;

/**
 *
 * @author Jorge Fernández Majid <jorge.fernandez.alum@iescamp.es>
 */
public class UtilesCalculos {
    //Primitiva

    public static final int PRIM_MIN = 1;
    public static final int PRIM_MAX = 49;

    //IVA
    public static final int IVA01 = 4;
    public static final int IVA02 = 10;
    public static final int IVA03 = 21;

    //Validar paridad
    public static final boolean validarParidad(int n) {

        return n % 2 == 0;
    }

    //Validar positivo
    public static final boolean validarPositivo(int n) {
        return n > 0;
    }
    
    //Validar primitiva - Entre 1 y 49
    public static final boolean validarNumeroPrimitiva (int n) {
        return n >= PRIM_MIN && n <= PRIM_MAX;
    }
    
    public static final boolean validarTipoIVA (int n) {
        return n == IVA01 || n == IVA02 || n == IVA03;
    }
    public static final int calcularCuadrado (int n) {
        return n * n;
    }
    

}
