public class HitungABC {
    int a;
    int b;
    int c;
    String persamaan;
    int d;
    double x1;
    double x2;

    public void setData(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        persamaan = a + "X^2 + " + "(" + b + ")" + "X + " + c;
        this.d = (b*b) - (4 * a * c);
        
    }

    public void getX1X2() {
        if(d > 0) {
            double D = Math.sqrt(d);
            x1 = (-b + D) / 2 * a;
            x2 = (-b - D) / 2 * a;
        }else if(d == 0) {
            x1 = -b / (2 * a);
            x2 = -b / (2 * a);
        }else if(d < 0) {
            double D = Math.sqrt(-d);
            x1 = (-b - (2 * a)) + (D / (2 * a));
            x2 = (-b - (2 * a)) - (D / (2 * a));
        }
    }

    public void tampilkanData() {
        System.out.println("Persamaan : " + persamaan);
        System.out.println("D : " + d);
        System.out.println("X1 : " + x1);
        System.out.println("X2 : " + x2);
    }

}
