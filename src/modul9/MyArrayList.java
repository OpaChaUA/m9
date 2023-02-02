package modul9;
import java.util.Arrays;
import java.util.Objects;

class MyArrayList<T> implements List<T>{
    private int LastElement;

    public int getLastElement() {
        return LastElement;
    }

    public static final int DEFAULT_CAPACITY =5;
    private Object[]elements;

    private int size;
    public MyArrayList(int initCapacity){
        if(initCapacity <=0){
            throw new IllegalArgumentException();
        }
        elements=new Object[initCapacity];
        size=initCapacity;

    }
    public MyArrayList(){
        this(DEFAULT_CAPACITY);

    }

    @Override
    public void add(T element) {
        if (LastElement+1==size){
            Object[]newArray = new Object[elements.length *2];
            System.arraycopy(elements, 0, newArray,0,size);
            elements = newArray;

        }
        elements[LastElement++] = element;
    }

    @Override
    @SuppressWarnings("unchecked")
    public T remove(int index) {
        T remElements = (T) elements[index];
        Objects.checkIndex(index, LastElement);
        System.arraycopy(elements, index+1, elements, index, size - index -1);
        LastElement--;
        return remElements;
    }

    @Override
    public int size() {

        return size;
    }

    @Override
    public void clear() {
        LastElement = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T)elements[index];
    }
}
