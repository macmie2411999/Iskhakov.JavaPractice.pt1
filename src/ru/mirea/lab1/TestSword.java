package ru.mirea.lab1;

public class TestSword {
    public static void main(String[] args) {
        Sword sw1 = new Sword("Kurina no1", 30);
        Sword sw2 = new Sword("Kurina no2");
        Sword sw3 = new Sword(27);
        Sword sw4 = new Sword();
        sw3.setName("Kurina no3");
        System.out.println(sw1);
        System.out.println(sw2);
        System.out.println(sw3);
        System.out.println(sw4);
    }
}
