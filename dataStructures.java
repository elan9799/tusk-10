public class dataStructures {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(56);
        linkedList.add(222);
        linkedList.add(93);
        linkedList.add(2);
        linkedList.addFirst(5324);
        linkedList.addFirst(679);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.getById(2);
        linkedList.getIdOfElement(93);
        linkedList.removeById(4);
        linkedList.removeByValue(5);

        linkedList.print(linkedList);


    }
}
class LinkedList {
    int value;
    LinkedList head;
    LinkedList next;
    int size;
    public void add(int i) {
        LinkedList current = new LinkedList();
        if (head == null){
            head = current;
            current.value = i;
            size++;
        }else{
            LinkedList temp = head;
            for (int j = 1; j < size; j++) {
                temp = temp.next;
            }
            if (temp != null){
                temp.next = current;
                current.value = i;
            }
            size++;
        }
    }
    public void addFirst (int i) {
        LinkedList current = new LinkedList();
        if (head == null){
            head = current;
            current.value = i;
            size++;
        }else{
            current.next = head;
            current.value = i;
            head = current;
            size++;
        }
    }

    public void print(LinkedList linkedList) {
        LinkedList temp = head;
        for (int j = 0; j < size; j++) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void removeFirst() {
        if (head != null){
            LinkedList temp = head;
            head = head.next;
            temp.next = null;
            size--;
        }
    }

    public void removeLast() {
        LinkedList temp = head;
        for (int j = 1; j < size; j++) {
            temp = temp.next;
        }
        if (temp != null){
            temp.next = null;
        }
        size--;
    }

    public void getById(int i) {
        LinkedList temp = head;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        i++;
        System.out.println("Value of " + i + " element is = " + temp.value);
    }

    public void getIdOfElement(int i) {
        LinkedList temp = head;
        int counter = 1;
        while (temp.value != i){
            temp = temp.next;
            counter++;
        }
        System.out.println("Id of element vith value " + i + " == " + "[" + counter + "]");
    }

    public void removeById(int i) {
        LinkedList temp = head;
        LinkedList temp2 = head.next;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
            temp2 = temp2.next;
        }
        if (temp2.next == null){
            temp.next = null;
        }
        temp.next = temp2.next;
        temp2.next = null;
        size--;
    }

    public void removeByValue(int i) {
        LinkedList temp = head;
        LinkedList temp2 = head.next;
        while (temp2.value != i){
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp.next = temp2.next;
        temp2.next = null;
        size--;
    }
}