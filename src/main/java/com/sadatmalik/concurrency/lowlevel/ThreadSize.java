package com.sadatmalik.concurrency.lowlevel;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Discov- ering the size of a Thread object varies between operating systems.
 * This program tests it by creating Thread objects until the JVM runs out of memory
 *
 * @author sm@creativefusion.net
 */
public class ThreadSize {
    static class Dummy extends Thread {
        @Override public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec =
            Executors.newCachedThreadPool(); int count = 0;
        try {
            while(true) {
                exec.execute(new Dummy());
                count++;
            }
        } catch(Error e) {
            System.out.println(
                    e.getClass().getSimpleName() + ": " + count);
            System.exit(0);
        } finally {
            exec.shutdown();
        }
    }
}