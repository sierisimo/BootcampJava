/**
 * Esta clase tiene un package, concretamente:
 *      com.codigofacilito.sier
 *
 *  Por eso mismo se encuentra en la misma ubicacion a nivel sistema:
 *      src/com/codigofacilito/sier/SierWithPackage.java
 *
 *  La compilacion requiere dar la ruta completa:
 *      javac com/codigofacilito/sier/SierWithPackage.java
 *
 *  Y la ejecucion debe usar el package:
 *      java com.codigofacilito.sier.SierWithPackage
 */
package com.codigofacilito.sier;

import com.codigofacilito.clase03.AgeCalculator;

public class SierWithPackage {
    public static void main(String[] args) {
        System.out.println("Hey! Yo tengo un package!");

        AgeCalculator ageCalculator;
    }
}
