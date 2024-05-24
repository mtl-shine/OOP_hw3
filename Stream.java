import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup> {

    private int streamId;
    private List<StudentGroup> studentGroupList;

    public Stream(int streamId, List<StudentGroup> studentGroupList) {
        this.streamId = streamId;
        this.studentGroupList = studentGroupList;
    }

    public int getStreamId() {
        return streamId;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public int getStreamSize() {
        return studentGroupList.size();
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        studentGroupList.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        Iterator<StudentGroup> iterator = new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < studentGroupList.size();
            }

            @Override
            public StudentGroup next() {
                return studentGroupList.get(index++);
            }
        };
        return iterator;
    }

    @Override
    public String toString() {
        return "Stream ID " + streamId + ":\nStudent group list: " + studentGroupList;
    }

}