public class BinObserver extends Observer {
    public BinObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }
    public void update() {
        System.out.println(" " + Integer.toBinaryString(subject.getState()));
    }
}
