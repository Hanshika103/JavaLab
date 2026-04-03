package Inheritance;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {
    public void play() {
        System.out.println("Dog plays");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}