public class LL
{
  private Node head;

  LL() {}
  
  public void addNode(Object x){
    Node current = this.head;
    
    if (current == null){
      head = new Node(x);
    } else {
      while (current.getNext() != null){
        current = current.getNext();
      }
      Node toAppend = new Node(x);
      current.setNext(toAppend);
    }
  }
  
  public void print(){
    Node cur = this.head;
    while(cur != null){
      System.out.println(cur.getItem());
      cur = cur.getNext();
    }
  }
  
}