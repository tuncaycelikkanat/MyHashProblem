public class MyHashMap {

    private MyNode[] arr2 = new MyNode[10];

    public MyHashMap() {
    }

    public void put(int key, String value){
        if (isContains(key)) {

            MyNode current = arr2[hashedKey(key)];

            while(current.getNext() != null){
                if (current.getNext() != null) {
                    current = current.getNext();
                }
            }
            current.setNext(new MyNode(value));

        } else {
            arr2[hashedKey(key)] = new MyNode(value);
        }
    }

    public MyNode get(int key){
        return arr2[hashedKey(key)];
    }

    public void showAll(){
        for (int i = 0; i < arr2.length; i++) {
            StringBuilder outputString = new StringBuilder();
            if (arr2[i] != null) {
                if (arr2[i].getNext() != null) {
                    outputString.append(arr2[i].getData());

                    MyNode current = arr2[i];

                    while (current.getNext() != null) {
                        if (current.getNext() != null) {
                            current = current.getNext();
                            outputString.append(" -> ").append(current.getData());
                        }
                    }

                } else {
                    outputString.append(arr2[i].getData());
                }
            }
            System.out.printf("Key: %d - Value: %s%n",i,outputString);
        }


    }

    public int hashedKey(int k){
        return k % 10;
    }

    public boolean isContains(int key){
        boolean isContains = false;

        for (MyNode arr1 : arr2) {
            if (arr2[hashedKey(key)] != null) {
                if (arr2[hashedKey(key)].getData() != null) {
                    isContains = true;
                }
            }
        }
        return isContains;
    }

}