package Homework1.recapDemo;

public class Main {
    public static void main(String[] args) {
    	
        double[] myList = {1.2, 9.3, 1.4, 4.5};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }

            total += number;
            System.out.println(number);
        }
        System.out.println("toplam " + total);
        System.out.println("Maksimum " + max);


    }
}
