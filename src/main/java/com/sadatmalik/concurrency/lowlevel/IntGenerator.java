package com.sadatmalik.concurrency.lowlevel;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * cancel() changes the state of the canceled flag and isCanceled() tells
 * whether the flag is set. Because the canceled flag is AtomicBoolean, it
 * is atomic, which means simple operations like assignment and value return
 * happen without the possibility of interruption, so you can’t see the
 * field in an intermediate state in the midst of those simple operations.
 *
 * @author sm@creativefusion.net
 */
public abstract class IntGenerator {

    private AtomicBoolean canceled = new AtomicBoolean();

    public abstract int next();

    public void cancel() {
        canceled.set(true);
    }

    public boolean isCanceled() {
        return canceled.get();
    }
}