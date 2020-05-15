import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class DobbelFSM {
    private Node currentNode;

    public DobbelFSM(){

    }

    public ArrayList<String> run (Node currentNode, HashMap<Node, List<Node>> con) {
        ArrayList<String> goneThrough = new ArrayList<String>();
        goneThrough.add(currentNode.getNaam());
        while (1==1) {

            List<Node> potentialNext = con.get(currentNode);
            Random rand = new Random();
            int index = rand.nextInt(potentialNext.size());
            //De volgende state wordt één van de twee mogelijk volgende met een 50/50 kans
            Node nextNode = potentialNext.get(index);
            //Als de huidige staat begint met dobbel is er een uitkomst, deze wordt geprint en de fsm stopt
            if ((potentialNext.get(index).getNaam()).matches("dobbel(.*)")) {
                goneThrough.add(nextNode.getNaam());
                return goneThrough;
                //return (goneThrough + " " +nextNode.getNaam());

            }
            goneThrough.add(nextNode.getNaam());
            currentNode = nextNode;


        }
    }






}
