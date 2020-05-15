public class Node {
    private Node nodeA;
    private Node nodeB;
    private String naam;

    public Node(String nm){
        naam = nm;
    }

    public String getNaam() {
        return naam;

    }

    public void setNodeA(Node n){
        nodeA = n;
    }

    public void setNodeB(Node n){
        nodeB = n;
    }

    public Node getNodeA() {
        return nodeA;
    }

    public Node getNodeB() {
        return nodeB;
    }

}
