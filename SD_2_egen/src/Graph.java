import java.util.*;

public class Graph {
    private ArrayList<Vertex> vertices = new ArrayList<>();
    private Random r = new Random();

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void addEgdes(Vertex f, Vertex t, int weight) {
        f.addEgde(new Edge(f, t, weight));
        t.addEgde(new Edge(t, f, weight));
    }


    public int prims() {
        int totalDistance = 0;
        int loops = 0;

        ArrayList<Vertex> visitedVertices = new ArrayList<>();
        PriorityQueue<Vertex> Q = new PriorityQueue<>();
        ArrayList<Edge> tempEgdes = new ArrayList<>();

        Vertex currentVertex = vertices.get(r.nextInt(vertices.size()));
        currentVertex.setDist(0);
        Vertex tempVertex;

        Q.add(currentVertex);

        //So we can update the vertices
        for (Vertex v : vertices) {
            Vertex vs = new Vertex("null");
            vs.setPredessor("null");
            visitedVertices.add(vs);
        }

        while (!Q.isEmpty()) {
            currentVertex = Q.poll();


            if (!isVisited(currentVertex, visitedVertices)) {

                tempEgdes.addAll(currentVertex.getEdges());

                for (Edge e : tempEgdes) {
                    tempVertex = new Vertex(e.getTo());
                    tempVertex.setDist(e.getWeight());
                    tempVertex.setPredessor(currentVertex.getName());

                    Q.add(tempVertex);
                }

                tempEgdes.clear();

                for (Vertex v : visitedVertices) {
                    if (v.getName().equals("null")) {
                        v.setName(currentVertex.getName());
                        v.setDist(currentVertex.getDist());
                        v.setPredessor(currentVertex.getPredessor());
                        break;
                    }
                }

            }

            updateVertex(currentVertex, visitedVertices);

            loops++;

        }

        for (Vertex v : visitedVertices) {
            //System.out.println("Name " + v.getName() + " dist " + v.getDist() + " " + v.getPredessor());
            totalDistance += v.getDist();
        }

        System.out.println("Loops : " + loops + " Totaldistance = " + totalDistance);
        return totalDistance;
    }


    private boolean isVisited(Vertex v, ArrayList<Vertex> vs) {

        for (Vertex o : vs) {
            if (v.getName().equals(o.getName())) {
                return true;
            }
        }

        return false;
    }

    private boolean updateVertex(Vertex tempVertex, ArrayList<Vertex> vs) {

        for (Vertex v : vs) {
            if (tempVertex.equals(v) && tempVertex.getDist() < v.getDist()) {
                System.out.println("i update " + tempVertex.getName() + " from " + v.getDist() + " to " +  tempVertex.getDist()) ;
                v.setDist(tempVertex.getDist());
                return true;
            }
        }

        return false;
    }
}
