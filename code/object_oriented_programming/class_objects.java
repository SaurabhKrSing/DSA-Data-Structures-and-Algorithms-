// package code.object_oriented_programming;

public class class_objects {
  public static void main(String[] args) {

    // Object : Objects are entities in the real world
    // Class : Class are group of these entities

    Pen p1 = new Pen(); // Create a pen object called "p1"

    p1.setColor("Black");
    System.out.println(p1.color);

    p1.setPrice(25);
    System.out.println(p1.price);

    p1.setTip(20);
    System.out.println(p1.tip);

    p1.setSize(10);
    System.out.println(p1.size);
  }
}

class Pen {
  String color;
  int price;
  int tip;
  int size;

  void setColor(String newColor) {
    color = newColor;
  }

  void setPrice(int newPrice) {
    price = newPrice;
  }

  void setTip(int newTip) {
    tip = newTip;
  }

  void setSize(int newSize) {
    size = newSize;
  }

}

// class Student {
// String name;
// int age;
// float percentage;

// void calculatePercentage(int phy, int chem, int math) {
// percentage = (phy + chem + math) / 3;
// }
// }
