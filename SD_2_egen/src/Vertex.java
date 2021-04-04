import java.util.ArrayList;

public class Vertex implements Comparable<Vertex> {
    private Integer dist = Integer.MAX_VALUE;
    private String name = "";
    private String predessor = "";
    private ArrayList<Edge> edges = new ArrayList<>();

    public Vertex(String name) {
        this.name = name;
    }


    // Copy constructer
    public Vertex(Vertex copy){
        name = copy.getName();

        // We don't need to make a new E
        for(Edge e : copy.getEdges()){
            edges.add(e);
        }
    }

    public void addEgde(Edge e) {
        edges.add(e);
    }



    @Override
    public int compareTo(Vertex v){
        return this.getDist().compareTo(v.getDist());
    }
    /*
    @Override
    public int compareTo(Vertex v) {
        if (this.dist < v.dist) {
            return -1;
        } else {
            return 1;
        }

    }

     */

    public String getName(){
        return name;
    }

    public void setDist(Integer dist) {
        this.dist = dist;
    }

    public Integer getDist() {
        return dist;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "dist=" + dist +
                ", name='" + name + '\'' +
                '}';
    }

    public void setPredessor(String predessor) {
        this.predessor = predessor;
    }

    public boolean equals(Vertex v){

        return name.equals(v.getName());
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPredessor() {
        return predessor;
    }


}
