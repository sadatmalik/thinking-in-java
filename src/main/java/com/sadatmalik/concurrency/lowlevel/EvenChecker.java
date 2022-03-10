package com.sadatmalik.concurrency.lowlevel;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * The test() method starts multiple EvenCheckers that access the same
 * IntGenerator. EvenChecker tasks constantly read and test the values from
 * their associated IntGenerator. If the IntGenerator causes a failure,
 * test() reports it and returns.
 *
 * All EvenChecker tasks that depend on the IntGenerator object check it to
 * see whether it’s been canceled. If generator.isCanceled() is true, run()
 * returns. Any EvenChecker task can call cancel() on the IntGenerator, which
 * causes all other EvenCheckers using that IntGenerator to gracefully shut
 * down.
 *
 * by making tasks depend on a non-task object, we eliminate the potential
 * race condition.
 *
 * @author sm@creativefusion.net
 */
public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator generator, int id) {
        this.generator = generator;
        this.id = id;
    }

    @Override
    public void run() {
        while(!generator.isCanceled()) {
            int val = generator.next();
            if(val % 2 != 0) {
                System.out.println(val + " not even!");
                generator.cancel(); // Cancels all EvenCheckers
            }
        }
    }

    // Test any IntGenerator:
    public static void test(IntGenerator gp, int count) {
        List<CompletableFuture<Void>> checkers =
                IntStream.range(0, count)
                        .mapToObj(i -> new EvenChecker(gp, i))
                        .map(CompletableFuture::runAsync)
                        .collect(Collectors.toList());

            checkers.forEach(CompletableFuture::join);
    }

    // Default value for count:
    public static void test(IntGenerator gp) {
        //new TimedAbort(4, "No odd numbers discovered");
        test(gp, 10);
    }
}