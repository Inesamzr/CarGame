package org.acme;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyAppTest {


    @Test
    void title_carmageddon_p2() throws IllegalAccessException {
        MyApp myApp = new MyApp();
        assertEquals("##carmageddon",myApp.gameTitle("carmageddon",2));
    }
    @Test
    void title_carmageddon_p5() throws IllegalAccessException {
        MyApp myApp = new MyApp();
        assertEquals("#####carmageddon",myApp.gameTitle("carmageddon",5));
    }

    @Test
    public void testPositionLessThan2() {
        assertEquals("##carmageddon", gameTitle("carmageddon", 1));
    }

    @Test
    public void testPositionEquals2() {
        assertEquals("##carmageddon", gameTitle("carmageddon", 2));
    }

    @Test
    public void testPositionBetween2And5() {
        assertEquals("####carmageddon", gameTitle("carmageddon", 4));
    }

    @Test
    public void testPositionGreaterThan5() {
        assertEquals("#####carmageddon", gameTitle("carmageddon", 6));
    }

    @Test
    public void testVeryLargePosition() {
        assertEquals("#####carmageddon", gameTitle("carmageddon", 100));
    }

    @Test
    public void testEmptyTitle() {
        assertEquals("##", gameTitle("", 3));
    }

    @Test
    public void testVeryLongTitle() {
        assertEquals("###verylongtitle", gameTitle("verylongtitle", 3));
    }

    @Test
    public void testNegativePosition() {
        assertEquals("##title", gameTitle("title", -3));
    }

    // La fonction gameTitle correspondant à votre implémentation
    String gameTitle(String t, int position) {
        int pTemp = Math.max(position, 2);
        if (position > 5) pTemp = 5;
        return "#".repeat(pTemp) + t;
    }


}