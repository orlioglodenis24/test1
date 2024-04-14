package control;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public double getScholarship() {
        if (averageMark == 5) {
            return 1000;
        } else {
            return 900;
        }
    }

    public static class Aspirant extends Student {
        public Aspirant(String firstName, String lastName, String group, double averageMark) {
            super(firstName, lastName, group, averageMark);
        }

        @Override
        public double getScholarship() {
            if (averageMark == 5) {
                return 1500;
            } else {
                return 1200;
            }
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Denis", "Orlioglo", "TI232ru", 5);
        students[1] = new Aspirant("Sergei", "Marcacev", "AG21ru", 3);

        for (Student student : students) {
            System.out.println("Стипендия для: " + student.firstName + " " + student.lastName + ": " + student.getScholarship());
        }
    }
}
