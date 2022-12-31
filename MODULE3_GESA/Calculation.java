public class Calculation implements Runnable {
    
    public double radius,side,area;
    public double phi = 3.14;


    @Override
    public void run(){
        System.out.println("program will start in ");
        for(int i = 3; i>=1; i-=1){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }}}
    

    public void setSquare(){
        this.area = side*side;
        try {
            if (side<1){
                throw new IllegalArgumentException("cant do less than one");
            }
        }
        catch (IllegalArgumentException e) {
            
        }
    }

    public double getSquare(){
        return area;
    }

    public double getCircle() {
        return this.area;
    }

    public void setCircle() {
        if (radius <= 1) {
            throw new IllegalArgumentException();
        } else {
            this.area = this.phi * radius * radius;
        }
    }

    public double getTrapezoid() {
        return this.area;
    }

    public void setTrapezoid(double side1, double side2, double height) {
        if ((side1 < 1 || side2 < 1)) {
            throw new IllegalArgumentException();
        } else {
            this.area = (side1 + side2) * height / 2;
        }
    }
}