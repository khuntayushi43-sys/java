public class p1 {

    interface Animal {
        void sound();
    }

    static class Dog implements Animal {
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat implements Animal {
        public void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
    }
}