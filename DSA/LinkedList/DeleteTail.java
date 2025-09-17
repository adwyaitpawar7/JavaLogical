public class DeleteTail {
  public static Node ConvertTOArray(int[] arr) {
    Node head = new Node(arr[0]);
    Node mover = head;
    for (int i = 1; i < arr.length; i++) {
      Node temp = new Node(arr[i]);
      mover.next = temp;
      mover = temp;
    }
    return head;
  }

  public static void Print(Node n) {
    Node temp = n;
    while (temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }

  }

  public static Node RemoveHead(Node head) {
    if (head == null)
      return head;
    // head = head.next;
    return head.next;
  }

  public static Node RemoveTail(Node head) {
    if (head == null || head.next == null)
      return null;

    Node temp = head;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;
    return head;

  }

  public static void main(String[] args) {
    int[] sampleArr = { 1, 2, 3, 4, 5 };
    Node head = ConvertTOArray(sampleArr);
    Print(head);
    System.out.println();

    head = RemoveTail(head);
    Print(head);
  }
}
