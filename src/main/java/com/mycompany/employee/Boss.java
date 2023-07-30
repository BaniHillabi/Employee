package com.mycompany.employee;

public class Boss extends Employee {
    
    @Override
    public void display(){
        System.out.println("\nNomor Induk Pegawai: "+this.nip);
        System.out.println("Nama: "+this.name);
        System.out.println("Status: "+this.status);
        System.out.println("Waktu Kerja: "+this.waktuKerja+" jam"); 
        System.out.println("Gaji Boss: Rp"+this.gaji);
        System.out.println("Gaji Boss setelah kena pajak: Rp"+this.pajak);
    }
}
