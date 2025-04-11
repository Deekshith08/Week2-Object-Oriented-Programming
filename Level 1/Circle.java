//2

/*Write a Circle class with a radius attribute. Use constructor chaining to initialize radius with default and user-provided values.
 */

class Circle {

        private int radius;

        Circle(){
            //constructor chaining
            System.out.println("Default");
            this(50);
        }
        Circle(int radius){
            this.radius = radius;
            System.out.println("Radius entered : " + radius);
        }

        int getRadius(){
            return radius;
        }

        public void setRadius(int radius){
            this.radius = radius;
        }

        void displayDetails(){
            System.out.println("Radius : " + radius);
        }
}
class Main{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.displayDetails();
        Circle c2 = new Circle(40);
        c2.displayDetails();

    }
}