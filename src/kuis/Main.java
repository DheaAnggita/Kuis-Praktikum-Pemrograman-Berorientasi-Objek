/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.util.Scanner;
import seleksi.Android;
import seleksi.Web;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nik, nama;
        int pilih, nilaiTulis, nilaiCoding, nilaiWawancara;
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        
        System.out.println("FORM PENDAFTARAN PT.HIDUP SEJAHTERA");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        pilih = input1.nextInt();
        
        System.out.println("\nFORM PENDAFTARAN\n");
        System.out.print("Input NIK : ");
        nik = input.nextLine();
        System.out.print("Input Nama : ");
        nama = input.nextLine();
        System.out.print("Input Nilai Tes Tulis : ");
        nilaiTulis = input1.nextInt();
        System.out.print("Input Nilai Tes Coding : ");
        nilaiCoding = input1.nextInt();
        System.out.print("Input Nilai Tes Wawancara : ");
        nilaiWawancara = input1.nextInt();
        
        if(pilih == 1){
            Android android = new Android(nik, nama, nilaiTulis, nilaiCoding, nilaiWawancara);
            do{
            System.out.println("\nMENU");
            System.out.println("1. Edit");
            System.out.println("2. Tampil");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = input1.nextInt();
            
            if(pilih == 1){
                System.out.print("Input Nilai Tes Tulis : ");
                android.setNilaiTulis(input1.nextInt());
                System.out.print("Input Nilai Tes Coding : ");
                android.setNilaiCoding(input1.nextInt());
                System.out.print("Input Nilai Tes Wawancara : ");
                android.setNilaiWawancara(input1.nextInt());
            }
            else if (pilih == 2){
                System.out.println("Nilai akhir : " + android.nilai());
                System.out.println("KETERANGAN : " + android.keterangan());
            }
            else {
                break;
            }
            }while(true);
        }
        else if (pilih == 2){
            Web web = new Web(nik, nama, nilaiTulis, nilaiCoding, nilaiWawancara);
            do{
            System.out.println("\nMENU");
            System.out.println("1. Edit");
            System.out.println("2. Tampil");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = input1.nextInt();
            
            if(pilih == 1){
                System.out.print("Input Nilai Tes Tulis : ");
                web.setNilaiTulis(input1.nextInt());
                System.out.print("Input Nilai Tes Coding : ");
                web.setNilaiCoding(input1.nextInt());
                System.out.print("Input Nilai Tes Wawancara : ");
                web.setNilaiWawancara(input1.nextInt());
            }
            else if (pilih == 2){
                System.out.println("Nilai akhir : " + web.nilai());
                System.out.println("KETERANGAN : " + web.keterangan());
            }
            else {
                break;
            }
            }while(true);
        }
        
    }
    
}
