package lab7;

public class Lab07_Q1 {
    public static void main(String[] args) {
        int[][] matrixOne = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] matrixTwo = { { 7, 8 }, { 9, 10 }, { 11, 12 } };
        int[][] matrixSquare = { { 1, 0, 0 }, { 2, 1, 0 }, { 3, 4, 1 } };
        int[][] childMatrix = { { 1, 5 }, { 8, 9 } };
        int[][] parentMatrix = { { 1, 0, 2, 3 }, { 4, 1, 5, 6 }, { 7, 8, 9, 10 } };

        System.out.println("Matrix One:");
        printMatrix(matrixOne);
        System.out.println("Matrix Two:");
        printMatrix(matrixTwo);
        System.out.println("Multiplication Result:");
        int[][] result = multiplyMatrices(matrixOne, matrixTwo);
        printMatrix(result);
        System.out.println("Checking if matrix is rectangular:");
        printMatrix(matrixSquare);
        String rectangularResult = checkRectangular(matrixSquare);
        System.out.println("Result: " + rectangularResult);
        System.out.println("Checking if child matrix is a subset of parent matrix.");
        System.out.println("Parent:");
        printMatrix(parentMatrix);
        System.out.println("Child:");
        printMatrix(childMatrix);
        boolean isSubsetResult = isSubset(parentMatrix, childMatrix);

        System.out.println("Is child matrix a subset of parent matrix? " + isSubsetResult);
    }

    static int[][] multiplyMatrices(int[][] matrixOne, int[][] matrixTwo) {
        int numberRowsFirst = matrixOne.length;
        int numberColumnsFirst = matrixOne[0].length;

        int numberRowsSecond = matrixTwo.length;
        int numberColumnsSecond = matrixTwo[0].length;

        int[][] resultMatrix = new int[numberRowsFirst][numberColumnsSecond];

        if (numberColumnsFirst != numberRowsSecond) {
            System.out.println(
                    "Number of columns in the first matrix must equal the number of rows in the second matrix.");
        } else {
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int n = 0; n < resultMatrix[0].length; n++) {
                    int value = 0;

                    for (int k = 0; k < numberColumnsFirst; k++) {
                        value = value + matrixOne[i][k] * matrixTwo[k][n];
                    }

                    resultMatrix[i][n] = value;
                }
            }
        }

        return resultMatrix;
    }

    static String checkRectangular(int[][] matrixArray) {

        boolean lowerTriangle = true;
        boolean upperTriangle = true;

        String shape;

        int numberRows = matrixArray.length;
        int numberColumns = matrixArray[0].length;

        for (int k = 0; k < numberRows; k++) {
            for (int j = 0; j < numberColumns; j++) {
                if (k > j && matrixArray[k][j] != 0) {
                    upperTriangle = false;
                }
                if (j > k && matrixArray[k][j] != 0) {
                    lowerTriangle = false;
                }
            }
        }

        if (lowerTriangle) {
            shape = "Lower Triangular";
        } else if (upperTriangle) {
            shape = "Upper Triangular";
        } else {
            shape = "Neither";
        }

        return shape;
    }

    static boolean isSubset(int[][] parent, int[][] child) {

        int numberRowsParent = parent.length;
        int numberRowsChild = child.length;
        int numberColumnsParent = parent[0].length;
        int numberColumnsChild = child[0].length;

        for (int i = 0; i + numberRowsChild <= numberRowsParent; i++) {
            for (int n = 0; n + numberColumnsChild <= numberColumnsParent; n++) {
                boolean match = true;

                for (int j = 0; j < numberRowsChild; j++) {
                    for (int q = 0; q < numberColumnsChild; q++) {
                        if (parent[i + j][n + q] != child[j][q]) {
                            match = false;
                            break;
                        }
                    }
                    if (!match) {
                        break;
                    }
                }

                if (match) {
                    return true;
                }
            }
        }

        return false;
    }

    static void printMatrix(int[][] matrixArray) {
        for (int i = 0; i < matrixArray.length; i++) {
            for (int n = 0; n < matrixArray[i].length; n++) {
                System.out.print(matrixArray[i][n] + " ");
            }
            System.out.println();
        }
    }
}
