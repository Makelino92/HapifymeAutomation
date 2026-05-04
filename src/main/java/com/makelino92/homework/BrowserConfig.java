package com.makelino92.homework;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class BrowserConfig {
    private BrowserType browser;
    private String version;
    private boolean isHeadless;


    public BrowserConfig(BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }


    public BrowserConfig(BrowserType browser, String version) {
        this(browser, version, false);
    }


    public BrowserConfig(BrowserType browser) {
        this(browser, "latest", false);
    }


    @Contract(value = " -> new", pure = true)
    public static @NotNull BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }


    public void afiseazaConfig() {
        System.out.println("Browser: " + browser + ", Version: " + version + ", Headless: " + isHeadless);
    }
}