package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Dog dog = new Dog();
        dog.voice();

        Cat cat = new Cat();
        cat.voice();

        Wolf wolf = new Wolf();
        wolf.voice();

        Bars bars = new Bars();
        bars.voice();

    }
}
