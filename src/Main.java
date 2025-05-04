public class Main {
    public static void main(String[] args) {

        MyHashMap hashMap = new MyHashMap();

        hashMap.put(1, "a"); //1
        hashMap.put(5, "b"); //5
        hashMap.put(11, "a");//1
        hashMap.put(7, "d"); //7
        hashMap.put(12, "e");//2
        hashMap.put(17, "f");//7
        hashMap.put(1, "g"); //1
        hashMap.put(25, "h");//5
        hashMap.put(1, "b");

        hashMap.showAll();

        System.out.println("Test branch");
    }
}