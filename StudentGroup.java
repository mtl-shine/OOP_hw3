import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private int studentGroupId;

    private List<Student> studentList;

    public StudentGroup(int studentGroupId, List<Student> studentList) {
        this.studentGroupId = studentGroupId;
        this.studentList = studentList;
    }

    public int getStudentGroupId() {
        return studentGroupId;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(studentList);
    }

    @Override
    public String toString() {
        return "Student group" + studentGroupId;
    }

}
