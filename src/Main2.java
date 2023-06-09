public class Main2 {
    public static void main(String[] args) {
        String[][] yıldız = new String[12][8];
        for(int i = 0; i< yıldız.length; i++){
            for(int j = 0; j<yıldız[i].length; j++){
                if(i==0){
                yıldız[i][j]=" *";
                }
                else if(j==7){
                    yıldız[i][j]="*";
                }
               else{
                   yıldız[i][j]=" ";
                }

            }

        }
        for (String[] row : yıldız){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
