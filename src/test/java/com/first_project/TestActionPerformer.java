package com.first_project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestActionPerformer {


    @Test
    void totalSaturation(){
        ActionPerformer ap = new ActionPerformer();
        double saturation =  ap.totalSaturation(5);
        Assertions.assertEquals(8, saturation);
    }
    @Test
    void totalDishTest(){
        ActionPerformer ap = new ActionPerformer();
        int dishCount = ap.totalDishes(ap.totalSaturation(3));
        Assertions.assertEquals(6, dishCount);
    }

    @Test
    void totalRiceTest(){
        ActionPerformer ap = new ActionPerformer();
        int riceBushesCount = ap.totalRice(9);
        Assertions.assertEquals(84, riceBushesCount);
        riceBushesCount = ap.totalRice(6);
        Assertions.assertEquals(56, riceBushesCount);
    }
}
