package com.example.stef.firstevaluation;

@SuppressWarnings("ALL")
public class firstProblem {
//class with lower case
        private final static boolean OK = true;

        public static void main(String args[]) {

            int numere[] = {1, 2, 2, 3, 4, 4, 5, 5, 5, 5};
            System.out.println(CountClumps(numere));

            int ouTer[] = {1, 2, 4, 6};
            int innner[] = {2, 4};

            System.out.println(linearIn(ouTer, innner, 0, 0, OK));
        }

        private static int CountClumps(int[] nums) {
            //method with upper case
            //no abbreviations
            int clumpsCount = firstElementS(nums);

            for (int i = 2; i < nums.length; i++) {
                if (nums[i] == nums[i - 1] && nums[i] != nums[i - 2]) {
                    clumpsCount++;
                }
            }

            return clumpsCount;
        }

        private static int firstElementS(int[] nums) {
            //S is redundant
            if (nums[0] == nums[1]) {
                return 1;
            }
            return 0;
        }

        private static boolean linearIn(int[] outer, int[] inner, int i, int j, boolean OK) {
        //too many arguments
            j = 0;
            for (i = 0; i < inner.length; i++) {
                while (outer[j] < inner[i] && j < outer.length)
                    j++;
                if (outer[j] != inner[i])
                    OK = false;

                if (OK == false)
                    return false;
            }

            return true;
        }
    }

