//Drew Mendelow, 11/19/24, pd 7
//tester file for the SuperLinkedList
import java.util.Iterator;
import java.util.LinkedList;

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
    System.out.println();

    list2.add("D");
    list2.add("r");
    list2.add("e");
    list2.add("w");
    list2.add("M");
    System.out.println("list2:");
    System.out.println(list2.toString());
    System.out.println();

    list3.add("L");
    list3.add("A");
    list3.add("v");
    list3.add("a");
    list3.add("a");
    list3.add("a");
    list3.add("v");
    System.out.println("list3:");
    System.out.println(list3.toString());
    System.out.println();

    System.out.println("remove list1 vowels: " + list1.removeVowels());
    System.out.println("list1 without vowels:");
    System.out.println(list1.toString());
    System.out.println();

    System.out.println("remove list2 consonants: " + list2.removeConsonants());
    System.out.println("list2 without consonants:");
    System.out.println(list2.toString());
    System.out.println();

    System.out.println("returned value from removing list3 duplicates:");
    LinkedList<String> removeDups = list3.removeDuplicates();
    Iterator<String> iter = removeDups.iterator();
    while (iter.hasNext()){
      System.out.println(iter.next());
    }//end while
    System.out.println();

    System.out.println("returned value from concatenating list1:");
    LinkedList<String> concatenate = list1.concatenateStrings();
    Iterator<String> iter2 = concatenate.iterator();
    while (iter2.hasNext()){
      System.out.println(iter2.next());
    }//end while
    System.out.println();

    list2.add("P");
    list2.add("o");
    System.out.println("new list2:");
    System.out.println(list2.toString());
    System.out.println();

    System.out.println("returned value from mixing list1 and list2:");
    LinkedList<String> mix = list1.mix(list2);
    Iterator<String> iter3 = mix.iterator();
    while (iter3.hasNext()){
      System.out.println(iter3.next());
    }//end while
  } // end main
} // end class