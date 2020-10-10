package com.phy.orm.jpa;

public interface UniqueIdGenerator<T> {
    T getNextUniqueId();
}
