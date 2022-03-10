package com.sadatmalik.concurrency.lowlevel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * This is an ExecutorService that automatically creates a thread pool using all
 * available processors (as reported by the JVM).
 *
 * The Work Stealing algorithm allows threads that have run out of work items in
 * their input queue to “steal” work items from other queues. The goal is to
 * distribute work items among processors, thus making maximal use of all available
 * processors for compute-intensive tasks. It is also used in Java’s fork/join
 * framework.
 *
 * @author sm@creativefusion.net
 */
class ShowThread implements Runnable {
    @Override
    public void run() {
        System.out.println(
            Thread.currentThread().getName());
    }
}

public class WorkStealingPool {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(
            Runtime.getRuntime().availableProcessors());

        ExecutorService exec = Executors.newWorkStealingPool();

        IntStream.range(0, 10)
                .mapToObj(n -> new ShowThread())
                .forEach(exec::execute);

        exec.awaitTermination(1, TimeUnit.SECONDS);
    }
}