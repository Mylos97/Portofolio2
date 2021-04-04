public class Main {


    public static void main(String args[]){
        Graph g = new Graph();
        createGraph(g);


        for(int i = 0 ; i < 100 ; i++){
            g.prims();
        }


    }


    public static void createGraph(Graph g){
        Vertex eskildstrup = new Vertex("Eskildstrup");
        Vertex maribo = new Vertex("Maribo");
        Vertex haslev = new Vertex("Haslev");
        Vertex holbæk = new Vertex("Holbæk");
        Vertex jægerspris = new Vertex("Jægerspris");
        Vertex kalundborg = new Vertex("Kalundborg");
        Vertex korsør = new Vertex("Korsør");
        Vertex køge = new Vertex("Køge");
        Vertex næstved = new Vertex("Næstved");
        Vertex ringsted = new Vertex("Ringsted");
        Vertex slagelse = new Vertex("Slagelse");
        Vertex nykøbingf = new Vertex("Nykøbing F");
        Vertex vordingborg = new Vertex("Vordingborg");
        Vertex roskilde = new Vertex("Roskilde");
        Vertex sorø = new Vertex("Sorø");
        Vertex nakskov = new Vertex("Nakskov");


        /*
        eskildstrup.addOutEdge(new Edge(eskildstrup, maribo, 28));
        eskildstrup.addOutEdge(new Edge(eskildstrup, nykøbingf, 13));
        eskildstrup.addOutEdge(new Edge(eskildstrup, vordingborg, 24));


         */
        g.addEgdes(eskildstrup, maribo, 28);
        g.addEgdes(eskildstrup, nykøbingf, 13);
        g.addEgdes(eskildstrup, vordingborg, 24);

        /*
        haslev.addOutEdge(new Edge(haslev, korsør, 60));
        haslev.addOutEdge(new Edge(haslev, køge, 24));
        haslev.addOutEdge(new Edge(haslev, næstved, 25));
        haslev.addOutEdge(new Edge(haslev, ringsted, 19));
        haslev.addOutEdge(new Edge(haslev, roskilde, 47));
        haslev.addOutEdge(new Edge(haslev, sorø, 34));
        haslev.addOutEdge(new Edge(haslev, slagelse, 48));
        haslev.addOutEdge(new Edge(haslev, vordingborg, 40));
         */
        g.addEgdes(haslev, korsør, 60);
        g.addEgdes(haslev, køge, 24);
        g.addEgdes(haslev, næstved, 25);
        g.addEgdes(haslev, ringsted, 19);
        g.addEgdes(haslev, roskilde, 47);
        g.addEgdes(haslev, sorø, 34);
        g.addEgdes(haslev, slagelse, 48);
        g.addEgdes(haslev, vordingborg, 40);


        /*
        holbæk.addOutEdge(new Edge(holbæk, jægerspris, 34));
        holbæk.addOutEdge(new Edge(holbæk, kalundborg, 44));
        holbæk.addOutEdge(new Edge(holbæk, korsør, 66));
        holbæk.addOutEdge(new Edge(holbæk, ringsted, 36));
        holbæk.addOutEdge(new Edge(holbæk, roskilde, 32));
        holbæk.addOutEdge(new Edge(holbæk, slagelse, 46));
        holbæk.addOutEdge(new Edge(holbæk, sorø, 34));
         */

        g.addEgdes(holbæk, jægerspris, 34);
        g.addEgdes(holbæk, kalundborg, 44);
        g.addEgdes(holbæk, korsør, 66);
        g.addEgdes(holbæk, ringsted, 36);
        g.addEgdes(holbæk, roskilde, 32);
        g.addEgdes(holbæk, slagelse, 46);
        g.addEgdes(holbæk, sorø, 34);


        /*
        jægerspris.addOutEdge(new Edge(jægerspris, korsør, 95));
        jægerspris.addOutEdge(new Edge(jægerspris, køge, 58));
        jægerspris.addOutEdge(new Edge(jægerspris, ringsted, 56));
        jægerspris.addOutEdge(new Edge(jægerspris, roskilde, 33));
        jægerspris.addOutEdge(new Edge(jægerspris, slagelse, 74));
        jægerspris.addOutEdge(new Edge(jægerspris, sorø, 63));


         */
        g.addEgdes(jægerspris, korsør, 95);
        g.addEgdes(jægerspris, køge, 58);
        g.addEgdes(jægerspris, ringsted, 56);
        g.addEgdes(jægerspris, roskilde, 33);
        g.addEgdes(jægerspris, slagelse, 74);
        g.addEgdes(jægerspris, sorø, 63);

        /*
        kalundborg.addOutEdge(new Edge(kalundborg, ringsted, 62));
        kalundborg.addOutEdge(new Edge(kalundborg, roskilde, 70));
        kalundborg.addOutEdge(new Edge(kalundborg, slagelse, 39));
        kalundborg.addOutEdge(new Edge(kalundborg, sorø, 51));


         */
        g.addEgdes(kalundborg, ringsted, 62);
        g.addEgdes(kalundborg, roskilde, 70);
        g.addEgdes(kalundborg, slagelse, 39);
        g.addEgdes(kalundborg, sorø, 51);

/*
        korsør.addOutEdge(new Edge(korsør, næstved, 45));
        korsør.addOutEdge(new Edge(korsør, slagelse, 20));


 */
        g.addEgdes(korsør, næstved, 45);
        g.addEgdes(korsør, slagelse, 20);

/*
        køge.addOutEdge(new Edge(køge, næstved, 45));
        køge.addOutEdge(new Edge(køge, ringsted, 28));
        køge.addOutEdge(new Edge(køge, roskilde, 25));
        køge.addOutEdge(new Edge(køge, vordingborg, 60));


 */
        g.addEgdes(køge, næstved, 45);
        g.addEgdes(køge, ringsted, 28);
        g.addEgdes(køge, roskilde, 25);
        g.addEgdes(køge, vordingborg, 60);

/*
        maribo.addOutEdge(new Edge(maribo, nakskov, 27));
        maribo.addOutEdge(new Edge(maribo, nykøbingf, 26));


 */
        g.addEgdes(maribo, nakskov, 27);
        g.addEgdes(maribo, nykøbingf, 26);

/*
        næstved.addOutEdge(new Edge(næstved, roskilde, 57));
        næstved.addOutEdge(new Edge(næstved, ringsted, 26));
        næstved.addOutEdge(new Edge(næstved, slagelse, 37));
        næstved.addOutEdge(new Edge(næstved, sorø, 32));
        næstved.addOutEdge(new Edge(næstved, vordingborg, 28));


 */
        g.addEgdes(næstved, roskilde, 57);
        g.addEgdes(næstved, ringsted, 26);
        g.addEgdes(næstved, slagelse, 37);
        g.addEgdes(næstved, sorø, 32);
        g.addEgdes(næstved, vordingborg, 28);

        /*
        ringsted.addOutEdge(new Edge(ringsted, roskilde, 31));
        ringsted.addOutEdge(new Edge(ringsted, sorø, 15));
        ringsted.addOutEdge(new Edge(ringsted, vordingborg, 58));


         */
        g.addEgdes(ringsted, roskilde, 31);
        g.addEgdes(ringsted, sorø, 15);
        g.addEgdes(ringsted, vordingborg, 58);

/*
        slagelse.addOutEdge(new Edge(slagelse, sorø, 14));


 */
        g.addEgdes(slagelse, sorø, 14);


        g.addVertex(eskildstrup);
        g.addVertex(haslev);
        g.addVertex(holbæk);
        g.addVertex(jægerspris);
        g.addVertex(kalundborg);
        g.addVertex(korsør);
        g.addVertex(køge);
        g.addVertex(maribo);
        g.addVertex(næstved);
        g.addVertex(ringsted);
        g.addVertex(slagelse);
        g.addVertex(nykøbingf);
        g.addVertex(vordingborg);
        g.addVertex(roskilde);
        g.addVertex(sorø);
        g.addVertex(nakskov);
    }

}
