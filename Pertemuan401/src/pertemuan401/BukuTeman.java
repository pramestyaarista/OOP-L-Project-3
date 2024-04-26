
package pertemuan401;

import java.util.Scanner;

/**
 *
 * @author Tea
 */
public class BukuTeman {
    private int brs = 10;
    private int klm = 3;
    private int raktif = 0;
    String[][] BT = new String[brs][klm];
    
    Scanner dtIN = new Scanner(System.in);
    
    public void storedata() {
        int idx=0;
        raktif++;
        if(raktif > brs){
            System.out.println("Data sudah penuh");
            return;
        }
        if(raktif>0){
            idx=raktif-1;
        }
        System.out.println("Menambahkan data teman");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Nama Teman: ");
        BT[idx][0] = dtIN.nextLine();
        
        System.out.print("Alamat: ");
        BT[idx][1] = dtIN.nextLine();
        
        System.out.print("No Telpon: ");
        BT[idx][2] = dtIN.nextLine();
   }
    
    public void Update() {
        if (raktif == 0) {
            System.out.println("Tidak ada data teman yang tersedia untuk diupdate.");
            return;
        }

        System.out.println("Daftar Teman");
        System.out.println("~~~~~~~~~~~~");
        for (int i = 0; i < raktif; i++) {
            System.out.println((i+1) + ". Nama: " + BT[i][0] + ", Alamat: " + BT[i][1] + ", No Telpon: " + BT[i][2]);
        }

        System.out.print("Masukkan nomor teman yang ingin diupdate: ");
        int idx = dtIN.nextInt();
        dtIN.nextLine();

        if (idx >= 1 && idx <= raktif) {
            idx--;
            System.out.println("Mengubah data teman ke-" + (idx+1));
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Nama Teman: ");
            BT[idx][0] = dtIN.nextLine();

            System.out.print("Alamat: ");
            BT[idx][1] = dtIN.nextLine();

            System.out.print("No Telpon: ");
            BT[idx][2] = dtIN.nextLine();
            System.out.println("Data teman berhasil diubah.");
        } else {
            System.out.println("Nomor teman tidak valid.");
        }
    }
    
    public void Destroy() {
        if (raktif == 0) {
            System.out.println("Tidak ada data teman yang tersedia untuk dihapus.");
            return;
        }

        System.out.println("Daftar Teman");
        System.out.println("~~~~~~~~~~~~");
        for (int i = 0; i < raktif; i++) {
            System.out.println((i+1) + ". Nama: " + BT[i][0] + ", Alamat: " + BT[i][1] + ", No Telpon: " + BT[i][2]);
        }

        System.out.print("Masukkan nomor teman yang ingin dihapus: ");
        int idx = dtIN.nextInt();
        dtIN.nextLine();

        if (idx >= 1 && idx <= raktif) {
            idx--;
            for (int i = idx; i < raktif - 1; i++) {
                BT[i] = BT[i + 1];
            }
            raktif--;
            System.out.println("Data teman berhasil dihapus.");
        } else {
            System.out.println("Nomor teman tidak valid.");
        }
    }
    
    public void viewdata(){
        if (raktif == 0) {
            System.out.println("Tidak ada data teman yang tersedia.");
            return;
        }
        
        System.out.println("Daftar Teman");
        System.out.println("~~~~~~~~~~~~");
        for(int i=0; i<raktif; i++){
            System.out.println("Data teman ke-" + (i+1));
            System.out.println("Nama: "+BT[i][0]);
            System.out.println("Alamat: "+BT[i][1]);
            System.out.println("Kontak: "+BT[i][2]);
            System.out.println("--------------------");
        }
    }
}

