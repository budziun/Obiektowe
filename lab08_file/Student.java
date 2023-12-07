import java.util.Comparator;
class Student {
    int id;
    String name;
    double averageGrade;

    public Student(int id, String name, double averageGrade) {
        this.id = id;
        this.name = name;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "[ " + id + " " + name + " " + averageGrade + " ]";
    }
}
class AverageGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.averageGrade, student1.averageGrade);
    }
}
class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.id, student2.id);
    }
}