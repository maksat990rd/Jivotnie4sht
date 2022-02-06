package com.company;

public class Main {
    /**
     * Создайте класс Fish, Parrot, Cat и Dog.
     * Изобретайте их свойства
     * Создайте несколько объектов и придайте им значения
     * Извлеките их в консоль
     * Сети добытчиков следует использовать для привлечения внимания и получения
     */

    public static void main(String[] args) {
//        Fish lev = new Fish();
//        lev.setName("Tigra");
//        lev.setColor("Jeltiy");
//        lev.setEayr(22);
//        lev.setDamage(312);
//        System.out.println(lev.getName()+" "+lev.getColor()+" "+lev.getEayr()+" "+lev.getDamage());
        Fish2 kit = new Fish2();
        kit.setName("Nemo");
        kit.setColore("Krasniy");
        kit.setYear(23);
        kit.setDamege(250);
        System.out.println("Fish info: " + kit.getName() + " "
                + kit.getColore() + " "
                + kit.getYear() + " Godikov "
                + " " + kit.getDamege() + " Урона");

        Dog sobaka = new Dog();
        sobaka.setName("Gufi");
        sobaka.setColor("Seriy");
        sobaka.setYear(12);
        sobaka.setDamage(620);
        System.out.println("Dog info: " + sobaka.getName() +" "
                + sobaka.getColor() +" "
                + sobaka.getYear() + " Godikov" + " "
                + sobaka.getDamage()+ " Urona");

        System.out.println();

        Cat koshka = new Cat();
        koshka.setName("Garfild");
        koshka.setColor("Rozoviy");
        koshka.setYear(15);
        koshka.setDamage(420);
        koshka.showinfo();

        System.out.println();

     Parrot pituh = new Parrot();
     pituh.setName("kukareeku");
     pituh.setYear(24);
     pituh.setColor("red");
     pituh.setDamage(560);
     pituh.showinfo();
    }
}
