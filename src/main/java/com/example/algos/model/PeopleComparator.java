package com.example.algos.model;

import java.util.Comparator;

public class PeopleComparator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        int compare = Integer.compare(o1.getAge(), o2.getAge());

        if (compare == 0){
            return o1.getName().compareTo(o2.getName());
        }
return compare;

    }


}
