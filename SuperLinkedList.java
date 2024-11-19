//Drew Mendelow, 11/19/24, pd 7
//This creates a SuperLinkedList that extends the LinkedList class
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
    private String vowels = "aeiou";

    public boolean removeVowels() {
        Iterator<String> iter = this.iterator();
        boolean found = false;
        while (iter.hasNext()){
            if(vowels.indexOf(iter.next().toLowerCase()) != -1){
                found = true;
                iter.remove();
            }//end if
        }//end while
        return found;
    }//end removeVowels

    public boolean removeConsonants() {
        Iterator<String> iter = this.iterator();
        boolean found = false;
        while (iter.hasNext()){
            if(vowels.indexOf(iter.next().toLowerCase()) == -1){
                found = true;
                iter.remove();
            }//end if
        }//end while
        return found;
    }//end removeConsonants

    public LinkedList<String> removeDuplicates() {
        Iterator<String> iter = this.iterator();
        LinkedList<String> list = new LinkedList<String>();
        for (int i = 0; i < size(); i++){
            boolean skip = true;
            iter = this.iterator();
            while (iter.hasNext()){
                if (get(i) == iter.next()){
                    if (!skip){
                        list.add(get(i));
                        iter.remove();
                        i--;
                    }//end if
                    skip = false;
                }//end if
            }//end while
        }//end for
        return list;
    }//end removeDuplicates

    public LinkedList<String> concatenateStrings() {
        LinkedList<String> list = new LinkedList<String>();
        ListIterator<String> iter = this.listIterator();
        list.add(iter.next());
        while (iter.hasNext()){
            list.add(list.getLast() + iter.next());
        }//end while
        return list;
    }//end concatenateStrings

    public LinkedList<String> mix(LinkedList<String> list2) {
        LinkedList<String> list = new LinkedList<String>();
        Iterator<String> iter = this.iterator();
        Iterator<String> iter2 = list2.iterator();
        while (iter.hasNext()){
            list.add(iter.next());
            list.add(iter2.next());
        }//end while
        return list;
    }//end mix

    public String toString() {
        Iterator<String> iter = this.iterator();
        String result = "";
        while (iter.hasNext()){
            result += iter.next() + ", ";
        }//end while
        result = result.substring(0, result.length()-2);
        return result;
    }//end toString
} // end SuperLinkedList