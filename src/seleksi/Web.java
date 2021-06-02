/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleksi;
import mahasiswa.Mahasiswa;

/**
 *
 * @author hp
 */
public class Web extends Mahasiswa implements MenghitungNilai{

    public Web(String nik, String nama, int nilaiTulis, int nilaiCoding, int nilaiWawancara) {
        super(nik, nama, nilaiTulis, nilaiCoding, nilaiWawancara);
    }

    public void setNilaiTulis(int nilaiTulis) {
        this.nilaiTulis = nilaiTulis;
    }

    public void setNilaiCoding(int nilaiCoding) {
        this.nilaiCoding = nilaiCoding;
    }

    public void setNilaiWawancara(int nilaiWawancara) {
        this.nilaiWawancara = nilaiWawancara;
    }

    @Override
    public double nilai() {
        return (super.nilaiTulis * 0.4) + (super.nilaiCoding * 0.35) + (super.nilaiWawancara * 0.25);
    }

    @Override
    public String keterangan() {
        if(this.nilai() >= 85) return "LULUS\nSelamat kepada " + super.nama + " telah diterima sebagai web";
        else return "GAGAL\nMohon maaf kepada " + super.nama + " telah ditolak sebagai web";
    }

   

    

    

       
}
