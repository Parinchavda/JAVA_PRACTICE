public class arraytostring

{
    public static void main(String[] args)
    {
        String[] s = new String[]
                { "this","is","my","first","program" } ;
        StringBuilder sb = new StringBuilder();
        for (String i : s)
        {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
