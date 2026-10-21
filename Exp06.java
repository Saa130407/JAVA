class Animal { String sound() { return "..."; } }
class Dog extends Animal {
    @Override String sound() { return super.sound() + " woof"; }
}
public class Exp06 {
    public static void main(String[] args) { Animal pet = new Dog(); System.out.println(pet.sound()); }
}