public class LatinSquare {

    /**
     *
     * @param rowSize
     * @return given the rowSize N (corresponding to an array of size N x N),
     *         calculate and return the sum of consecutive integers 1 + 2 + ... + N
     */
    public static int targetCheckSum1(int rowSize) {
        int sum = 0;
        for(int i = 1; i <= rowSize; i++){
            sum = sum + i;
        }
        return sum;
    }

    /**
     *
     * @param rowSize
     * @return given the rowSize N (corresponding to an array of size N x N),
     *         calculate and return the product of consecutive integers 1 * 2 * ... * N
     */
    public static int targetCheckSum2(int rowSize) {
        int product = 0;
        for(int i = 1; i <= rowSize; i++){
            product = product * i;
        }
        return product;
    }


    /**
     *
     * @param array2d
     * @param checkSum1
     * @param checkSum2
     * @return whether or not every row's sum in array2d is equal to checkSum1,
     *         AND that every row's product in array2d is equal to checkSum2
     */
    public static boolean isLatinRows(int[][] array2d, int checkSum1, int checkSum2) {
        int arrayLength = array2d.length;
        int sumOneSum = 0;
        int sumTwoSum = 0;
        for(int arrayOut = 0; arrayOut < array2d.length; arrayOut++){
            int sum = 0;
            int product = 0;
            for(int arrayIn = 0; arrayIn < array2d[arrayOut].length; arrayIn++){
                sum = sum + array2d[arrayOut][arrayIn];
                product = product * array2d[arrayOut][arrayIn];
            }
            if(checkSum1 == sum){
                sumOneSum = sumOneSum + 1;
            }
            if(checkSum2 == product){
                sumTwoSum = sumTwoSum + 1;
            }
        }
        if(sumOneSum == arrayLength && sumTwoSum == arrayLength){
            return true;
        }
        return false;
    }

    /**
     *
     * @param array2d
     * @param checkSum1
     * @param checkSum2
     * @return whether or not every column's sum in array2d is equal to checkSum1,
     *         AND that every column's product in array2d is equal to checkSum2
     */
    public static boolean isLatinColumns(int[][] array2d, int checkSum1, int checkSum2) {
        int arrayLength = array2d.length;
        int sumOneSum = 0;
        int sumTwoSum = 0;
        for(int arrayOut = 0; arrayOut < array2d.length; arrayOut++){
            int sum = 0;
            int product = 0;
            for(int arrayIn = 0; arrayIn < array2d[arrayOut].length; arrayIn++){
                sum = sum + array2d[arrayIn][arrayOut];
                product = product * array2d[arrayIn][arrayOut];
            }
            if(checkSum1 == sum){
                sumOneSum = sumOneSum + 1;
            }
            if(checkSum2 == product){
                sumTwoSum = sumTwoSum + 1;
            }
        }
        if(sumOneSum == arrayLength && sumTwoSum == arrayLength){
            return true;
        }
        return false;
    }


    /**
     *
     * @param array2d
     * @return whether array2d is a Latin square or not.
     *         Hint: make use of isLatinRows and isLatinColumns
     */
    public static boolean isLatinSquare(int[][] array2d) {
        int checkSumOne = targetCheckSum1(array2d.length);
        int checkSumTwo = targetCheckSum2(array2d.length);
        if(isLatinRows(array2d,checkSumOne,checkSumTwo) && isLatinColumns(array2d,checkSumOne,checkSumTwo)){
            return true;
        }
        return false;
    }

    /** OPTIONAL (only do if you have time)
     *
     * @param array2d
     * @return whether or not array2d is a latin square
     *         as well as whether the sum and product of each of the two main diagonals is equal
     *         to the checkSums or not.
     *
     * NOTE: not all Latin squares are diagonal; for example, diagonal Latin squares do not exist for 2x2 or 3x3
     */
    public static boolean isDiagonalLatinSquare(int[][] array2d) {
        return false;
    }

}
