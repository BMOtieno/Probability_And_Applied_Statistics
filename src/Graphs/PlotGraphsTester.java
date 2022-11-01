package Graphs;
public class PlotGraphsTester {
    /**
     * Program that takes writes to a csv file, coordinates for a linear, salted and smoothed graphs
     * @author Brian Otieno Odhiambo
     *
     * */
    public static void main(String[] args) {
        //call to the method to produce the line graph output
        Plotter plotter = new Plotter();
        plotter.lineGraph();
        //call to the method to produce the salted graph output
        Salter salter = new Salter();
        salter.getSaltedGraph();
        //call to the method to produce the smooth graph output
        Smoother smoother = new Smoother();
        smoother.smoothTheGraph();
    }
}
