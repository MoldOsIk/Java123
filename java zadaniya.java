1.Basics of software code development
Линейные программы
1.Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Double z,a,b,c;

        Scanner scanner = new Scanner(System.in);
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            z=((a-3)*b/2)+c;
            System.out.println(z);
        }


    }
2.
3.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Integer x,y;

        Scanner scanner = new Scanner(System.in);

            x = scanner.nextInt();
            y = scanner.nextInt();

            System.out.println((Math.sin(x)+ Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y));
        }


    }
4.
import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double R = 523.555;
        int integerPart = (int) R;
        double fractionalPart = R - integerPart;

        double result = (fractionalPart * 1000) + integerPart / 1000.0;

        System.out.println(result);
           }
       }	
5.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int T;

        Scanner scanner = new Scanner(System.in);

        T = scanner.nextInt();
        System.out.println(T/3600+"ч" + (T%3600)/60+"м"+(T%3600)%60+"с");


    }


    }

6
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x,y;

        Scanner scanner = new Scanner(System.in);


        x = scanner.nextInt();
        y = scanner.nextInt();

        if(x<=3 && x>=-3 && x>=-0.5 && x<= 0.5 && y>=-3 & y<=4 && y>=-2 && y<=-0.5  )
            System.out.println("true");
        else System.out.println("false");



    }


}

Ветвления
1.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;

        Scanner scanner = new Scanner(System.in);


        a = scanner.nextInt();
        b = scanner.nextInt();

        if(a+b<180 && a+b==90)
            System.out.println("Треугольник существует и он прямоугольный");
        else if (a+b<180 && a+b!=90) {
            System.out.println("Треугольник существует и он не прямоугольный");
        }
        else
            System.out.println("Треугольник не существует");
        
    }
    
    }
2.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c,d, minab,mindc;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        minab = Math.min(a,b);
        mindc = Math.min(d,c);
        System.out.println(Math.max(minab,mindc));


    }

    }

3.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1,y1,x2,y2,x3,y3;
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();
        x3 = scanner.nextInt();
        y3 = scanner.nextInt();

        // Вычисляем угловые коэффициенты прямых AB и BC
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);

        // Проверяем, равны ли угловые коэффициенты
        if (slopeAB == slopeBC) {
            System.out.println("Точки A, B и C лежат на одной прямой");
        } else {
            System.out.println("Точки A, B и C не лежат на одной прямой");
        }




    }


4.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b , x,y,z; // x - Ширина кирипча, y - высота, z - длина
        a  = scanner.nextInt();
        b  = scanner.nextInt();
        x  = scanner.nextInt();
        y  = scanner.nextInt();
        z  = scanner.nextInt();
        if ((x <= a && y <= b) || (x <= b && y <= a) || (x <= a && z <= b) || (x <= b && z <= a) || (y <= a && z <= b) || (y <= b && z <= a)) {
            System.out.println("Кирпич пройдет через отверстие");
        } else {
            System.out.println("Кирпич не пройдет через отверстие");
        }
    }
    }
5.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x;
        x  = scanner.nextDouble();
        if(x<= 3)
            System.out.println(Math.pow(x,2)-3*x+9);
        else
            System.out.println(1.0/(Math.pow(x,3)+6));
    }
    }
Циклы
1.import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, sum=0;
        a = scanner.nextInt();
        for (int i = 0; i<a;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
    }
2.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,h;
        System.out.println("ВВедите длину отрезка А B");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.println("ВВедите шаг");
        h = scanner.nextDouble();
        for (;a<b;a+=h)
        {
            if(a>2)
                System.out.println(a);
            else
                System.out.println(-1*a);

        }
    }
    }
3.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rez = 0;
        for (int i = 0; i<=100; i++)
            rez += i*i;
        System.out.println(rez);
    }
    }
4.import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger rez = new BigInteger("111111111111111111111111111111111111111111111111111111111111111111111");
        for (int i = 1; i<=200; i++)
            rez = rez.multiply(BigInteger.valueOf((long)i*i));
        System.out.println(rez);
    }
}
5import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double e = 0.1;
        double sum = 0; // переменная для хранения суммы

        for (int n = 1; ; n++) {
            double An = 1 / Math.pow(2, n) + 1 / Math.pow(3, n); // вычисление общего члена ряда

            if (Math.abs(An) >= e) { // проверка условия модуля члена ряда
                sum += An; // добавление члена ряда к сумме
            } else {
                break; // если модуль члена ряда меньше заданного е, выходим из цикла
            }
        }

        System.out.println("Сумма членов ряда: " + sum);
    }
}
6.import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            for (char c = 'A'; c <= 'Z'; c++) {
                int ascii = (int) c; // получение численного обозначения символа в памяти компьютера
                System.out.println("Символ: " + c + ", Численное обозначение: " + ascii);
            }
        }
}
7.
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int m = scanner.nextInt();
       int n = scanner.nextInt();
       for (int i = m; i<=n; i++)
       {
           System.out.println("Делители числа " + i +" : ");
           for (int j = 2; j<=i; j++)
           {
               if(i%j == 0)
                   System.out.println(j + " ");
           }
       }
    }
}
8.
import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c=b;
        while(a>0)
        {
            int s = a%10;
            c=b;
            while(c>0)
            {
                if (s == c%10)
                    System.out.println(s + " Входит в оба числа");
                c/=10;
            }
            a/=10;
        }
           }
       }
2.Algorithmization
Одномерные массивы
1.
import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k;
        k = scanner.nextInt();
        int[] a ={12,14,25,36,41,566};
        for (int i=0;i<a.length; i++)
        {
            if(a[i]%k == 0)
            {
                System.out.println("число " + a[i] + " кратно числу " + k);
            }
        }
           }
       }
2.import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z, count = 0;
        z = scanner.nextInt();
        int a[] = {33,3,3,4,876,32,76,28,645,15, 3,4};
        for (int i=0;i<a.length; i++)
        {
                if(a[i]>z)
                {
                    count++;
                    a[i]=z;
                }
        }
        System.out.println("Массив после изменения: ");
        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("Кол-во замен: " + count);
           }
       }
3.
import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите элемент массива: ");
            array[i] = scanner.nextDouble();
        }

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (double element : array) {
            if (element > 0) {
                positiveCount++;
            } else if (element < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Количество положительных элементов: " + positiveCount);
        System.out.println("Количество отрицательных элементов: " + negativeCount);
        System.out.println("Количество нулевых элементов: " + zeroCount);
           }
       }
4.
import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = {1,5,6,2,10,15,22,7,22,23,88,55,125};
        int maxel = 0;
        int minel = 2147483600;
        int indexmax = 0;
        int indexmin = 0;
        for (int i = 0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i =0; i<a.length; i++)
        {
            if(a[i]>maxel)
            {
                maxel = a[i];
                indexmax = i;
            }

            if(a[i]<minel) {
                minel = a[i];
                indexmin = i;
            }
        }
        a[indexmin] = maxel;
        a[indexmax] = minel;
        for (int i = 0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Максимальный элемент = " + maxel + " С индексом " + indexmax);
        System.out.println("Минимальный элемент = " + minel+ " С индексом " + indexmin);
           }
       }
5.
import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = {-2,1,-3,0,10,15,-227,2,23,8,55,125};
        int maxel = 0;
        int minel = 2147483600;
        int indexmax = 0;
        int indexmin = 0;
        for (int i = 0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Выводим числа, для которых: ai>i");
        for(int i =0; i<a.length; i++)
        {
            if(a[i]>i)
                System.out.println(a[i] +" i = " +i );

        }

           }
       }
7.import java.awt.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Formattable;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,7,8,9,9,10,11,15,16,17,18,19,20};
        int n = a.length;
        int sum = 0;
        for (int i = 0; i<a.length/2; i++) {
            int maxSum = a[i]+a[a.length-i-1];
            if(maxSum>sum)
                sum = maxSum;
        }
        System.out.println(sum);
           }
       }