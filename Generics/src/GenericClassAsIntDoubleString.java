public class GenericClassAsIntDoubleString <T>{
    T EnterEle;

    public GenericClassAsIntDoubleString(T enterEle) {
        EnterEle = enterEle;
    }

    public T getEnterEle() {
        return EnterEle;
    }

    public void setEnterEle(T enterEle) {
        EnterEle = enterEle;
    }
}
