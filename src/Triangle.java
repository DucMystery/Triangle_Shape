
public  class Triangle extends Shape {

    private double size1;
    private double size2;
    private double size3;

    public Triangle(){
        size1 =1.0;
        size2 =1.0;
        size3 =1.0;
    }

    public Triangle(double size1,double size2,double size3,String color){
        this.size1 =size1;
        this.size2 =size2;
        this.size3 =size3;
        this.color =color;
    }



    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double getPerimeter(){
        return size1+size2+size3;
    }

    public double getArea(){
        double p =getPerimeter()/2;
        return Math.sqrt(p*(p-this.size1)*(p-this.size2)*(p-this.size3));
    }

    public String toString(){
        return "A triangle with  a ="+getSize1()+" b = "+getSize2()+" c = "+getSize3()+" and with "+this.color+" color";
    }
}
