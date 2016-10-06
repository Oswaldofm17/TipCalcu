package com.oswaldofm17.tipcalcu;

/**
 * Created by oswaldofm on 10/6/16.
 */

import android.app.Application;

public class TipCalcu extends Application {
        private final static String ABOUT_URL = "https://github.com/";

        public String getAboutUrl()
        {
            return ABOUT_URL;
        }
}
