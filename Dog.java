public class Dog {
  private int age;
  private String name;
  
  public Dog(String name, int age) {
    this.age = age;
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public int computeDogAge() {
    return this.age * 7;
  }
  
  public boolean equals(Dog that) {
    return (this.name.equals(that.name) && (this.age == that.age)) ;
  }

  public String toString() {
    String dogsname = "Dog's name: ";
    String dogsage = "Dog's age: ";
    return dogsname + name + "\t" + dogsage + age;
  }
}