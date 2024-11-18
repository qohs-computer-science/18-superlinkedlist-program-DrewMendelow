class SLLTester {
  public static void main(String[] args) {
    SuperLinkedList list1 = new SuperLinkedList();
    SuperLinkedList list2 = new SuperLinkedList();
    SuperLinkedList list3 = new SuperLinkedList();
    list1.add("a");
    list1.add("B");
    list1.add("c");
    list1.add("D");
    list1.add("e");
    System.out.println("list1:");
    System.out.println(list1.toString());

    list2.add("D");
    list2.add("r");
    list2.add("e");
    list2.add("w");
    list2.add("M");
    System.out.println("list2:");
    System.out.println(list2.toString());

    list3.add("a");
    list3.add("B");
    list3.add("c");
    list3.add("D");
    list3.add("e");
    System.out.println("list3:");
    System.out.println(list3.toString());
  } // end main
} // end class