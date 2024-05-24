import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private List<Stream> streamsList;

    public StreamService(List<Stream> streamsList) {
        this.streamsList = streamsList;
    }

    public List<Stream> getStreamsList() {
        return streamsList;
    }

    public void addStream(Stream stream) {
        streamsList.add(stream);
    }

    public List<Stream> getSortedStreams() {
        List<Stream> streams = new ArrayList<>(getStreamsList());
        streams.sort(new StreamComparator());
        return streams;
    }

}
