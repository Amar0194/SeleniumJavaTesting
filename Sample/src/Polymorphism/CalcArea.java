package Polymorphism;

public class CalcArea {
        void Area(int r){
            System.out.println("Area of circle:" +(3.14*r*r));
        }
        void Area(int l, int b){
            System.out.println("Area of rectangle:"+(l*b));
        }
        public static void main(String[] args){
            CalcArea obj = new CalcArea();
            obj.Area(3);
            obj.Area(3,4);

            String sentence = "Process finished with exit code";
            System.out.println(sentence.replace("with", "from"));
            System.out.println(sentence.replace('i','d'));
        }
}