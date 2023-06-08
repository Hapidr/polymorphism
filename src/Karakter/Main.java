package Karakter;

public class Main {
    public static void main(String[] args) {
        Attack induk = null;

        Hero hero = new Hero("Melee", "Vergil");
        Tower tower = new Tower("Range", 200);

        induk = hero;
        induk.serang();

        induk = tower;
        induk.serang();
    }
}
