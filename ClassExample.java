
class Student {
    int rollno;
    String name;
    int age;

    
    Student(int rollno, String name, int age) {
        this.rollno= rollno;
        this.name=name;
        this.age=age;
    }

    
    Student() {
        this.rollno = 0;
        this.name = " ";
        this.age = 0;
    }
}

public class ClassExample {
    public static void main(String[] args) {
        Student s1 = new Student(10, "kavi", 23);

        s1.rollno = 114;
        s1.name = "sushmitha";
        s1.age = 20;

        System.out.print(s1.rollno + " " + s1.name + " " + s1.age);
    }
}
