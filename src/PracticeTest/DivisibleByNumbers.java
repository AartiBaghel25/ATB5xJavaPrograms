package src.PracticeTest;

public class DivisibleByNumbers {
    public static void main(String[] args){
        System.out.println("\nDivided by 3: ");
        for(int i = 1; i < 100; i++){
            if(i % 3 == 0)
                System.out.print(i + ", ");
            }

            System.out.println("\n\nDivided by 5: ");
            for (int j = 1; j < 100; j++){
                if(j % 5 ==0)
                    System.out.print(j + ", ");
                }

                System.out.println("\n\nDivided by 3 and 5: ");
                for (int k = 1; k < 100; k++) {
                    if (k % 3 == 0 && k % 5 == 0)
                        System.out.print(k + ", ");
                    }
                    System.out.println("\n");



    }
}
