public class Main {
    public static void main(String[] args) {

        StudentOnlyNext students = new StudentOnlyNext();
        students.add();
        students.add();
        students.add();
        System.out.println(students);
        students.remove(-1);
        System.out.println(students);
        System.out.println(students.get(-1));
        System.out.println(students.get(0));
        students.remove(0);
        System.out.println(students);
        System.out.println(students.size());
        students.clear();
        System.out.println(students);
        System.out.println(students.isEmpty());

        StudentNextPreviousPerform npStudents = new StudentNextPreviousPerform();
        npStudents.add();
        npStudents.add();
        npStudents.add();
        System.out.println(npStudents);
        npStudents.remove(-1);
        System.out.println(npStudents);
        System.out.println(npStudents.get(-1));
        System.out.println(npStudents.get(0));
        npStudents.remove(0);
        System.out.println(npStudents);
        System.out.println(npStudents.size());
        npStudents.clear();
        System.out.println(npStudents);
        System.out.println(npStudents.isEmpty());
    }
}
