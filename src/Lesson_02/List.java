package Lesson_02;

public class List {
    private ListElement head;
    private ListElement tail;

    public void addFrontElement(int data) {
        ListElement element = new ListElement();
        element.data = data;
        if (head == null) {
            head = element;
            tail = element;
        }
        else {
            element.next = head;
            head = element;
        }
    }

    public void addBackElement(int data) {
         ListElement element = new ListElement();
         element.data = data;
         if (tail == null) {
             head = element;
             tail = element;
         }
         else {
             tail.next = element;
             tail = element;
         }
    }

    public void printList() {
        ListElement h = head;
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
    }

    public void deleteElement(int data) {
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        ListElement element = head;
        while (element.next != null) {
            if (element.next.data == data) {
                if (tail == element.next) {
                    tail = element;
                }
                element.next = element.next.next;
                return;
            }
            element = element.next;
        }
    }
}
