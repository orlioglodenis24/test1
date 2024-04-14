public class Figure {
    double dim1;
    double dim2;

    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Figure(10, 10);
        figures[1] = new Figure.Rectangle(10, 10);
        figures[2] = new Figure.Triangle(10, 10);
        for (Figure figure : figures) {
            figure.area();
        }
    }

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double area() {
        System.out.println("не определина");
        return 0;
    }

    public static class Rectangle extends Figure {
        public Rectangle(double dim1, double dim2) {
            super(dim1, dim2);
        }

        public double area() {
            System.out.println("область четырехугольника: ");
            return dim1 * dim2;
        }
    }

    public static class Triangle extends Figure {
        public Triangle(double dim1, double dim2) {
            super(dim1, dim2);
        }

        public double area() {
            System.out.println("область треугольника: ");
            return dim1 * dim2 / 2;
        }
    }
}
