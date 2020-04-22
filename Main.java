import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayOfInts = new ArrayList<>();
        LinkedList<String> names = new LinkedList<>();
        HashMap<Integer, String> hash = new HashMap<>();
        arrayList arrayList = new arrayList();
        int n = 8;


        for (int i = 0; i < n; i++) {
            arrayOfInts.add((int) (Math.random() * 50 - 25));
        }
        for (int i = 0; i < n; i++) {
            char b = (char) (Math.random() * 200);
            names.add(String.valueOf(b));
        }


        System.out.println(arrayOfInts);
        System.out.println(arrayList.arraySameElements(arrayOfInts));
        System.out.println(names);
        hash.putAll(arrayList.intoHashMap(arrayOfInts, names, n));
        System.out.println(hash);

        arrayList.compareALandTS();

    }
}
class arrayList {
    public boolean arraySameElements (ArrayList<Integer> array){
        boolean flag = false;
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(array);
        if (hashSet.size() == array.size()){
            flag = true;
        }
        return flag;
    }
    public HashMap<Integer, String> intoHashMap (ArrayList<Integer> arrayList, LinkedList<String> linkedList, int n){
        HashMap<Integer, String> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hash.put(arrayList.get(i), linkedList.get(i));
        }//не понял есть ли какой то метод у хешмэпа в который ты просто отдаешь два списка и он их автоматически линкует

        return hash;
    }
    public void compareALandTS (){
        ArrayList<Integer> ar = new ArrayList<>();
        TreeSet<Integer> ts = new TreeSet<>();
        int n = 1000000;

        int time = (int) System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            ar.add((int)(Math.random() * 20000 -10000));
        }
        System.out.println((int) System.currentTimeMillis() - time);
        time = (int) System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            ts.add((int)(Math.random() * 20000 -10000));
        }
        System.out.println((int) System.currentTimeMillis() - time);
    }
}