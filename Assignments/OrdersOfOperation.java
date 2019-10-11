//	-Order of operations 
//	1. Exact match (same parameter types)
//		Ex AddEmUp(9, 4) and AddEmUp(int, int)
//	2. Conversion (Ex: (9, int) -> (int, double))
//	3. Boxing (Ex: (3, MyInt) -> (int, int))
//	4. varargs (Ex: (int, int) -> (int...x))
//
//Done by Derron Marshall w/ Lucy Stapleton


static int myInt = 3;
static Integer myInteger = 6;
static Integer myInteger2 = 10;
static double myDouble = 4.56;
static Double myDouble2 = 3.33;

public static void main(String[] args)
{
  System.out.println(addTogether(myInt, myInt));
  System.out.println(addTogether(myInt, myDouble));
  System.out.println(addTogether(myInteger, myDouble2));
  //System.out.println(addTogether());
  addTogether();
}

public static int addTogether(int a, int b)
{
 return a+b;
}

public static double addTogether(double a, double b)
{
 return a+b;
}

public static void addTogether(int...z)
{
  System.out.println("count: " + z.length);
  for(int y:z)
	{System.out.print(z + " ");}
  System.out.println();
}
}