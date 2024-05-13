package mx.rafex.free.project.moveYourMouse.mouse.impl;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.logging.Level;

import mx.rafex.free.project.moveYourMouse.mouse.Mouse;

public class MouseImpl implements Mouse {

    private static Mouse instance = null;

    public static synchronized Mouse getInstance() {

        if (instance == null) {
            LOG.log(Level.INFO, String.format("Create %s", "jojo"));
            instance = new MouseImpl();
        }

        return instance;
    }

    private MouseImpl() {

    }

    @Override
    public void moveDemo() {
        try {
            // Create an instance of Robot
            final var robot = new Robot();

            // Move the mouse cursor to the coordinates (x, y)
            final var x = 500; // X coordinate
            final var y = 500; // Y coordinate
            robot.mouseMove(x, y);

            // Simulate a mouse click
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Press the left mouse button
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Release the left mouse button
        } catch (final AWTException e) {
            LOG.log(Level.WARNING, String.format("Fail %s", ""), e);
        }
    }

}
