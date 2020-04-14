package com.contoh.recyclerview;

public class Mahasiswa {

    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getnim() {
        return nim;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }
}

