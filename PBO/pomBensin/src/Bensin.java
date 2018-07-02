/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiwi tidak diakui
 */
public class Bensin {

    public Bensin(String id, String nama, int harga, int harga_jual) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.harga_jual = harga_jual;
    }
    private String id;
    private String nama;
    private int harga;
    private int harga_jual;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga_jual() {
        return harga_jual;
    }

    public void setHarga_jual(int harga_jual) {
        this.harga_jual = harga_jual;
    }
}
