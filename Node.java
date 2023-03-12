public class Node {
  private Object item;
  private Node next;
  
  Node() {}
  
  Node(Object item) { this.item = item; }
  
  public Object getItem(){
    return this.item;
  }
  
  public void setItem(Object item){
    this.item = item;
  }
  
  public Node getNext(){
    return this.next;
  }
  
  public void setNext(Node toAppend){
    this.next = toAppend;
  }    
}