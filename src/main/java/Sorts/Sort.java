package Sorts;

/**
 * Created by IntelliJ IDEA.
 * User: Md. Shamim
 * Date: ২৬/৮/২৩
 * Time: ৩:১৮ PM
 * Email: mdshamim723@gmail.com
 */


public class Sort {

    public void bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length - i - 1; j++) {

                if (nums[j] > nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }

            }

        }

    }

    public void selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int cIndex = i;

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[cIndex] > nums[j]) {
                    cIndex = j;
                }

            }

            int temp = nums[i];

            nums[i] = nums[cIndex];
            nums[cIndex] = temp;

        }

    }

    public void insertionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {



        }

    }

}
