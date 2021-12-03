package com.aor.numbers;

import java.util.Arrays;
import java.util.List;

class ListDeduplicatorStub implements GenericListDeduplicator{
    public List<Integer> deduplicate(List<Integer> l){
        return Arrays.asList(1,2,4);
    }
}