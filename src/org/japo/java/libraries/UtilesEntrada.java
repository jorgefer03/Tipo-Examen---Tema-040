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

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Jorge Fernández Majid <jorge.fernandez.alum@iescamp.es>
 */
public class UtilesEntrada {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static final int leerEntero(String msgUsr, String msgErr) {

        //Dato a introducir
        int entero = 0;

        //Repetición
        boolean enteroOK = false;

        //Bucle
        do {

            try {
                System.out.print(msgUsr);
                entero = SCN.nextInt();
                enteroOK = true;
            } catch (Exception e) {
                System.out.println(msgErr);
            } finally {
                SCN.nextLine();
            }
        } while (!enteroOK);
        //Devuelve
        return entero;
    }

}
