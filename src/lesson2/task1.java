package lesson2;

public class task1 {


    //   1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void reverseMassive (){
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for (int i=0; i < arr.length; i++){
            if (arr[i] == 1){
                System.out.print (arr [i] - 1 + " ");
            } else
                System.out.print (arr [i] + 1 + " ");
        }

    }


    public static void main(String[] args) {
        reverseMassive();
    }
}
