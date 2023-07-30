package com.mycompany.employee;

public class Employee {
    int nip, gaji=3000000, bonus, potongan,waktuKerja,pajak;
    String name, status;
    
    public void setNip(int nip) {
        this.nip = nip;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void display(){
        System.out.println("\nNomor Induk Pegawai: "+this.nip);
        System.out.println("Nama: "+this.name);
        System.out.println("Status: "+this.status);
        System.out.println("Waktu Kerja: "+this.waktuKerja+" jam");
    }
    
    public void hitung(int waktu,String status){
        this.waktuKerja=waktu;
        this.status=status;
        if(waktu>=8){
            potongan=1000000;
        }
        else if(waktu<8){
            potongan= -1000000;
        }
        else{
            potongan=0;
        }
        
        if(status.equalsIgnoreCase("menikah")){
            bonus=10000000;
        }
        else {
            bonus=100000;
        }
        this.gaji+=bonus+potongan;
    }
    
    public void hitung(){
    this.pajak=this.gaji-(this.gaji*2/100);
    }

    
    
    
    
}
