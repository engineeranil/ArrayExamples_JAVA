import java.util.Arrays;

public class HelperArray {
    static void printHelperArray(int [] dizi){
        for(int i=0; i<dizi.length; i++){
            System.out.println(dizi[i]);
        }
    }
        static void printHelperArray(double[] dizi){
            for(int i=0; i<dizi.length; i++){
                System.out.println(dizi[i]);
            }
        }

        static int[] fill(int[] list,int deger){
        for(int i=0; i<list.length; i++ ){
            list[i]=deger;
        }
        return list;
        }

        static void fill2(int[] list,int aralik1,int aralik2){
        for(int gezin:list){

                for( int i=aralik1; i<aralik2;  i++){
                    System.out.println(list[i]);
                }
                break;
            }
        }


        static int search(int[] abc,int value){
        for(int i = 0; i<abc.length; i++){
            if(abc[i]==value){
                    int sonuc =i;
                return sonuc;
            }

        }

        return -1;
        }

        static void arrayAvarage(int[] a1){
        int sum = 0;
        for(int i= 0; i<a1.length; i++){
            sum+=a1[i];
        }
        double avarage = 0.0;
        avarage = sum/a1.length;
        System.out.println(avarage);
        }



        }


