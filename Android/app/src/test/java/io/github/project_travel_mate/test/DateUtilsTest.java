package io.github.project_travel_mate.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import utils.DateUtils;


public class DateUtilsTest {


    @Test
    public void toMillis_correctMillis_yearAfter2000() {
        assertEquals(DateUtils.rfc3339ToMills("2019-10-15T00:00:00.000GMT").longValue(), 1571094000000L);
    }

    @Test
    public void toMillis_correctMillis_yearBefore2000() {
        assertEquals(DateUtils.rfc3339ToMills("1993-01-26T00:00:00.000GMT").longValue(), 728006400000L);
    }

    @Test
    public void toMillis_correctMillis_withTime() {
        assertEquals(DateUtils.rfc3339ToMills("1993-01-26ZT10:30:02.000GMT").longValue(), 728044202000L);
    }

    @Test
    public void getDate_correctDate_yearAfter2000() {
        assertEquals(DateUtils.getDate(1571090400000L), "15 okt 2019");
    }

    @Test
    public void getDate_correctDate_yearBefore2000() {
        assertEquals(DateUtils.getDate(728002800000L), "26 jan 1993");
    }



}