package Lesson_02;


public class Main {
    public static void main(String[] args) {

        List list = new List();
        list.addBackElement(1);
        list.addBackElement(2);
        list.addBackElement(3);
        list.addBackElement(4);
        list.addBackElement(5);
        list.addBackElement(6);

        System.out.print("List: ");
        list.printList();
        System.out.println();

        List list1 = new List();
        list1.addFrontElement(1);
        list1.addFrontElement(2);
        list1.addFrontElement(3);
        list1.addFrontElement(4);
        list1.addFrontElement(5);
        list1.addFrontElement(6);

        System.out.print("List2: ");
        list1.printList();
        System.out.println();

        list.deleteElement(5);

        System.out.print("List: ");
        list.printList();
        System.out.println();

        MyArrayList<String> arrayLists = new MyArrayList<>();
        arrayLists.add("1");
        arrayLists.add("2");
        arrayLists.add("3");
        arrayLists.add("4");
        arrayLists.add("5");

        System.out.print("MyArrayList: ");
        for (int i = 0; i < arrayLists.size(); i++)
            System.out.print(arrayLists.get(i) + ", ");
        System.out.println();

        arrayLists.delete(0);
        System.out.print("MyArrayList: ");
        for (int i = 0; i < arrayLists.size(); i++)
            System.out.print(arrayLists.get(i) + ", ");
        System.out.println();

        arrayLists.update(0, "1");
        System.out.print("MyArrayList: ");
        for (int i = 0; i < arrayLists.size(); i++)
            System.out.print(arrayLists.get(i) + ", ");
    }
}
