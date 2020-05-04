/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionreguliere;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Gauss
 */
public class ExpressionReguliere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pattern pattern;
        Matcher matcher;
        
        pattern = Pattern.compile(" ");
        matcher = pattern.matcher("Gauss est  malade et Nathan le soigne");
        while (matcher.find()){
            System.out.println("Kitoko");
        }
        
        
        }
        
    }
    

