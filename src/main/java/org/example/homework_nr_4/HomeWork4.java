package org.example.homework_nr_4;

public class HomeWork4 {
    public static void main(String[] args) {
        int[] nums1 = new int[] {2, 5, 7 ,8, 10};
        for (int i = 0; i < nums1.length; i++) {
        System.out.println(nums1[i]); //выводим элементы массива на консоль
        }

        int[] nums2 = new int[]{12, 4, 6, 34, 2};
        int[][] nums3 = new int[][] {
                {7, 6, 55, 8, 3, 1, 11},
                {1, 3, 44, 6, 8, 2, 13}
            };
        System.out.println("================");
        int sum = 0;
        for (int i = 0; i <nums2.length; i++) { // определяем сумму элементов одномерного массива
            sum += nums2[i];
        }
        System.out.println("The sum of the elements of the 1-dimensional array is: " + sum);

        double avg = sum / nums2.length; //определяем ср.значение элементов одномерного массива
        System.out.println("The average of the elements of the 1-dimensional array is: " + avg);
        System.out.println("=============");

        //считаем кол-во четных  нечетных элементов двумерного массива
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < nums3.length; i++) {
            for (int j = 0; j < nums3[i].length; j++) {
                if (nums3[i][j]%2!=0) {
                    oddCount++;
                }
                else evenCount++;
                           }
        }
        System.out.println("The number of the even elements of the bidimentional array is: " + evenCount);
        System.out.println("The number of the odd elements of the bidimentional array is: " + oddCount);
        System.out.println("===============");

        //бонус
//        String[]list1 = new String[]{"Ivan", "John", "Helen", "Mary", "Ronald"};
//        String[]list2 = new String[list1.length];
//        for (int j = 0; j < list1.length; j++) {
//           System.out.print(list1[j] + ". ");
//           list1[j] = list2[j];
//            System.out.println(list2[j]);
//
//        }




    }
}
