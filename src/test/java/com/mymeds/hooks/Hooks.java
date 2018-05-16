package com.mymeds.hooks;

import com.mymeds.base.BrowserFactory;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.net.MalformedURLException;
import java.util.Random;

public class Hooks {

    private BrowserFactory brow_factory;

    public Hooks(BrowserFactory browserFactory){
        this.brow_factory = browserFactory;
    }

    @Before
    public void startbrowser() throws MalformedURLException {
        brow_factory.openBrowser();
        brow_factory.timeout();
        brow_factory.maximise();
        brow_factory.waitpage();
    }
    @After
    public void teardown(){
        brow_factory.closebrowser();
    }


}
