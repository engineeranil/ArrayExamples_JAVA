public class cokBoyutluArrays {
    public static void main(String[] args) {
        int[][] sayilar = new int[4][7];
        int x = 1;
        for(int i=0; i< sayilar.length; i++){

            for (int j=0; j< sayilar[0].length; j++){
                sayilar[i][j]=x++;
                System.out.print(sayilar[i][j] + " ");

                            }

            System.out.println();
        }


    }
}
