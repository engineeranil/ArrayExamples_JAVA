public class TekrarEden {
    public static void main(String[] args) {
        // duplicate = tekrar eden
        int[] list = new int[]{3,7,3,3,2,9,10,21,1,33,9,1};
        int[] yeniDizi = new int[list.length];
        int sayi = 0;


        for(int i = 0; i<list.length; i++){
            for(int j = 0; j<list.length; j++){
                if(i!=j && list[i]==list[j]){
                    yeniDizi[sayi++] = list[i];
                    break;
                }

            }
        }

    }
}
