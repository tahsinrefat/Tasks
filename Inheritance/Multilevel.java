class Animal {
    void eat() {
        System.out.println("This animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy is weeping.");
    }
}

public class MyClass {
  public static void main(String args[]) {
    int x=10;
    int y=25;
    int z=x+y;

    System.out.println("Sum of x+y = " + z);
  }
}