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
public class tumbuhan extends Makhlukhidup{
    
    void monokotil (String status_tumbuhan)
    {
        if (status_tumbuhan == "berbiji satu")
        {
            System.out.println("monokotil");
        }
        else
        {
            System.out.println("bukan monokotil");
        }
    }  
    
    void dikotil (String status_tumbuhan)
    {
        if (status_tumbuhan == "berbiji dua")
        {
            System.out.println("dikotil");
        }
        else
        {
            System.out.println("bukan dikotil");
        }
    }  
    
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) 
    {
        tumbuhan jenis_tumbuhan = new tumbuhan ();
        jenis_tumbuhan.jenis_Makhlukhidup ("tumbuhan singkong");
        jenis_tumbuhan.sehat("tidak sakit");
        jenis_tumbuhan.dikotil("berbiji dua");
      
        // TODO code application logic here
    }
}
