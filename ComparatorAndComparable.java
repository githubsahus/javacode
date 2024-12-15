package javacode;
import java.util.*;

class Student implements Comparable<Student>{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int compareTo(Student that) {
        return this.getAge() > that.getAge() ? 1 : -1;
    }
    public String getString(){
        return this.getName()+":"+this.getAge();
    }
    
}

public class ComparatorAndComparable {
    public static void main(String[] args) {
        List<Student> Students = new ArrayList<>();
        Students.add(new Student("Basava", 20));
        Students.add(new Student("Chandru", 19));
        Students.add(new Student("Shiva", 24));
        Students.add(new Student("Kariya", 18));

        Collections.sort(Students);
        for(Student s:Students){
            System.out.println(s.getString());
        }
    }
}
