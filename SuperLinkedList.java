import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class SuperLinkedList extends LinkedList<String> {
    private String vowels = "aeiou";

    public boolean removeVowels() {
        Iterator iter = this.iterator();
        boolean found = false;
        while (iter.hasNext()){
            if(vowels.indexOf(iter.next().toString().toLowerCase()) != -1){
                found = true;
                iter.remove();
            }
        }
        return found;
    }

    public boolean removeConsonants() {
        Iterator iter = this.iterator();
        boolean found = false;
        while (iter.hasNext()){
            if(vowels.indexOf(iter.next().toString().toLowerCase()) == -1){
                found = true;
                iter.remove();
            }
        }
        return found;
    }

    public LinkedList<String> removeDuplicates() {
        Iterator iter = this.iterator();
        LinkedList list = new LinkedList();
        for (int i = 0; i < size(); i++){
            boolean skip = true;
            iter = this.iterator();
            while (iter.hasNext()){
                if (get(i) == iter.next().toString()){
                    if (!skip){
                        list.add(get(i));
                        iter.remove();
                        i--;
                    }
                    skip = false;
                }
            }
        }
        return list;
    }

    public LinkedList<String> concatenateStrings() {
        LinkedList list = new LinkedList();
        ListIterator iter = this.listIterator();
        iter.next();
        while (iter.hasNext()){
            String val = iter.previous().toString();
            iter.next();
            list.add(val + iter.next()toString());
        }
        return list;
    }

    public LinkedList<String> mix(LinkedList<String> list2) {
        LinkedList list = new LinkedList();
        Iterator iter = this.iterator();
        Iterator iter2 = list2.iterator();
        while (iter.hasNext()){
            list.add(iter.next().toString());
            list.add(iter2.next().toString());
        }
        return list;
    }

    public String toString() {
        Iterator iter = this.iterator();
        String result = "";
        while (iter.hasNext()){
            result += iter.next().toString() + ", ";
        }
        result = result.substring(0, result.length()-2);
        return result;
    }
} // end SuperLinkedList