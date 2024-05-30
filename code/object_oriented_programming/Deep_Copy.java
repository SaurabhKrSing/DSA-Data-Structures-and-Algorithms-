class Address implements Cloneable {
     String city;

     Address(String city) {
          this.city = city;
     }

     protected Object clone() throws CloneNotSupportedException {
          return super.clone(); // Performs a shallow copy of Address
     }
}

class Person implements Cloneable {
     String name;
     Address address;

     Person(String name, Address address) {
          this.name = name;
          this.address = address;
     }

     protected Object clone() throws CloneNotSupportedException {
          Person cloned = (Person) super.clone();
          cloned.address = (Address) address.clone(); // Performs a deep copy of Address
          return cloned;
     }
}

public class Deep_Copy {
     public static void main(String[] args) throws CloneNotSupportedException {
          Address address = new Address("New York");
          Person person1 = new Person("John", address);
          Person person2 = (Person) person1.clone();

          System.out.println(person1.address.city); // Output: New York
          System.out.println(person2.address.city); // Output: New York

          person2.address.city = "Los Angeles";

          System.out.println(person1.address.city); // Output: New York
          System.out.println(person2.address.city); // Output: Los Angeles
     }
}
