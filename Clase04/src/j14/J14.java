package j14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class J14 {

    public static void main(String[] args) {
        List<String> xstrList = switch (args.length){
            case 1 -> new ArrayList<>();
            case 2 -> new LinkedList<>();
            default -> null;
        };
    }

    private void doCool(){
        var s = ":";
        var sb = new StringBuilder();
    }
}
