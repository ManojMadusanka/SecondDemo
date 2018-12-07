package com.qa.util;

import com.qa.base.TestBase;

public class TestUtil extends TestBase {
public static long page_load_time_out=20;
public static long implicit_wait=10;

public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
}

}
