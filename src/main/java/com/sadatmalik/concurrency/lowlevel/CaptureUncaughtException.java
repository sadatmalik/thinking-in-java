package com.sadatmalik.concurrency.lowlevel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * A factory that assigns an uncaught exception handler to newly
 * created threads.
 *
 * @author sm@creativefusion.net
 */
class ExceptionThread2 implements Runnable {
    @Override public void run() {
        Thread t = Thread.currentThread();
        System.out.println("run() by " + t.getName());
        System.out.println(
            "eh = " + t.getUncaughtExceptionHandler());
        throw new RuntimeException();
    }
}

class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("caught " + e);
    }
}

class HandlerThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        System.out.println(this + " creating new Thread");
        Thread t = new Thread(r);
        System.out.println("created " + t);
        t.setUncaughtExceptionHandler(
            new MyUncaughtExceptionHandler());
        System.out.println(
            "eh = " + t.getUncaughtExceptionHandler());
        return t;
    }
}

public class CaptureUncaughtException {
    public static void main(String[] args) {
        ExecutorService exec =
                Executors.newCachedThreadPool(
                        new HandlerThreadFactory());

        exec.execute(new ExceptionThread2());
        exec.shutdown();
    }
}
/* Output:
HandlerThreadFactory@106d69c creating new Thread
created Thread[Thread-0,5,main]
eh = MyUncaughtExceptionHandler@52e922
run() by Thread-0
eh = MyUncaughtExceptionHandler@52e922
caught java.lang.RuntimeException
*/
