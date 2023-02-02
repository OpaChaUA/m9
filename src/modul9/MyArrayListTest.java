package modul9;

import java.util.Objects;

public class MyArrayListTest {
    public static void main(String[] args) {
        var myArray=new MyArrayList<Integer>();
        System.out.println(myArray.size());
        var myArray2=new MyArrayList<Integer>(20);
        System.out.println(myArray2.size());
        for (int i = 0; i < 15; i++) {
            myArray2.add(i+1);
            System.out.print(myArray2.get(i));
        }
        System.out.println();
        myArray2.remove(7);
        myArray2.add(8);
        for (int i = 0; i < 15; i++) {
            System.out.print(myArray2.get(i));
        }
        System.out.println();

        System.out.println(myArray2.get(2));
        myArray2.clear();
        System.out.println(myArray2.getLastElement());

    }



}