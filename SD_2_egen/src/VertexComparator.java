import java.util.Comparator;

public class VertexComparator implements Comparator<Vertex> {


    @Override
    public int compare(Vertex vertex, Vertex t1) {
        if(vertex.getDist() < t1.getDist()){
            return 1;
        } else {
            return -1;
        }

    }
}
