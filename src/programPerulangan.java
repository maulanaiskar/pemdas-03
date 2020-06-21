import java.util.Scanner;

public class programPerulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String namanasabah;
        double administrasi = 120000,depoAkhir, depoAwal, bunga, jumlahbersih, tahun;
        System.out.print("Masukkan Nama Nasabah                    : ");
        namanasabah=input.nextLine();
        System.out.print("Masukkan Jumlah Deposito Awal            : ");
        depoAwal = input.nextDouble();
        System.out.print("Masukkan Jangka Waktu Deposito (tahun)   : ");
        tahun=input.nextInt();
        for (int i= 1; i<=tahun; i++){
            jumlahbersih = depoAwal - administrasi;
            if (tahun>=10){
                bunga =  jumlahbersih * 25/100;
            }
            else  {
                bunga = jumlahbersih * 10/100;
            }
            depoAkhir = jumlahbersih + bunga;
            depoAwal=depoAkhir;
            System.out.println("Jumlah Deposito Pada Tahun Ke" + i + " " + depoAkhir);
        }
    }
}

