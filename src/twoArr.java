//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class twoArr {
    public twoArr() {
    }

    public static void main(String[] args) {
        int[][] marks = new int[][]{{1, 2, 2}, {1, 2, 2}, {1, 2, 2}};

        for(int i = 0; i < marks.length; ++i) {
            for(int j = 0; j < marks[i].length; ++j) {
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
