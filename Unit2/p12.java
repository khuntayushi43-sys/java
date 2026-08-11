//program to extend one interface into another interface

public class p2 {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
    }
}
interface Animal {
    void eat();
}

// Interface extending another interface
interface Dog extends Animal {
    void bark();
}

// Class implementing the extended interface
class Puppy implements Dog {

    public void eat() {
        System.out.println("Puppy is eating");
    }

    public void bark() {
        System.out.println("Puppy is barking");
    }
}

