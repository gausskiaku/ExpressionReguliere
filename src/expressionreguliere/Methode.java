/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionreguliere;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;

/**
 *
 * @author Gauss
 */
public class Methode {
    
    
         
        
    public String Recherche (String mot){
        String reponse = "";
//        Pattern pattern = Pattern.compile(" ");
//        Matcher matcher = pattern.matcher(mot.trim());
        if(Pattern.compile("[a-zA-Z][a-zA-Z] [a-zA-Z]").matcher(mot.trim()).find()){
        reponse = "Vous venez d'introduire une phrase";
        }
        else if (Pattern.compile("[a-zA-Z] [a-zA-Z] [a-zA-Z]").matcher(mot.trim()).find()){
        reponse = "Vous venez d'introduire des lettres";
        }
        
        else if (Pattern.compile("[a-zA-Z][a-zA-Z]").matcher(mot.trim()).find()){
        reponse = "Vous venez d'introduire un mot";
        }
        else if (Pattern.compile("^\\d+$").matcher(mot.trim()).find()){
        reponse = "Vous venez d'introduire des chiffres";
        }
//        else if (Pattern.compile("[&~\"\'#-\{\}\^\@]").matcher(mot.trim()).find()){
//        reponse = "Vous venez d'introduire un caractere spacial";
//        }
        return reponse;
    }    
        
    public String Majuscule (String mot){
    String reponse = "";
    if (mot.matches("[A-Z]")){
     reponse = "Vous venez d'introduire une lettre Majuscule";
    }
    else if (mot.matches("[a-z]")){
     reponse = "Vous venez d'introduire une lettre Miniscule";
    }
    
    return reponse;
    }
    
    
    public String LettreVoyelle (String mot) {
    String reponse = "";
    
    if(mot.matches("[bcdfghjklmnpqrstvwxzBCDFGHJKLMNPQRSTVWXZ]"))
    {
     reponse = " C'est egalement une consonne";
    }
    else if (mot.matches("[aeuioyAEUIOY]")){
    reponse = " C'est egalement une voyelle";
    }
    
    return reponse;
    }
    
    public String Chiffres (String mot){
    String reponse = "";
    
    if(mot.matches("^\\d+$")){
    reponse = "Vous venez d'introduire un chiffre";
    }
    return reponse;    
    }
    
}
