import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Student[] students = new Student[3];
        getInput(students);
        show(students);
    }

    public static void getInput(Student[] students){
        System.out.println("nhập thông tin");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < students.length; i++){
            students[i] = getStudent(scanner);
            System.out.println("--------------------------------");
        }

        scanner.close();
    }

    public static void show(Student[] students){
        System.out.println("in thong tin: ");
        for (Student student : students) {
            System.out.println(student.toString());
            System.out.println("Điểm trung bình: " + getGPA(student));
            System.out.println("--------------------------------");
        } 
    }

    public static double getGPA(Student student) {
        return (student.theoreticalScore + student.practicalScore) / 2;
    }

    public static Student getStudent(Scanner scanner){
        System.out.print("id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("\ntên: ");
        String name = scanner.nextLine();
        System.out.print("\nđiểm lý thuyết: ");
        
        int theoreticalScore = scanner.nextInt();
        System.out.print("\nđiểm thực hành: ");
        int practicalScore = scanner.nextInt();
        Student student = new Student(id, name, theoreticalScore, practicalScore);
        return student;
    }
}

