package j5;

public enum J5Versions {
    JDK1("Java 1.0"), J2SE("Java 1.2"), J2SE1_3("Java 1.3"), J2SE1_4("Java 1.4"), J2SE5("Java 5");

    private String formalName;

    J5Versions(String formalName){
        this.formalName = formalName;
    }

    public String getFormatted(){
        return formalName.toLowerCase();
    }
}

class FooJ5 {
    public static final FooJ5 JDK1 = new FooJ5();

    private FooJ5(){

    }
    public static void main(String[] args) {
        J5Versions j5Versions = J5Versions.J2SE;
    }
}

