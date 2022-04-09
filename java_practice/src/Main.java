import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int int1 = scan.nextInt();
        int int2 = scan.nextInt();
        System.out.println(int1/int2);
        System.out.println(GCD(int1, int2));
    }
    public static int GCD(int int1, int int2)
    {
        if(int1/int2 == 0)
        {
            return int2;
        }
        else if(int2/int1 == 0)
        {
            return int1;
        }
        else if(int1/int2 == 1 || int2/int1 == 1)
        {
            return int1;
        }
        else
            System.out.println("idk");
        return 0;
    }

    import java.util.Arrays;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            int[] Array;
            Array = new int[n];

            for(int i = 0; i < n; i++)
            {
                Array[i] = scan.nextInt();
            }
            Arrays.sort(Array);
            System.out.println(Array[0]);

        }
    }

2)
        import java.util.Arrays;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            int[] Array;
            Array = new int[n];

            for(int i = 0; i < n; i++)
            {
                Array[i] = scan.nextInt();
            }

            Average(n,Array);
        }

        public static void Average(double size, int[] arr)
        {
            double sum=0;

            for(int i = 0; i < size; i++)
            {
                sum = sum + arr[i];
            }
            System.out.println(sum);

            double aver = ((double) sum/size);

            System.out.println(aver);
        }
    }

3)
        import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            isPrime(n);
        }
        public static void isPrime(int n)
        {
            if(n%2 > 0)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Composite");
            }
        }
    }

4)
        import java.util.Scanner;

    public class Main {

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            System.out.println(factorial(n));
        }

        public static int factorial(int num)
        {
            if(num == 1 || num == 0)
            {
                return 1;
            }
            return factorial(num-1)*num;
        }
    }








5)
        import java.util.Scanner;

    public class Main {

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            System.out.println(fibseq(n));
        }

        public static int fibseq(int num)
        {
            if(num == 1)
            {
                return 1;
            }
            else if(num == 0)
            {
                return 0;
            }
            return (fibseq(num - 1) + fibseq(num - 2));
        }
    }

6)
        import java.util.Scanner;

    public class Main {

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(powerof(a, n));
        }
        public static int powerof(int x, int y)
        {
            if(y == 0)
            {
                return 1;
            }
            else if(y == 1)
            {
                return x;
            }


            return x * powerof(x,y-1);
        }
    }




        import java.util.Scanner;

    public class Main {

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            int arr[] = new int[n];

            for(int i = 0; i < n; i++)
            {
                arr[i] = scan.nextInt();
            }

            reverse(arr, 0, n-1);

            for(int i = 0; i < n; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }
        public static void reverse(int[] x, int i, int j){
            if(i<j){//Swap
                int tmp = x[i];
                x[i] = x[j];
                x[j] = tmp;
                reverse(x, ++i, --j);//Recursive
            }
        }
    }


}




















