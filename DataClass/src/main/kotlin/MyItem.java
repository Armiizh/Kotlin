import java.util.Objects;

public class MyItem {

    private final int i;
    private final String s;
    private final MyCallback callback;

    public MyItem(int i, String s, MyCallback callback) {
        this.i = i;
        this.s = s;
        this.callback = callback;
    }

    @Override
    public boolean equals(Object o) {
        callback.equalsCalled();
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyItem myItem = (MyItem) o;

        if (i != myItem.i) return false;
        return s != null ? s.equals(myItem.s) : myItem.s == null;
    }

    @Override
    public int hashCode() {
        callback.hashCodeCallde();
        int result = i;
        result = 31*result + (s != null ? s.hashCode(): 0);
        return result;
    }

    @Override
    public String toString() {
        return "MyItem{" +
                "i = " + i +
                ", s = " + s + "}";
    }
}
