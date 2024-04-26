package mx.rafex.free.project.moveYourMouse;

import java.util.logging.Level;

import mx.rafex.free.project.moveYourMouse.mouse.Mouse;
import mx.rafex.free.project.moveYourMouse.mouse.impl.MouseImpl;

public abstract class ApplicationAbstract implements IApp {

    private static final long serialVersionUID = -9216467486422559017L;

    private static Mouse mouse = MouseImpl.getInstance();

    protected static void init() {
        LOG.log(Level.INFO, String.format("[Init: %s ]", System.currentTimeMillis()));

        mouse.moveTest();
    }

}
