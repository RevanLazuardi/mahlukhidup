/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makhlukhidup;

/**
 *
 * @author ASUS
 */
public class Makhlukhidup {

    /**
     * @param args the command line arguments
     */
    void jenis_Makhlukhidup (String jenis)
    {
         System.out.println (jenis) ;
    }
 
   
    void sehat (String status_Makhlukhidup)
    {
        if (status_Makhlukhidup == "tidak sakit")
        {
            System.out.println("sehat");
        } 
        else
        {
            System.out.println("tidak sehat");
        }    
    }
    
    void sakit (String status_Makhlukhidup)
    {
            System.out.println("sakit");    
    }
    
    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) 
    {
        Makhlukhidup makhluknya = new Makhlukhidup ();
        makhluknya.jenis_Makhlukhidup("manusia");
        makhluknya.sehat ("tidak sakit");
        
      
        // TODO code application logic here
    }
}



