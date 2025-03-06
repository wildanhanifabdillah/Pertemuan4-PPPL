package org.example;

public class Largest {
//    public static int largest(int[] list) {
//        int index;
//        int max = Integer.MAX_VALUE;
//        for (index = 0; index < list.length - 1; index++) {
//            if (list[index] > max) {
//                max = list[index];
//            }
//        }
//
//        return max;
//    }

        public static int largest(int[] list) {
            int max = Integer.MIN_VALUE;
            for (int index = 0; index < list.length; index++) {
                if (list[index] > max) {
                    max = list[index];
                }
            }
            return max;
        }

}
