//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class type_casting {
    public type_casting() {
    }

    public static void main(String[] args) {
        float a = 23.52F;
        double b = (double)a;
        long d = (long)a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        int y = 2;
        String p = String.valueOf(y);
        System.out.println(y);
        System.out.println(p);
        System.out.println(y + y);
        System.out.println(p + p);
        String o = "30";
        int h = Integer.parseInt(o);
        float j = Float.parseFloat(o);
        long k = Long.parseLong(o);
        double l = Double.parseDouble(o);
        System.out.println(o);
        System.out.println(h + h);
        System.out.println(j + j);
        System.out.println(k + k);
        System.out.println(l + l);
    }
}
