package com.mycompany.employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        System.out.println("=================PT Sejahtera Indonesia=================");
        System.out.println("1. Employee\n2. Boss\n3. Manager\n4. Cleaning Service"); 
        System.out.println("Pilih jabatan anda: ");
        pilih = input.nextInt();
        switch (pilih) {
            case 1:
                Employee a = new Employee();
                a.setName("Orang 1");
                a.setNip(12);
                a.hitung(10, "menikah");
                a.hitung();
                a.display(); 
                break;
            
            case 2:
                Boss b = new Boss();
                b.setName("Orang 2");
                b.setNip(10);
                b.hitung(11, "cerai");
                b.hitung();
                b.display();
                break;
                
            case 3:
                Manager c = new Manager();
                c.setName("Orang 3");
                c.setNip(15);
                c.hitung(8, "menikah");
                c.hitung();
                c.display();
                break;
                
            case 4:
                CleaningService d = new CleaningService();
                d.setName("Orang 4");
                d.setNip(9);
                d.hitung(5, "bujang");
                d.hitung();
                d.display();
                break;
                
            default:
                System.out.println("Salah input");
                break;
        }
        
    }
    
}
