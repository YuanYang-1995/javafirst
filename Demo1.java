public class Demo1
{
    public static void main(String[] args)
    {
        System.out.println("Hello Java!");
        for(int i= 0 ;i<10;i++)
        {
            for(int j= 0 ;j<8;j++)
            {
            System.out.print("*");
            }
            System.out.println("");
        }

        int a = 19,b=22;
        int c = MathCalc.add(a, b);
        System.out.println("a+b="+c);
        return ;
    }
}