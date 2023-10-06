package com.dougdomingos.structures.hashTable.hashing.openAddress;

import com.dougdomingos.structures.hashTable.hashing.closedAddress.ClosedAddressHashing;

public class LinearProbingHash<T> implements OpenAddressHashing<T> {

    private ClosedAddressHashing<T> auxHash;

    public LinearProbingHash(ClosedAddressHashing<T> hashFunction) {
        this.auxHash = hashFunction;
    }

    @Override
    public int hash(T element, int tableSize, int probeIndex) {
        int hash = (auxHash.hash(element, tableSize) + probeIndex) % tableSize;

        return hash;
    }

}
