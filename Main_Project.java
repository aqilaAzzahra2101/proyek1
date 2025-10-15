import java.util.Scanner;
public class Main_Project{

public static void main(String[] args){
Scanner input = new Scanner(System.in);
//membuat sebuah object

// "pegawai" merupakan class, lalu "Pegawai" merupakan objek yang akan dibuat, lalu "new pegawai();" merupakan constructor.

pegawai Pegawai = new pegawai();
manager Manager = new manager();
kasir Kasir = new kasir();
koki Koki = new koki();
pelayan Pelayan = new pelayan();
satpam Satpam = new satpam();





Manager.nama = "sifa";
Manager.id_pegawai = 1;
Manager.gaji = "7 Juta";

Kasir.nama = "Aldi";
Kasir.id_pegawai = 2;
Kasir.gaji = "1,2 Juta";

Koki.nama = "Reza";
Koki.id_pegawai = 3;
Koki.gaji = "2 Juta";

Pelayan.nama = "Dean";
Pelayan.id_pegawai = 4;
Pelayan.gaji = "1,2 Juta";

Satpam.nama = "Aldi";
Satpam.id_pegawai = 2;
Satpam.gaji = "1 Juta";

        System.out.print("Masukkan ID Pegawai (1-5): ");
        int id = input.nextInt();

        if (id == Manager.id_pegawai) {
            Manager.menampilkan();
            Manager.tugas();
        } else if (id == Kasir.id_pegawai) {
            Kasir.menampilkan();
            Kasir.tugas();
        } else if (id == Koki.id_pegawai) {
            Koki.menampilkan();
            Koki.tugas();
        } else if (id == Pelayan.id_pegawai) {
            Pelayan.menampilkan();
            Pelayan.tugas();
        } else if (id == Satpam.id_pegawai) {
            Satpam.menampilkan();
            Satpam.tugas();
        } else {
            System.out.println("ID Pegawai tidak ditemukan!");
        }
    }
}