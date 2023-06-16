import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Pengguna: ");
        String username = input.nextLine();

        System.out.print("Masukkan Jumlah Uang yang Akan Disimpan: ");
        double amount = input.nextDouble();

        SavingAccount savings = new SavingAccount(username, amount, 0.05);
        savings.deposit(500);
        savings.withdraw(200);
        double balance = savings.getBalance();
        System.out.println("Nama Pengguna: " + savings.getName());
        System.out.println("Saldo Sekarang: " + balance);

        // Menyimpan data ke file teks
        String filename = "data.txt";
        try {
            FileWriter fileWriter = new FileWriter(filename);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Nama Pengguna: " + savings.getName());
            bufferedWriter.newLine();
            bufferedWriter.write("Saldo Sekarang: " + balance);
            bufferedWriter.write()
            bufferedWriter.newLine();

            bufferedWriter.close();
            System.out.println("Data berhasil disimpan ke file: " + filename);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan dalam menyimpan data ke file: " + e.getMessage());
        }
    }
}