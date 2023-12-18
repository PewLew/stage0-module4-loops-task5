package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        PrintHorizontal(length);
        for(int i = 0; i < height-2; i++){
            PrintVertical(length);
        }
        PrintHorizontal(length);
    }


    public static void PrintHorizontal(int length){
        for(int i = 0; i < length-1; i++){
            System.out.print(8);
        }
        System.out.println(8);
    }

    public static void PrintVertical(int length){
        System.out.print(8);
        for(int i = 0; i < length-2; i++){
            System.out.print(" ");
        }
        System.out.println(8);
    }
}
