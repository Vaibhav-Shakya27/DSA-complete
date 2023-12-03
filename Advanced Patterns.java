import java.util.*;

public class Javabasics{

    public static void hollowrectangle(int row, int col){
        //hollow rectangle
        for(int i = 0; i< row;i++){
            for(int j = 0; j< col;j++){
                if(i == 0 || i == row-1 || j == 0 || j == col-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inv_rot_pyramid(int n){
        //Inverted rotated pyramid
        for(int i = 1; i<=n;i++){
            for(int j =0; j< (n-i);j++){
                System.out.print("  ");

            }
            for(int k = 0; k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public static void inv_half_num_pyr(int n){
        //Inverted half pyramid with numbers
        for(int i = 0; i<=n;i++){
            for(int j = 1; j< (n-i+1);j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floydstriangle(int n){
        int counter = 1;
        for(int i = 1 ; i <= n;i++){
            for(int j = 0 ; j< i; j++){

                System.out.print(counter++ +" ");
            }
            System.out.println();
        }
    }

    public static void zeroonetriangle(int n){
        for(int i = 1; i<= n;i++){
            for(int j = 1 ; j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print(1 + " ");
                }
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i = 1; i <=n;i++){
            for(int j = 1; j<= i; j++){
                System.out.print("* ");
            }

            for(int j = 1; j<= (n-i)*2; j++){
                System.out.print("  ");
            }

            for(int j = 1; j<= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = n;i>=0;i--){
            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }

            for(int j = 1; j<= (n-i)*2; j++){
                System.out.print("  ");
            }

            for(int j = 1; j<=i ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        }

        public static void solidrhombus(int n){
            for(int i = 1; i<=n ; i++){
                for(int j = 1; j<= n-i ; j++){
                    System.out.print("  ");
                }

                for(int j = 1; j<=n ; j++){
                    System.out.print("* ");
                }

                System.out.println();
            }
        }
    
        public static void hollowrhombus(int n){
            for(int i = 1; i<=n ; i++){
                for(int j = 1; j<= n-i; j++){
                    System.out.print("  ");
                }

                for(int j = 1; j<=n;j++){
                    if (i == 1|| i ==n || j == 1 || j == n) {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

        public static void diamond(int n){
            for(int i = 1 ; i<=n; i++){
                for(int j = 1; j <= n-i ; j++){
                    System.out.print("  ");
                }

                for(int j = 1 ; j<= (2*i)-1; j++ ){
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(int i = n; i>= 0 ; i--){
                for(int j = 1; j<= n-i ; j++){
                    System.out.print("  ");
                }

                for(int j = 1; j <= (2*i)-1 ; j++){
                    System.out.print("* ");
                }
                System.out.println();

            }
        }

        public static void numberpyramid(int n){
            for(int i = 1; i<=n ; i++){
                for(int j = 1; j<=n-i ; j++){
                    System.out.print("  ");
                }
                
                for(int j = 1; j<=i ; j++){
                    
                    System.out.print(i+ " ");
                    System.out.print("  ");
                }

                System.out.println();
            }
        }

        public static void pallindrome(int n){
            for(int i = 1; i<=n ; i++){
                for(int j  = 1; j <= n-i ; j++){
                    System.out.print("  ");
                }

                for(int j = i ; j >= 1; j--){
                    System.out.print(j+ " ");
                }

                for(int j = 2; j<=i ; j++ ){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

    public static void main(String arg[]){
        //hollowrectangle(4,5);
        // inv_rot_pyramid(4);
        // inv_half_num_pyr(5);
        // floydstriangle(5);
        // zeroonetriangle(5);
        // butterfly(10);
        // solidrhombus(5);
        // hollowrhombus(5);
        // diamond(5);
        // numberpyramid(5);
        pallindrome(5);



    }

    }
