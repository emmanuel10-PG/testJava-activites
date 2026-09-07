/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java.activites.test;

/**
 *
 * @author ADMIN
 */
public class TestModule {
    
    private int nbreA;
    private int nbreB;
    
    public void sommeTest(int nbreA ,int nbreB){
        
        System.out.println("la somme de deux nombres entier "+nbreA+" et "+nbreB+" est " +(nbreA+nbreB));
    }
    
    public void multTest(int nbreA ,int nbreB){
        
        System.out.println("la multiplication de deux nombres entier "+nbreA+" et "+nbreB+" est " +(nbreA*nbreB));
    }
    
    public void DivTest(int nbreA ,int nbreB){
        if(nbreB == 0){
            System.out.println("la division est impossible");
        }else{
            System.out.println("la division de deux nombres entier " +nbreA+ " et "+nbreB+" est " +(nbreA/nbreB));
        }
        
    }
    
}
