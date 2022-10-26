import java.util.ArrayList;
import java.util.Scanner;

public class Shape3DApp {
    public void Run(){
        Scanner sc = new Scanner(System.in);

        int listLength = EnterNumberOfShapes(sc);
        ArrayList<Shape> shapes = CreateShapes(sc, listLength);
        CalculationSelection(sc, shapes);
    }

    private int EnterNumberOfShapes(Scanner sc){
        System.out.println("Enter the total number of shapes: ");
        return sc.nextInt();
    }

    private ArrayList<Shape>  CreateShapes(Scanner sc, int ListLength){
        ArrayList<Shape> shapeList = new ArrayList<>();

        for(int i = 0; i < ListLength; i++){
            System.out.println("Choose your shape: ");
            for(int j = 4; j < ShapeType.values().length - 1; j++){
                System.out.printf("%d. %s\n",j-3, ShapeType.GetShapeByIndex(j).get().name());
            }

            // Input validation
            int selection = 0;
            while(true){
                selection = sc.nextInt();
                Shape newShape = null;
                switch(selection){
                    case 1 -> { newShape = new Sphere(); }
                    case 2 -> { newShape = new Pyramid(); }
                    case 3 -> { newShape = new Cuboid(); }
                    case 4 -> { newShape = new Cone(); }
                    case 5 -> { newShape = new Cylinder(); }
                }

                if(newShape != null){
                    System.out.println("Enter the required dimension/s for the selected shape: ");
                    newShape.EnterDimensions();
                    System.out.println("Created new " + newShape.ShapeType.name());
                    shapeList.add(newShape);
                    break;
                }


                System.out.println("Invalid selection! Please try again!");
            }
        }

        return shapeList;
    }

    private void CalculationSelection(Scanner sc, ArrayList<Shape> shapes){
        System.out.println("Choose the type of calculation: ");
        System.out.println("1. Calculate Area ");
        System.out.println("2. todo ");
        System.out.println("3. todo ");
        System.out.println("4. Quit ");

        // Input validation
        int selection = 0;
        while(true){
            selection = sc.nextInt();
            switch(selection){
                case 1 -> { CalculateArea(shapes); return; }
                case 4 -> { return; }
            }


            System.out.println("Invalid selection! Please try again!");
        }
    }
    private void CalculateArea(ArrayList<Shape> shapes){
        double sum = 0;
        for(Shape shape : shapes){
            sum += shape.CalculateArea();
        }
        System.out.println("Calculated total area is: " + String.format("%.2f", sum));
    }
}
