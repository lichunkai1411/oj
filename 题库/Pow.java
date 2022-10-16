/**
 * 实现pow(x，n)即计算x的整数n次幂函数
 * 当n为偶数时，对n分治，拆分x*x的n/2的次方，当n为奇数时拆分x*pow(x,n-1)
 */

public class Pow {
    public double pow(double x, int n) {
        long N = n;
        return N >= 0 ? pow(x, N) : 1.0 / pow(x, -N);
    }

    public double pow(double x, long y) {
        if (y == 0) {
            return 1.0;
        }
        double result = pow(x, y / 2);
        return y % 2 == 0 ? result * result : result * result * x;

    }
}


