import java.util.Objects;
import java.util.Scanner;

class imp {
    private int id;
    private String name;
    private String deportment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeportment() {
        return deportment;
    }

    public void setDeportment(String deportment) {
        this.deportment = deportment;
    }

    public imp(int id, String name, String deportment) {
        this.id = id;
        this.name = name;
        this.deportment = deportment;
    }


    public String toString() {
        return "imp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deportment='" + deportment + '\'' +
                '}';
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        imp imp = (imp) o;
        return id == imp.id && Objects.equals(name, imp.name) && Objects.equals(deportment, imp.deportment);
    }


    public int hashCode() {
        return Objects.hash(id, name, deportment);
    }
}


class Constructor1 {
    public static void main(String[] args) {
        imp arr[] = new imp[1];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the detail of " + (i + 1) + "imp in the order of id, name, dep");
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String dep = sc.nextLine();
            arr[i] = new imp(id, name, dep);
        }
        for (imp e : arr) {
           // System.out.println(e);
            e.setName("Praveen");
            System.out.println(e.getId());
            System.out.println(e.getName());
            System.out.println(e.getDeportment());
            e.setId(45);
            System.out.println(e.getId());
            System.out.println(e.getName());
        }
    }
}
