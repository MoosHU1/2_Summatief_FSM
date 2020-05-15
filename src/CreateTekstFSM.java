import java.util.ArrayList;

public class CreateTekstFSM {

    public static TekstFSM createTekstFSM(){
        Node ts0 = new Node("ts0");
        Node ts1 = new Node("ts1");
        Node ts2 = new Node("ts2");
        Node ts3 = new Node("ts3");

        //Verbindingen
        ts0.setNodeA(ts2);
        ts0.setNodeB(ts1);

        ts2.setNodeB(ts2);
        ts2.setNodeA(ts1);

        ts2.setNodeB(ts3);

        ts3.setNodeB(ts0);
        ts3.setNodeA(ts3);

        ArrayList<Node> nodes = new ArrayList<Node>();
        nodes.add(ts0);
        nodes.add(ts1);
        nodes.add(ts2);
        nodes.add(ts3);

        return new TekstFSM(nodes);
    }

}
