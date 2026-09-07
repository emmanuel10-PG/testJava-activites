/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.java.activites.test;

/**
 *
 * @author ADMIN
 */
public class JavaActivitesTest {

    public static void main(String[] args) {
        
        int nbA = 4;
        int nbB = 2;
        
        int EntierTest = 8;
        String v = "teqt";
        String moto ="Suzuki";
        System.out.println(EntierTest);
        System.out.println(v.isEmpty());
        
        // resultat : la moto qui est passée est de marque 
       // Suzuki et il avais le symbole 8 inscrit derrière
        System.out.println("la moto qui est passée est de marque \n" +moto+" et il avais le symbole " +EntierTest +" inscrit derrière");
        
        // remplacer une lettre dans une chaine de caractère ou un caractère resultat : test le teqt le q a été remplacé par s
        System.out.println(v.replace('q', 's'));
        
        // connaitre le nombre de caractère d'une chaine de caratère
         System.out.println(moto.length());
         
         
         
         // methodes importées
         // la somme de deux nombres entier est 6
         // la multiplication de deux nombres entier est 8
         // la division de deux nombres entier est 2
         // NB les 3 methodes sont publiques car elles permettent de nous les faire utiliser ici :
         TestModule test = new TestModule();
         test.sommeTest(nbA , nbB);
         test.multTest(nbA , nbB);
         test.DivTest(nbA , nbB);
        
        
        
    }
}
