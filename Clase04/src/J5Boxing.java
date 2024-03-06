import java.util.ArrayList;
import java.util.List;

public class J5Boxing {
    public static void main(String[] args) {
        int i = 5;
        double d = 7.3;
        char c = 'c';
        byte b = 26;
        boolean t = true;
        long l = 8213L;
        float f = 4.3f;
        short s = 1;

        Integer integer;
        Double dou;
        Character character;
        Byte b1;
        Boolean bool;
        Long lo;
        Float ff;
        Short ds;

        List<Double> alumnos = new ArrayList<>();
        alumnos.add(9.9);
        alumnos.add(9.3);
        alumnos.add(0.1);
        alumnos.add(Double.parseDouble("5.4"));

        calculateAverage(3.9, 4.9, 2.8, 5.45, 9.1);
        calculateAverage();
        calculateAverage(1.1);
    }

    private static void calculateAverage(double... doubles){
        for (int i = 0; i < doubles.length; i++) {
            System.out.println("Param");
        }
    }

    private static void forEachLoopAverage(List<Double> alumnos){
        for (Double alumno : alumnos) {
            System.out.println("Algo para que veamos " + alumno);
        }
    }
}
