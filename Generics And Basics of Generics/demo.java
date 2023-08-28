public class demo {
    public static void main(String[] args) {
        int p = 7;
        int q = 4;
        int r = 5;

        if((p+r)<(q-p) || r<p)
        {
            r=q&p;
            r=(r+3)&p;
            System.out.println(p+q+r);
        }
    }
}