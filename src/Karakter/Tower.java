package Karakter;

public class Tower extends Attack {
    public int damage;

    public Tower(String tipe_char, int damage) {
        super(tipe_char);
        this.damage = damage;
    }

    @Override
    public void serang() {
        System.out.println("Tower menyerang sebesar " + this.damage + " dengan cara " + super.tipe_char);
    }
}
