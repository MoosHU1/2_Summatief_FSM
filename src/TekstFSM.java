import java.util.ArrayList;

public class TekstFSM {
    private ArrayList<Node> nodes;
    private Node currentNode;


    public TekstFSM(ArrayList<Node> al) {
        nodes = al;
        currentNode = nodes.get(0);

    }




    public ArrayList<String> run(String input) {
        ArrayList<String> goneThrough = new ArrayList<String>();
        goneThrough.add(currentNode.getNaam());

        for (int index = 0; index < input.length(); index++) {
            char letter = input.charAt(index);
            if (letter == 'A') {
                if (currentNode.getNodeA() == null){
                    return goneThrough;
                }
                currentNode = currentNode.getNodeA();

            }
            if (letter == 'B') {
                if (currentNode.getNodeB() == null){
                    return goneThrough;
                }
                currentNode = currentNode.getNodeB();
            }
            goneThrough.add(currentNode.getNaam());




        }
        return goneThrough;

    }
}
