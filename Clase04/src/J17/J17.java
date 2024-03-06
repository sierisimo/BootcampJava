package J17;

public class J17 {
    public static void main(String[] args) {
        WebPageState state = new Loaded();
        state.doFOo();
    }
}

sealed class WebPageState permits Loading, Loaded, Failed {
    public void doFOo(){

    }
}

final class Loading extends WebPageState {
    @Override
    public void doFOo() {
        super.doFOo();
    }
}

final class Loaded extends WebPageState {

}

final class Failed extends WebPageState {

}

//class Prohibited extends WebPageState {
//
//}