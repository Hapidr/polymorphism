package Dosen;

public class Sks extends Dosen{
    public String sks;

    public Sks(String sks, String nama_dosen) {
        super(nama_dosen);
        this.sks = sks;
    }

    @Override
    public void panggilDosen() {
        System.out.println("Nama Dosen " + super.nama_dosen);
        System.out.println("Jumlah Sks " + this.sks);
    }
}
