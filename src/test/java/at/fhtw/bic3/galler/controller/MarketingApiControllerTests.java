package at.fhtw.bic3.galler.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarketingApiControllerTests {


    @Test
    void calcVeryGoodGrade() {
        var controller = new MarketingApiController();

        for(int i = 88;i<=100;i++){
           var grade =  controller.calcGrade(i);
           assertEquals(1,grade);
        }
    }
    @Test
    void calcGoodGrade() {
        var controller = new MarketingApiController();

        for(int i = 75;i<88;i++){
            var grade =  controller.calcGrade(i);
            assertEquals(2,grade);
        }
    }


    @Test
    void calcSatisfyingGrade() {
        var controller = new MarketingApiController();

        for(int i = 63;i<75;i++){
            var grade =  controller.calcGrade(i);
            assertEquals(3,grade);
        }
    }
    @Test
    void calcBadGrade() {
        var controller = new MarketingApiController();

        for(int i = 50;i<63;i++){
            var grade =  controller.calcGrade(i);
            assertEquals(4,grade);
        }
    }
    @Test
    void calcVeryBadGrade() {
        var controller = new MarketingApiController();

        for(int i = 0;i<50;i++){
            var grade =  controller.calcGrade(i);
            assertEquals(5,grade);
        }
    }
}
