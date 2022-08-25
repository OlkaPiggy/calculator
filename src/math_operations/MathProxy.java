package math_operations;

public class MathProxy implements IMath{
    Math math;
    public MathProxy()
    {
        math = new Math();
    }

    public double add(double x, double y)
    {
        return math.add(x,y);
    }

    public double sub(double x, double y)
    {
        return math.sub(x,y);
    }

    public double mul(double x, double y)
    {
        return math.mul(x,y);
    }

    public double div(double x, double y)
    {
        return math.div(x,y);
    }

    public double result(int val[],char sign[])
    {   double res=0;

        for(int i=0;i<sign.length;i++)
         {

         }
        switch(sign) {
            case ('+'):
                res=math.add(num1,num2);
                break;
            case ('-'):
                res=math.sub(num1,num2);
                break;
            case ('*'):
                res=math.mul(num1,num2);
                break;
            case ('/'):
                res=math.div(num1,num2);
                break;
        }
        return res;
    }
}

