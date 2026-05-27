package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] array = {1,2,3};

        int[][] arrayList1 = new int[3][];
        arrayList1[0] = new int[3];
        arrayList1[1] = array;
        arrayList1[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayList2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for (int[] arrayBase: arrayList2){
            System.out.println("\n----------------");
            for (int num: arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
