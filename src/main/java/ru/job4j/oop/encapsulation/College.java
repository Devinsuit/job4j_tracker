package ru.job4j.oop.encapsulation;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Viktorov");
        student.setGroup(111);
        student.setDateAdmission("12.11.2009");
        System.out.println(student.getName() + " study in the group number " + student.getGroup()
                + ". Admitted at " + student.getDateAdmission() + ".");
    }
}
