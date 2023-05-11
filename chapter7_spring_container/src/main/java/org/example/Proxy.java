package org.example;

public class Proxy implements Person{
    private Person delegate;

    public Proxy(Person delegate) {
        this.delegate = delegate;
    }

    @Override
    public void greet() {
        delegate.greet();
    }
}
