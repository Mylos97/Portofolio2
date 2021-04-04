public class Edge {
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
}
