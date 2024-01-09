
public class Node<T> {
    
    private T conteudo; 
    private Node<T> proximoNo; 


    public Node(T conteudo){

        this.proximoNo = null;
        this.conteudo = conteudo;
    }



    public T getConteudo() {
        return conteudo;
    }


    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }


    public Node<T> getProximoNo() {
        return proximoNo;
    }


    public void setProximoNo(Node<T> proximoNo) {
        this.proximoNo = proximoNo;
    }



    @Override
    public String toString() {
        return "Node [conteudo=" + conteudo + "]";
    }

    
}


