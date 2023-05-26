package Dosen;

public class Matkul extends Dosen {
    public String nama_matkul;

    public Matkul(String nama_matkul, String nama_dosen) {
        super(nama_dosen);
        this.nama_matkul = nama_dosen;
    }

    @Override
    public void panggilDosen() {
        System.out.println("Nama Dosen " + super.nama_dosen);
        System.out.println("Mata Kuliah " + nama_matkul);
    }
}
