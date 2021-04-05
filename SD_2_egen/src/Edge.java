//Class for egdes

public class Edge implements Comparable<Edge>{
    private Vertex to;
    private Vertex from;
    private int weight;

    public Edge(Vertex from, Vertex to, int weight){
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public Vertex getTo(){
        return to;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Edge edge) {
        if (edge.getWeight() > this.weight ){
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return "Edge{" +
                "to=" + to +
                ", from=" + from +
                ", weight=" + weight +
                '}';
    }
}
