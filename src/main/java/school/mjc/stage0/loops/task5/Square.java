package school.mjc.stage0.loops.task5;

public class Square {
    public void printSquareFrom8s(int sideLength){
        PrintHorizontal(sideLength);
        for(int i = 0; i < sideLength-2; i++){
            PrintVertical(sideLength);
        }
        PrintHorizontal(sideLength);
    }

    public static void PrintHorizontal(int sideLength){
        for(int i = 0; i < sideLength-1; i++){
            System.out.print(8);
        }
        System.out.println(8);
    }

    public static void PrintVertical(int sideLength){
        System.out.print(8);
        for(int i = 0; i < sideLength-2; i++){
            System.out.print(" ");
        }
        System.out.println(8);
    }
}
