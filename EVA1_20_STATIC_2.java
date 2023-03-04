/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_20_static_2;

/**
 *
 * @author eduar
 */
public class EVA1_20_STATIC_2 {

    public static void main(String[] args) {
        
        //de nada sirve el objeto si tdo el méxtodo es estático
        System.out.println("PI: "+FormulasGeometria.PI);
        System.out.println("AREA TRIANGULO: "+FormulasGeometria.areaTriangulo(5.0, 5.0));
        System.out.println("VOLUMEN DE LA ESFERA: "+FormulasGeometria.volumenEsfera(10.0));
        
    }
}
