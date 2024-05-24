import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudentGroup studentGroup1 = new StudentGroup(1, new ArrayList<>());
        StudentGroup studentGroup2 = new StudentGroup(2, new ArrayList<>());
        StudentGroup studentGroup3 = new StudentGroup(3, new ArrayList<>());
        StudentGroup studentGroup4 = new StudentGroup(4, new ArrayList<>());
        StudentGroup studentGroup5 = new StudentGroup(5, new ArrayList<>());
        StudentGroup studentGroup6 = new StudentGroup(6, new ArrayList<>());
        StudentGroup studentGroup7 = new StudentGroup(7, new ArrayList<>());
        StudentGroup studentGroup8 = new StudentGroup(8, new ArrayList<>());
        StudentGroup studentGroup9 = new StudentGroup(9, new ArrayList<>());
        StudentGroup studentGroup10 = new StudentGroup(10, new ArrayList<>());

        List<StudentGroup> studentGroupList1 = new ArrayList<>();
        List<StudentGroup> studentGroupList2 = new ArrayList<>();
        List<StudentGroup> studentGroupList3 = new ArrayList<>();
        List<StudentGroup> studentGroupList4 = new ArrayList<>();

        Stream stream1 = new Stream(1, studentGroupList1);
        stream1.addStudentGroup(studentGroup1);
        stream1.addStudentGroup(studentGroup2);
        stream1.addStudentGroup(studentGroup3);
        stream1.addStudentGroup(studentGroup4);
        stream1.addStudentGroup(studentGroup5);
        stream1.addStudentGroup(studentGroup6);
        stream1.addStudentGroup(studentGroup7);
        stream1.addStudentGroup(studentGroup8);
        stream1.addStudentGroup(studentGroup9);
        stream1.addStudentGroup(studentGroup10);

        Stream stream2 = new Stream(2, studentGroupList2);
        stream2.addStudentGroup(studentGroup1);
        stream2.addStudentGroup(studentGroup2);
        stream2.addStudentGroup(studentGroup3);
        stream2.addStudentGroup(studentGroup4);

        Stream stream3 = new Stream(3, studentGroupList3);
        stream3.addStudentGroup(studentGroup1);
        stream3.addStudentGroup(studentGroup2);
        stream3.addStudentGroup(studentGroup3);
        stream3.addStudentGroup(studentGroup4);
        stream3.addStudentGroup(studentGroup5);
        stream3.addStudentGroup(studentGroup6);

        Stream stream4 = new Stream(4, studentGroupList4);
        stream4.addStudentGroup(studentGroup1);
        stream4.addStudentGroup(studentGroup2);
        stream4.addStudentGroup(studentGroup3);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);
        streams.add(stream4);

        StreamService service = new StreamService(streams);
        printStreamList(service.getSortedStreams());
    }

    static void printStreamList(List<Stream> streams) {
        for (Stream stream : streams) {
            System.out.println(stream);
        }
    }
}
