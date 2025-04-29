public class MyNode {
    private String data;
    private MyNode next;

    public MyNode(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}