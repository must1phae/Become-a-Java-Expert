# 🧬 Java Inheritance

Java **Inheritance** is a mechanism where one class (called the *subclass* or *child class*) can acquire the properties and behaviors (fields and methods) of another class (called the *superclass* or *parent class*).  
It helps in **code reusability**, **method overriding**, and **polymorphism**.

---

## 🧠 Concept Overview

- **Superclass (Parent Class)** → The class whose features are inherited.  
- **Subclass (Child Class)** → The class that inherits from another class.  
- **Keyword:** `extends`

➡️ **Syntax:**

```java
class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child class method");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display(); // Inherited from Parent
        obj.show();    // Defined in Child
    }
}```
