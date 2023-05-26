package Dosen;

public class Main {
    public static void main(String[] args) {
        Dosen dos = null;

        Matkul matkul = new Matkul("Teknik Pemrgoraman", "Doni Andriansyah");
        Sks jumlah_sks = new Sks("3", "Doni Andriansyah");
        dos = matkul;

        System.out.println("");
        dos.panggilDosen();

        System.out.println();
        dos = jumlah_sks;
        dos.panggilDosen();
    }
}
