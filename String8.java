import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student1 {
    int rollnumber;
    String name;
    String college;
    String gender;
    int age;

    public Student1(int rollnumber, String name, String college, String gender, int age) {
        this.rollnumber = rollnumber;
        this.name = name;
        this.college = college;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "rollnumber=" + rollnumber +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}

class String8 {
    static int rollCount = 201074;

    public static void main(String[] args) throws IOException {
        Student1 students[] = new Student1[1];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter name of " + (i + 1) + " student");
            String name = br.readLine();
            System.out.println("Enter name of " + (i + 1) + " student college");
            String college = br.readLine();
            System.out.println("Enter name of " + (i + 1) + " student gender");
            String gender = br.readLine();
            System.out.println("Enter name of " + (i + 1) + " student age");
            int age = Integer.parseInt(br.readLine());
            students[i] = new Student1(++rollCount, name, college, gender, age);
        }
        for (Student1 s : students)
            System.out.println(s);
    }
}
