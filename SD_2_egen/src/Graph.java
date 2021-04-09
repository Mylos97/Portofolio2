import java.util.*;

// Class for the graph
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


        //Let's not forget the first road
        tempEgdes.addAll(currentVertex.getEdges());
        Collections.sort(tempEgdes);
        totalDistance += tempEgdes.get(0).getWeight();



        //Init of the final MST
        for (Vertex v : vertices) {
            Vertex vs = new Vertex("null");
            vs.setPredessor("null");
            visitedVertices.add(vs);
        }

        //We check all vertices
        while (!Q.isEmpty()) {
            currentVertex = Q.poll();



            if (!isVisited(currentVertex, visitedVertices)) {


                //Check all the egdes from that vertices
                tempEgdes.addAll(currentVertex.getEdges());
                for (Edge e : tempEgdes) {
                    //Create a new vertex so we don't update the ones in the vertices list
                    tempVertex = new Vertex(e.getTo());
                    tempVertex.setDist(e.getWeight());
                    tempVertex.setPredessor(currentVertex.getName());

                    Q.add(tempVertex);
                }


                tempEgdes.clear();


                //Update the init arraylist
                for (Vertex v : visitedVertices) {
                    if (v.getName().equals("null")) {
                        v.setName(currentVertex.getName());
                        v.setDist(currentVertex.getDist());
                        v.setPredessor(currentVertex.getPredessor());

                        break;
                    }
                }

            }

            //Check if currentvertex is better than a previous one
            updateVertex(currentVertex, visitedVertices);

        }

        for (Vertex v : visitedVertices) {
            System.out.println("Name " + v.getName() + " dist " + v.getDist() + " " + v.getPredessor());
            totalDistance += v.getDist();
        }



        System.out.println("Loops : " + loops + " Totaldistance = " + totalDistance + " Price = " + totalDistance * 100000 + " kr");
        return totalDistance;
    }



    //Check if the vertice has been visited
    private boolean isVisited(Vertex v, ArrayList<Vertex> vs) {

        for (Vertex o : vs) {
            if (v.getName().equals(o.getName())) {
                return true;
            }
        }

        return false;
    }

    //Update the vertex if it's better
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




    // Another algorithm to check if the answer is correct
    public int primsV2(){
        int totaldistance = 0;
        PriorityQueue<Vertex> Q = new PriorityQueue<>();
        ArrayList<Vertex> visited = new ArrayList<>();
        ArrayList<Edge> tempRoads = new ArrayList<>();
        Vertex currentVertex;

        visited.add(vertices.get(r.nextInt(vertices.size())));
        Q.add(visited.get(0));



        while (!Q.isEmpty()){
            currentVertex = Q.poll();

            //Add the roads going from that vertex
            tempRoads.addAll(currentVertex.getEdges());
            //Let's check the lowest roads first
            Collections.sort(tempRoads);


            for(Edge e : tempRoads){


                if(!isVisited(e.getTo(),visited)){
                    //Add that vertex to the queue and the visited list
                    Q.add(e.getTo());
                    totaldistance += e.getWeight();
                    visited.add(e.getTo());
                    //Restart so we start at the start of the roads again

                    //We use the from and to from edge to print it
                    System.out.println("Current: " + e.getFrom().getName() + " going to " + e.getTo().getName() + " with distance " + e.getWeight());
                    break;
                }
            }

        }

        System.out.println("We visited all cities and the cost is " + totaldistance * 100000 + " kr.-");
        return totaldistance;
    }
}
