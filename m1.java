class sum
{
int a=10,b=20,c;
void calculate()
{
c=a+b;
}
void print()
{
System.out.println(+c);
}
}
class m1
{
public static void main(String arg[])
{
sum obj=new sum();
obj.calculate();
obj.print();
}
}