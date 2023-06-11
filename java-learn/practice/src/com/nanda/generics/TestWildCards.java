package com.nanda.generics;

import java.util.ArrayList;
import java.util.List;

public class TestWildCards{



    public void m1(List<? super Number> nums) {
        nums.add(10);
        nums.add(10.5);
    }


    public void m2(List<?> nums) {
        nums.add(null);

    }
}


