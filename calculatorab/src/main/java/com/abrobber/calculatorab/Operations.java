/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abrobber.calculatorab;

/**
 *
 * @author roberto
 */
public class Operations {

    public float suma(float n1, float n2) {
        return n1 + n2;
    }

    public float resta(float n1, float n2) {
        return n1 - n2;
    }

    public float multiplica(float n1, float n2) {
        return n1 * n2;
    }

    public float divide(float n1, float n2) {
        if(n2!=0){
            return n1 / n2;
        }else{
            System.err.print("<< Error, no se puede dividir entre 0 >>");
            return 0;
        }        
    }
}
