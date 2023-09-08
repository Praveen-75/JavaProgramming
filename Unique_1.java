import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Student {
    int rollnumber;
    String name;
    String college;
    String gender;
    int age;

    public Student(int rollnumber, String name, String college, String gender, int age) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.college = college;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollnumber=" + rollnumber +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}

class Unique_1 {
    static int rollCount = 201075;

    public static void main(String[] args) throws IOException {
        Student students[] = new Student[2];
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter name of " + (i + 1) + " student");
            String name = sc.nextLine();
            System.out.println("Enter name of " + (i + 1) + " college");
            String college = sc.nextLine();
            System.out.println("Enter the " + (i + 1) + " student gender");
            String gender = sc.nextLine();
            System.out.println("Enter the " + (i + 1) + " student age");
            int age = sc.nextInt();
            sc.nextLine();
            students[i] = new Student(++rollCount, name, college, gender, age);
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
