public class App {
    public static void main(String[] args) throws Exception {

        Node node1 = new Node("node1");

        Node node2 = new Node("node2");
        node1.setProximoNo(node2);

        Node node3 = new Node("node3");
        node2.setProximoNo(node3);

        Node node4 = new Node("node4");
        node3.setProximoNo(node4);


        System.out.println("Node 1: " + node1.getProximoNo());
        System.out.println("Node 1: " + node1.getProximoNo().getProximoNo());
        System.out.println("Node 1: " + node1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println("Node 1: " + node1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
        
    }
}
