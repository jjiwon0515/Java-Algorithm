package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스 : String, Integer, Double 등 참조 레퍼런스들과 어울림

        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0,2.0,3.0,4.0,5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};


        // 약간 반복되는 구문이 있음 ==> 문법을 통해서 간단하고 효율적인 코드로 변환가능
        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("-----------------------------");

        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);
    }
    //제네릭스
    // T : Type, K : Key, V : Value, E : Element....

    private static <T> void printAnyArray(T[] array){
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String i : sArray) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double i : dArray) {
            System.out.print(i + " ");

        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " "); // 1 2 3 4 5

        }
        System.out.println();
    }

}
