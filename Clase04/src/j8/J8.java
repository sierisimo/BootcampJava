package j8;

import j5.J5Boxing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class J8 {
    public static void main(String[] args) {
        J5Boxing j5 = null;
        Optional<J5Boxing> j5BoxingOptional = Optional.ofNullable(j5);
//                Optional.of(failingMethod());

        j5BoxingOptional.ifPresent(new Consumer<J5Boxing>() {
            @Override
            public void accept(J5Boxing j5Boxing) {

            }
        });
        j5BoxingOptional.ifPresentOrElse(new Consumer<J5Boxing>() {
            @Override
            public void accept(J5Boxing j5Boxing) {

            }
        }, new Runnable() {
            @Override
            public void run() {

            }
        });
        Optional<J5Boxing> j5filtered = j5BoxingOptional.filter(new Predicate<J5Boxing>() {
            @Override
            public boolean test(J5Boxing j5Boxing) {
                return false;
            }
        });

        j5BoxingOptional.ifPresent(j5Boxing -> { });
        j5BoxingOptional.ifPresentOrElse(j5Boxing -> { }, () -> { });
        j5BoxingOptional.stream().mapMulti((x, y) -> { });
        Optional<J5Boxing> j5filtered2 = j5BoxingOptional.filter(j5Boxing -> false);

        lamdaMethod(() -> {});

        Function<Integer, Integer> negative = x -> -x;
        int minusFive = negative.apply(5);
        Function<Integer, Integer> superFun = negative.andThen(x -> x * 2).andThen(x -> x + 10);

        Stream<String> stream = Stream.of("!2", "@#2",":DFASD");
        stream.parallel()
                .filter(s -> s.contains("@"))
                .map(s -> s.length())
                .filter(i -> i % 2 == 0);

        List<String> myNames = new LinkedList<>();
        myNames.stream();
        myNames.forEach(System.out::println);

        // Pre-java 8
        Date d = new Date();
        Calendar c = Calendar.getInstance();

        // Post-java 8
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalTime localTime = LocalTime.now(ZoneId.of("Amer/MX"));

        localTime.isAfter(LocalTime.ofSecondOfDay(29));
        localTime.minus(10L, ChronoUnit.SECONDS);
    }

    @FunctionalInterface
    interface MyLambda{
        void myMethod();

        default void myDefaultedMethod(){
            System.out.println("SUP");
        }
    }

    static void lamdaMethod(MyLambda myLambda){
        myLambda.myMethod();
        myLambda.myDefaultedMethod();
    }

    static Optional<J5Boxing> calculate(J5Boxing j5){
        return Optional.ofNullable(j5)
                .or(new Supplier<Optional<? extends J5Boxing>>() {
                    @Override
                    public Optional<? extends J5Boxing> get() {
                        return Optional.of(new J5Boxing());
                    }
                });
    }
}

class MyDate extends Date {
    public MyDate(long date) {
        super(10L);
    }

    @Override
    public long getTime() {
        return 90L;
    }
}
