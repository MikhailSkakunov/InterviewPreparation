package Lesson_02;

public class MyArrayList<E> {

    private E[] elements;

    public MyArrayList() {
        elements = (E[]) new Object[0];
    }

    public boolean add(E element) {
        try {
            E[] temp = elements;
            elements = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, elements, 0, temp.length);
            elements[elements.length - 1] = element;
            return true;
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public void delete(int index) {
        try {
            E[] temp = elements;
            elements = (E[]) new Object[temp.length];
            System.arraycopy(temp, 0, elements, 0, index);
            int amount = elements.length - index - 1;
            System.arraycopy(temp, index + 1, elements, index, amount);
        } catch (ClassCastException exception) {
            exception.printStackTrace();
        }
    }

    public void update(int index, E e) {
        elements[index] = e;
    }

    public int size() {
        return elements.length;
    }

    public E get(int i) {
        return elements[i];
    }
}
