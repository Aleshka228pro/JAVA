package lab_1;

import java.util.ArrayList;

public class WordList {

    private ArrayList myList;

    public WordList() { 
        myList = new ArrayList();
    }

    public void addToList(String word) {
        myList.add(word);
    }
    
    public void printList(){
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    //////////////////////////////////

    public int numWordsOfLength(int len) {
        int cnt = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (((String) myList.get(i)).length() == len) cnt++;
        }
        return cnt;
    }

    public void removeWordsOfLength(int len){
        for (int i = myList.size() - 1; i >= 0; i--) {
            if (((String) myList.get(i)).length() == len) myList.remove(i);
        }
    }


    public static void main(String[] args) {
        WordList zoo = new WordList();

        zoo.addToList("cat");
        zoo.addToList("mouse");
        zoo.addToList("frog");
        zoo.addToList("dog");
        zoo.addToList("dog");

        int n = 3;

        zoo.printList();

        System.out.println(zoo.numWordsOfLength(n));

        zoo.removeWordsOfLength(n);
        zoo.printList();

    }
}

