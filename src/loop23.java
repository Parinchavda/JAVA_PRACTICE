//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class loop23 {
    public loop23() {
    }

    public static void main(String[] args)
    {
        for(int i = 1; i <= 5; ++i)
        {
            for(int j = 1; j <= i; ++j)
            {
                if (j != 1 && j != 5)
                {
                    if (j != 2 && j != 4)
                    {
                        System.out.print("L ");
                    } else
                    {
                        System.out.print("K ");
                    }
                } else
                {
                    System.out.print("H ");
                }
            }
            System.out.println();
        }
    }
}
