public class Student {
    private String name; // get method acess data, set method change data
    private int age;

    public Student(String name, int age) { //function named after the class, this function becomes a constructor (declares the things that needs to happen)
        this.name = name; 
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // this = for this class
    }

    public int getAge() { // get method, lets us acess the data
        return age;
    }

    public void setAge(int age) { // set lets us change/set the data
        this.age = age;
    }
}
