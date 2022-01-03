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
public class jenis_hewan extends hewan{
    
    void jenis (String status_hewan)
    {
        if (status_hewan == "hidup di darat")
        {
            System.out.println("hewan darat");
        }
        else if (status_hewan == "hidup di laut")
        {
            System.out.println("hewan laut");
        }
        else if (status_hewan == "dapat terbang")
        {
            System.out.println("hewan udara");
        }
        else
        {
            System.out.println("bukan hewan");
        }
    }  
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) 
    {
        jenis_hewan jenisnya = new jenis_hewan ();
        jenisnya.jenis_Makhlukhidup ("sapi");
        jenisnya.sakit("");
        jenisnya.kategori("pemakan tumbuhan");
        jenisnya.jenis("hidup di darat");
      
        // TODO code application logic here
    }
}
