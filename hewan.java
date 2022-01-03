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
public class hewan extends Makhlukhidup{
    
  void kategori (String status_hewan)
    {
        if (status_hewan == "pemakan daging")
        {
            System.out.println("karnivora");
        }
        else if (status_hewan == "pemakan tumbuhan")
        {
            System.out.println("herbivora");
        }
        else if (status_hewan == "pemakan segalanya")
        {
            System.out.println("omnivora");
        }
        else
        {
            System.out.println("tidak masuk kategori");
        }
    }  
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) 
    {   
        hewan hewannya = new hewan ();
        hewannya.jenis_Makhlukhidup ("sapi");
        hewannya.sakit("");
        hewannya.kategori("pemakan tumbuhan");
      
        // TODO code application logic here
    }
}
