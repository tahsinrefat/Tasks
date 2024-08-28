class Animal {
    String name;
    void setName(String name){
        this.name = name;
    }
    void eat() {
        System.out.println(name+" is eating.");
    }
}

class Dog extends Animal {
    // the setter function and the String name is already here as that was extended or inherited
    void bark() {
        System.out.println(name+" is barking.");
    }
}

public class MyClass {
    public static void main(String args[]) {
        Animal animal =  new Animal();
        animal.setName("Animal");
        animal.eat();
        Dog dog = new Dog();
        dog.setName("Dog");
        dog.eat();
        dog.bark();
    }
}