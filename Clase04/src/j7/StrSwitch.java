package j7;

import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class StrSwitch {
    private static long myNumber = 10_299_332_898L;
    public static void main(String[] args) {
        int x = 5;
        String name = "|Sier|";

        switch(name){
            case "Ricardo":
                System.out.println("Uno!");
                break;
            case "Sier":
            case "sier":
            case "|Sier|":
                System.out.println("SOnido de chiflido");
                break;
            default:
                System.out.println("No number");
                break;
        }

        // Pre-java 7
        List<String> myNames = new LinkedList<String>();
        // Post-java 7
        List<String> myNames2TheRevenge = new LinkedList<>();

        try(RecursoClosable rc = new RecursoClosable()){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class RecursoClosable implements Closeable {
    @Override
    public void close() throws IOException {

    }
}
