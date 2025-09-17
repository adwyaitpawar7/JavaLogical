public class LenOfLL {
  private static Node ConvertTOArray(int[] arr) {
    Node head = new Node(arr[0]);
    Node mover = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }
    return head;
  }

  private static int LenOfll(Node n) {
    int count = 0;
    Node temp = n;
    while (temp != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }

  public static void main(String[] args) {
    int[] sampleArr = { 1, 2, 3, 4, 5 };
    Node head = ConvertTOArray(sampleArr);
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
    System.out.println("Length of LinkedList is:" + LenOfll(head));
  }
}
