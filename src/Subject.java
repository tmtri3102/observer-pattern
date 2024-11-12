import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;
    // thêm vào một observer.
    public void add(Observer observer) {
        observers.add(observer);
    }
    //  setState(int value) để thiết đặt trạng thái chuyển đổi
    // khi đã xác định được giá trị chuyển đổi, gọi đến phương thức execute() để thực thi
    public int getState() {
        return state;
    }

    public void setState(int value) {
        this.state = value;
        execute();
    }

    // execute() để thông báo tới các observer thực hiện yêu cầu
    private void execute() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
