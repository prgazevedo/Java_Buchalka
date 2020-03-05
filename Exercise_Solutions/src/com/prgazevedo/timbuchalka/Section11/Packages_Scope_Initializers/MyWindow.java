package com.prgazevedo.timbuchalka.Section11.Packages_Scope_Initializers;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow extends Frame {

    public MyWindow(String title) throws HeadlessException {
        super(title);
        setSize(600,400);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font newFont= new Font("new italic font",Font.ITALIC,16);
        g.setColor(Color.BLACK);
        g.setFont(newFont);
        g.drawString("Hello!",300,200);
        //g.draw3DRect(30,30,100,100,false);
    }
}
