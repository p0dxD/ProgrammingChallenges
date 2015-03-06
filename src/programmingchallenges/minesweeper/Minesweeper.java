/*
    *This is the basics of the minesweeper game
It knows 
 */
package programmingchallenges.minesweeper;

import programmingchallenges.template.Main;

/**
 *
 * @author Joseph
 */
public class Minesweeper implements Runnable {

    public static void main(String args[]) // entry point from OS
    {
        Main myWork = new Main();  // Construct the bootloader
        MyStuff execute = new MyStuff();
        execute.run();
    }

    @Override
    public void run() {
        new MyStuff().run();
    }

}

class MyStuff implements Runnable {
    String mine = "*";
    String matrix[][];
    int row, column;

    @Override
    public void run() {
        // Your program here
        create(3, 3); //Here we set the rows and columns
        display(); // displays the array before 
System.out.println("\nThis shows us how many adjacent and near mines\n"
        + "each dot had previously \"*\"");
        display(); // displays the array after

    }
/**
 * Creates the matrix
 * @param n rows
 * @param m columns
 */
    public void create(int n, int m) {
        row = n;
        column = m;
        matrix = new String[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = ".";
                
            }
        }
        matrix[1][1] = "*"; //For testing purposes
        matrix[0][2] = "*"; 
        matrix[0][0] = "*";
    }

    /**
     * Displays the array with everything set up
     */
    public void display() {
        System.out.println("\nThe matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + "\t");
                number(i, j);
            }
            System.out.println();
        }
    }
 
/**
 * This is what will calculate the mines around each spot
 * will set the number it counts 
 * @param i takes the row
 * @param j takes the columns
 * @return the value counted
 */
    public String number(int i, int j) {
        int count = 0;
        if (mine.equals(getTopLeft(i, j))) {
            count += 1;
        }

        if (mine.equals(getTop(i, j))) {
            count += 1;
        }

        if (mine.equals(getTopRight(i, j))) {
            count += 1;
        }

        if (mine.equals(getMidLeft(i, j))) {
            count += 1;
        }

        if (mine.equals(getMidRight(i, j))) {
            count += 1;
        }

        if (mine.equals(getBotLeft(i, j))) {
            count += 1;
        }

        if (mine.equals(getBot(i, j))) {
            count += 1;
        }

        if (mine.equals(getBotRight(i, j))) {
            count += 1;
        }

        if (!mine.equals(matrix[i][j])) {
            matrix[i][j] = String.valueOf(count);
        }
        return String.valueOf(count);
    }

    /**
     * Gets the Top left if such value exists
     *
     * @param arrX
     * @param arrY
     * @return the value
     *///Good
    public String getTopLeft(int arrX, int arrY) {
        String number = "-1";
        if ((arrX - 1) != -1 && (arrY - 1) != -1) {
            number = matrix[arrX - 1][arrY - 1];
        }

        return number;
    }

    /**
     * Gets Top if such value exists
     *
     * @param arrX
     * @param arrY
     * @return the value
     *///good
    public String getTop(int arrX, int arrY) {
        String number = "-1";
        if ((arrX - 1) != -1) {
            number = matrix[arrX - 1][arrY];
        }

        return number;
    }

    /**
     * Gets Top Right if such value exists
     *
     * @param arrX
     * @param arrY
     * @return the value
     *///good
    public String getTopRight(int arrX, int arrY) {
        String number = "-1";
        if ((arrX - 1) != -1 && (matrix.length > arrY + 1))//changes
        {
            number = matrix[arrX - 1][arrY + 1];
        }

        return number;
    }

    /**
     * Gets Middle Left if such value exists
     *
     * @param arrX
     * @param arrY
     * @return the value
     *///Good
    public String getMidLeft(int arrX, int arrY) {
        String number = "-1";
        if ((arrY - 1) != -1) {
            number = matrix[arrX][arrY - 1];
        }

        return number;
    }

    /**
     * Gets Middle Right if such value exists
     *
     * @param arrX
     * @param arrY
     * @return the value
     *///Good
    public String getMidRight(int arrX, int arrY) {
        String number = "-1";
        if (matrix.length > arrY + 1) {
            number = matrix[arrX][arrY + 1];
        }

        return number;
    }

    /**
     * Gets Bottom Left if such value exists
     *
     * @param arrX
     * @param arrY
     * @return the value
     *///Good
    public String getBotLeft(int arrX, int arrY) {
        String number = "-1";
        if (matrix[0].length > arrX + 1 && (arrY - 1) != -1) {
            number = matrix[arrX + 1][arrY - 1];
        }

        return number;
    }

    /**
     * Gets Bottom if such value exists
     *
     * @param arrX
     * @param arrY
     * @return the value
     *///Good
    public String getBot(int arrX, int arrY) {
        String number = "-1";
        if (matrix[0].length > arrX + 1) {
            number = matrix[arrX + 1][arrY];
        }

        return number;
    }

    /**
     * Gets Bottom Right if such value exists
     *
     * @param arrX
     * @param arrY
     * @return the value
     *///Good
    public String getBotRight(int arrX, int arrY) {
        String number = "-1";
        if (matrix[0].length > arrX + 1 && matrix.length > arrY + 1) {
            number = matrix[arrX + 1][arrY + 1];
        }

        return number;
    }
    // You can insert more classes here if you want.
}
