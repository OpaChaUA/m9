package modul9;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap=new MyHashMap<>();
        myHashMap.put(1,"A");
        myHashMap.put(2,"B");
        myHashMap.put(3,"C");
        myHashMap.put(4,"D");
        myHashMap.put(5,"E");
        System.out.println("myHashMap.size() = " + myHashMap.size());
        System.out.println("myHashMap.remove(2) = " + myHashMap.remove(2));
        System.out.println("myHashMap.get(4) = " + myHashMap.get(4));
        myHashMap.clear();

    }
}
