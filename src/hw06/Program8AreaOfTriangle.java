package hw06;

class Program8AreaOfTriangle {

        //instance class
        public void areaTriangle(double b, double h) {
            double area;//local variable
            area = (b*h)/2;
            System.out.println("The area of Triangle is: " + area);
        }
        public static void main(String[] args){
            Program8AreaOfTriangle obj = new Program8AreaOfTriangle();//object creation to call instance method
            obj.areaTriangle(20.5,10);
        }
    }

