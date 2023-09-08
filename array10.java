class Student {
    private int age;
    private String name;
    private String college;
    private char gender;

    public Student(int age, String name, String college, char gender) {
        this.age = age;
        this.name = name;
        this.college = college;
        this.gender = gender;
    }

    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", gender='" + gender +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class array10 {
    public static void main(String[] args) {
        Student p1 = new Student(19, "Praveen", "SIRT", 'M');
        Student p2 = new Student(21, "Priti", "SIRTE", 'F');
        Student p3 = new Student(22, "Nitesh", "SIRTS", 'M');
        Student p4 = new Student(28, "Ram", "Patel", 'M');
        Student p5 = new Student(21, "Kratika", "nutan", 'F');
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
    }
}

