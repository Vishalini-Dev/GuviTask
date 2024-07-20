package guvi.task1;

public class Question6 {
    public static void main(String[] args) {
        int k = 5;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                if (i == 1) {
                    System.out.print(k+" ");
                }
                else if (i == 2) {
                    if (j == 1) {
                        System.out.print("\n" +k+" ");
                    }
                    else {
                        System.out.print(k-1+" ");
                    }
                }
                else if (i==3) {
                    if(j==1){
                        System.out.print("\n"+k+" ");
                    } else if (j==2) {
                        System.out.print(k-1+" ");
                    }else {
                        System.out.print(k-2+" ");
                    }
                }
                else if (i==4) {
                    if(j==1){
                        System.out.print("\n"+k+" ");
                    } else if (j==2) {
                        System.out.print(k-1+" ");
                    }else if(j==3) {
                        System.out.print(k-2+" ");
                    }
                    else {
                        System.out.print(k-3+" " );

                    }
                }
                else{
                    if (j==1){
                        System.out.print( "\n" +k +" ");
                    }
                    else{
                        System.out.print(k-j+1+" ");
                    }

                }

            }
        }
    }
}