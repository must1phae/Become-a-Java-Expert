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
}
```

## ⚙️ UML Diagram – Character Inheritance Example

```mermaid
%%{init: {'theme': 'neutral', 'themeVariables': {
  'primaryColor': '#1f6feb',
  'edgeLabelBackground':'#ffffff',
  'fontSize': '14px',
  'lineColor': '#58a6ff',
  'primaryTextColor': '#ffffff',
  'tertiaryColor': '#161b22',
  'background': '#0d1117'
}}}%%

classDiagram
class Character {
    - name : String
    - health : int
    + attack() : void
    + defend() : void
}

class Warrior {
    + useSword() : void
}

class Magician {
    + castSpell() : void
}

class Thief {
    + steal() : void
}

Character <|-- Warrior
Character <|-- Magician
Character <|-- Thief

style Character fill:#161b22,stroke:#58a6ff,stroke-width:1px,color:#fff
style Warrior fill:#f9a825,stroke:#58a6ff,stroke-width:1px,color:#000
style Magician fill:#7e57c2,stroke:#58a6ff,stroke-width:1px,color:#fff
style Thief fill:#43a047,stroke:#58a6ff,stroke-width:1px,color:#fff

