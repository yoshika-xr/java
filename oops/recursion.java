
public class recursion {

    int count = 0;

    public void name() {
        if (count == 1) {
            return;
        }
        System.out.println("maya");
        count++;
        name();

    }

    public static void main(String[] args) {
        recursion r = new recursion();
        r.name();
    }
}
