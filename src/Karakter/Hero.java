package Karakter;

public class Hero extends Attack {
    public String nama_char;

    public Hero(String tipe_char, String nama_char){
        super(tipe_char);
        this.nama_char = nama_char;
    }

    @Override
    public void serang() {
        System.out.println(this.nama_char + " Menyerang dengan cara " + super.tipe_char);
    }
}
