public class Construct {
  public static void main(String[] args) {
    Student s1 = new Student("Saurabh");
    System.out.println(s1.name);
  }
}

class Student {
  String name;
  int roll;

  // Non parameterized
  Student() {
    System.out.println("Constructors called....");
  }

  // Parameterized
  Student(String name) {
    this.name = name;
  }

}
