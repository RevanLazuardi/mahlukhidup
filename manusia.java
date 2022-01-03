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
public class manusia extends Makhlukhidup {
    
    void pria (String status_manusia)
    {
        if (status_manusia == "berjakun")
        {
            System.out.println("pria dewasa");
        }
        else
        {
            System.out.println("wanita");
        }
    }
        
        void wanita (String status_manusia)
    {
        if (status_manusia == "tidak berjakun")
        {
            System.out.println("wanita");
        }
        else
        {
            System.out.println("bukan wanita");
        }
    }  
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        manusia seorang_manusia = new manusia ();
        seorang_manusia.jenis_Makhlukhidup ("manusia");
        seorang_manusia.sehat("tidak sakit");
        seorang_manusia.pria("berjakun");
      
        // TODO code application logic here
    }
    
}
