class Sample3
{ 
   static int a=10;
   public static void main(String[] args)
   {
     int x=100;
     System.out.println("start");
     Sample3.test1(x);
     System.out.println("stop");
    }
     static void test1( int y)
     {
       System.out.println(y);
       System.out.println(Sample3.a);
	   return;
      }
    
 }
