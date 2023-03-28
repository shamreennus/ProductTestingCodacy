package bonus.a03;

import static java.lang.System.*;


public class LCGRandom
{
    public  static final int    MAX_STREAMS = 10;
    private static final long   a        = 33;       // 7^5/
    private static final long   m        = 251; // 2^31 - 1
    private static final double one_by_m = 1.0 / m;

    private static final long   SEED [] = { 251,33,13,5 };
    //Example : with M = 251, A = 33, S = 13 and N = 5
    
    private int  stream;   
    private long  x;
   
    private  final Double []  params = new Double [1];

    @SuppressWarnings("removal")
	public LCGRandom (int stream)
    {
        this.stream  = stream;
        x = SEED [stream];
        params [0] = new Double (stream);

    } 


    @SuppressWarnings("removal")
	public void incrStream () 
    {
        stream++;
        params [0] = new Double (stream);

    }


   
    public Double [] getParameters ()
    {
        return  params;

    } // getParameters


    public double gen ()
    {
        x = (a * x) % m;    // 64-bit integer arithmetic

        return ((double) x) * one_by_m;

    } 


    public long igen ()
    {
        x = (a * x) % m;    // 64-bit integer arithmetic

        return x;

    } // igen


    public static void main (String [] args)
    {
       LCGRandom rng = new LCGRandom (1);
       for (int i = 1; i < 4; i++) {
          out.print (rng.gen () + " , ");
          if (i % 5 == 0) out.println ();
       }

    } 


} 
