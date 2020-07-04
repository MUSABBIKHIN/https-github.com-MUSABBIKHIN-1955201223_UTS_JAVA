/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1955201223;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ALI
 */
public class contoh_bufferedReader {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nama;
		String alamat;
                String telfon;
                String umur;
                String pekerjaan;
		try
		{
                        System.out.print("Masukkan nama anda : "); // melakukan input nama
			nama = br.readLine();
			System.out.print("Masukkan alamat anda : "); // melakukan input alamat
			alamat = br.readLine();
                        System.out.print("Masukkan telfon anda : "); // melakukan input telfon
                        telfon = br.readLine();
                        System.out.print("Masukkan umur anda : "); // melakukan input umur
                        umur = br.readLine();
                        System.out.print("Masukkan pekerjaan anda : "); // melakukan input pekerjaan
                        pekerjaan = br.readLine();
			System.out.println("===============================");
			System.out.println("Nama anda : " + nama); // menampilkan pesan nama
			System.out.println("Alamat anda : " + alamat); // menampilkan pesan alamat
                        System.out.println("telfon anda : " + telfon); // menampilkan pesan telfon
                        System.out.println("umur anda : " + umur); // menampilkan pesan umur
                        System.out.println("pekerjaan anda : " + pekerjaan); // menampilkan pesan pekerjaan  
		}
		catch(IOException eox) // menangkap kesalahan
		{
			System.out.println(eox);
		}
	}
}
    
    

