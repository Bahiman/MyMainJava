//import java.util.HashSet;
//import java.util.Set;
//
//public class HOMEWORK16 {
//    public static void sortInsertion(int[] sort_arr) {
//
//        for (int i = 0; i < sort_arr.length; ++i) {
//
//            int j = i;
//
//            while (j > 0 && sort_arr[j - 1] > sort_arr[j]) {
//
//                int nigga = sort_arr[j];
//                sort_arr[j] = sort_arr[j - 1];
//                sort_arr[j - 1] = nigga;
//                j = j - 1;
//
//            }
//        }
//    }
//
//    public static int main(String[] args) {
//
//        int[] arr = new int[randomNIGR()];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = randInt();
//        }
//
//        Set<Integer> temp = new HashSet<>();
//
//
//        sortInsertion(arr);
//
//        for (int j : arr) {
//            System.out.print(j + " ");
//
//            temp.add(j);
//        }
//
////        for(int i = 1; i< arr.length; i++){
////            if(arr[i - 1] == arr[i]){
////                System.out.println(arr[i] + "hj" );
////                System.out.println(arr[i] = randInt());
////                for (int j : arr){
////                    System.out.print(j + " ");
////                }
////            }
////}
//
//
//        {
//            for (int jj : arr) {
//            if (temp.contains(jj)){
//                System.out.println(jj);
//            }
//            }
//
//        }
//
//        private static int randInt() {
//            int v = (int) (Math.random() * 50);
//            return v;
//        }
//
//        private static int randomNIGR () {
//            int v = (int) (Math.random() * 10 + 10);
//
//            return v;
//        }
//    }
