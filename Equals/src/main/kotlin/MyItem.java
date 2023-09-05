import java.util.Objects;

public class MyItem {

    private final int i;
    private final String s;

    public MyItem(int i, String s) {
        this.i = i;
        this.s = s;
    }

    @Override
    public String toString() {
        return "My item{" +
                "i = "+i+
                " s = " +s+"}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyItem myItem = (MyItem) o;

        if (i != myItem.i) return false;
        return s != null ? s.equals(myItem.s) : myItem.s == null;
    }

    @Override
    public int hashCode() {
        int result = i;
        result = 31*result+(s != null ? s.hashCode() : 0);
        return result;
    }
}


