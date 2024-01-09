
public class Node {
    
    private String conteudo; 
    private Node proximoNo; 


    public Node(String conteudo){

        this.proximoNo = null;
        this.conteudo = conteudo;
    }



    public String getConteudo() {
        return conteudo;
    }


    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }


    public Node getProximoNo() {
        return proximoNo;
    }


    public void setProximoNo(Node proximoNo) {
        this.proximoNo = proximoNo;
    }



    @Override
    public String toString() {
        return "Node [conteudo=" + conteudo + "]";
    }

    
}


