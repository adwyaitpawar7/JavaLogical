public class Deletek {
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

  public static Node Deletekth(Node head, int k) {
    if (head == null)
      return null;
    if (k == 1) {
      head = head.next;
      return head;
    }
    int count = 0;
    Node temp = head, prev = null;
    while (temp != null) {
      count++;
      if (k == count) {
        prev.next = prev.next.next;
        break;
      }
      prev = temp;
      temp = temp.next;
    }
    return head;
  }

  public static void main(String[] args) {
    int[] sampleArr = { 1, 2, 3, 4, 5 };
    Node head = ConvertTOArray(sampleArr);
    Print(head);
    System.out.println();
    head = Deletekth(head, 6);

    Print(head);
    head = Deletekth(head, 1);
    Print(head);

  }
}
