public class arraysReverse {


    static void printArray(int[] list){

            for(int i =0; i<list.length; i++ ){

               System.out.println(list[i]);
            }
    }
    static int[] reverse(int[] abc) {
        int[] adf= new int[10];
        for (int i = 1, j = adf.length - 1; i < 10; i++, j--) {
            adf[j] = abc[i];
        }
        return adf;
    }
    public static void main(String[] args) {
        int[] list = new int[]{5,10,15,20,25,30,35,40,45,50};

            int[] yeni = reverse(list);
            printArray(yeni);
    }
}
