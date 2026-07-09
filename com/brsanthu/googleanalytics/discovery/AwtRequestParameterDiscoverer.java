/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package com.brsanthu.googleanalytics.discovery;

import com.brsanthu.googleanalytics.GoogleAnalyticsConfig;
import com.brsanthu.googleanalytics.discovery.DefaultRequestParameterDiscoverer;
import com.brsanthu.googleanalytics.internal.GaUtils;
import com.brsanthu.googleanalytics.request.DefaultRequest;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.io.Serializable;

public class AwtRequestParameterDiscoverer
extends DefaultRequestParameterDiscoverer {
    @Override
    public DefaultRequest discoverParameters(GoogleAnalyticsConfig graphicsDeviceArray, DefaultRequest defaultRequest) {
        Serializable serializable;
        super.discoverParameters((GoogleAnalyticsConfig)graphicsDeviceArray, defaultRequest);
        graphicsDeviceArray = Toolkit.getDefaultToolkit();
        if (GaUtils.isEmpty(defaultRequest.screenResolution())) {
            serializable = graphicsDeviceArray.getScreenSize();
            defaultRequest.screenResolution((int)((Dimension)serializable).getWidth() + "x" + (int)((Dimension)serializable).getHeight() + ", " + graphicsDeviceArray.getScreenResolution() + " dpi");
        }
        if (GaUtils.isEmpty(defaultRequest.screenColors())) {
            graphicsDeviceArray = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
            serializable = new StringBuilder();
            for (GraphicsDevice graphicsDevice : graphicsDeviceArray) {
                if (((StringBuilder)serializable).length() != 0) {
                    ((StringBuilder)serializable).append(", ");
                }
                ((StringBuilder)serializable).append(graphicsDevice.getDisplayMode().getBitDepth());
            }
            defaultRequest.screenColors(((StringBuilder)serializable).toString());
        }
        return defaultRequest;
    }
}

