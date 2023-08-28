enum Week
{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class intro 
{

    enum Result 
    {
        PASS,FAIL,NR;
    }
    public static void main(String[] args) {
        
        Week m = Week.MON;
        System.out.println("m is " + m);

        int index=m.ordinal();
        System.out.println(index);

        Week []wr = Week.values();
        for(Week w1:wr)
        {
            System.out.println(w1+": "+w1.ordinal());
        }
        // Result r = Result.PASS;
        // System.out.println(r);
    }
}