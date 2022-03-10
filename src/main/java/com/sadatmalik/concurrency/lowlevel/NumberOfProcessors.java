package com.sadatmalik.concurrency.lowlevel;

/**
 * Get the number of processors on the current machine.
 *
 * @author sm@creativefusion.net
 */
public class NumberOfProcessors {
    public static void main(String[] args) {
        System.out.println(
                Runtime.getRuntime().availableProcessors()
        );
    }
}
