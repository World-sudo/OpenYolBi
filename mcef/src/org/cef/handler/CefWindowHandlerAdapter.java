package org.cef.handler;

import org.cef.browser.CefBrowser;

import java.awt.*;

public abstract class CefWindowHandlerAdapter implements CefWindowHandler {
    @Override
    public Rectangle getRect(CefBrowser browser) {
        return new Rectangle(0, 0, 0, 0);
    }

    @Override
    public void onMouseEvent(CefBrowser browser, int event, int screenX, int screenY, int modifier, int button) {
    }
}
