import java.util.Scanner;

public class game {
        public static String [][] mainTable = new String[6][6];
        public static Scanner scan = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("All set. Get ready to rumble........");
            firstTable(mainTable);
            int[] addres = includeTarget();
            boolean prg = true;
            int includeCol;
            int includeRow;
            while (prg){
                showTable(mainTable);
                System.out.println("Include the rows");
                includeCol=scan.nextInt();
                System.out.println("Include the numbers");
                includeRow=scan.nextInt();
                if (checkNumber(includeCol)&&checkNumber(includeRow)) {
                    if ((includeRow == addres[0]) && (includeCol == addres[1])) {
                        System.out.println("Yow won");
                        prg = false;
                    } else {
                        System.out.println("Try again");
                        mainTable[includeRow][includeCol] = "*|";
                    }
                }

            }

        }
        public static void firstTable(String[][] myTable){
            //show first line
            for(int i=0;i<6;i++){
                myTable[i][0]=i+"|";
            }
            for(int j=0;j<6;j++){
                myTable[0][j]=j+"|";
            }

            for (int a=1;a<6;a++){
                for (int b=1;b<6;b++){
                    myTable[a][b]="-|";
                }
            }
        }
        public static int[] includeTarget(){
            int rowNumber = 1+(int)(Math.random()*5);
            int colNumber = 1+(int)(Math.random()*5);
//            System.out.println(rowNumber+" "+colNumber);
            return new int[]{rowNumber, colNumber};
        }

        public static void showTable(String[][] myTable){
            for (int i=0;i<6;i++){
                for (int a=0;a<6;a++){
                    System.out.print(myTable[i][a]);
                }
                System.out.println();
            }
        }
        public static boolean checkNumber(int number){
            if ((number>0)&&(number<6)){
                return true;
            }else {
                System.out.println("Please, enter valid number");
                return false;
            }
        }





    }

