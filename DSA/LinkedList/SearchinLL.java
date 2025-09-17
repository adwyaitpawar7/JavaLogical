public class SearchinLL {
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

  public static boolean Find(Node n, int element) {
    Node temp = n;
    while (temp != null) {
      if (temp.data == element) {
        return true;
      }
      temp = temp.next;
    }
    return false;

  }

  public static void main(String[] args) {
    int[] sampleArr = { 1, 2, 3, 4, 5 };
    Node head = ConvertTOArray(sampleArr);
    System.out.println(Find(head, 9));

  }
}
