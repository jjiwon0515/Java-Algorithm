package chap_05;

public class _06_QUiz {
    public static void main(String[] args) {
        int[] size = new int[10];
        for (int i = 0; i < size.length; i++) {
            size[i] = 250 + (5*i);

        }

        for (int sizesize:
             size) {
            System.out.println("사이즈" + sizesize + "(재고있음)");

        }
    }
}
