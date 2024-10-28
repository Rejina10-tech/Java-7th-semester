/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 *
 * @author Dell
 */
public class A  extends Canvas implements Runnable
{
	private int x;
	private int y;

	private int w;
	private int h;

	private Color c;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getW() {
            return w;
        }

        public void setW(int w) {
            this.w = w;
        }

        public int getH() {
            return h;
        }

        public void setH(int h) {
            this.h = h;
        }

        public Color getC() {
            return c;
        }

        public void setC(Color c) {
            this.c = c;
        }

        public A()
	{
		this.x = 0;
		this.y = 0;
		this.w = 50;
		this.h = 50;
		this.c = Color.red;
                
                Thread t1 = new Thread(this);
		t1.start();
	}

	public A(int w, int h, Color c)
	{
		this.x = 0;
		this.y = 0;
		this.w = w;
		this.h = h;
		this.c = c;
                
                Thread t1 = new Thread(this);
		t1.start();
	}

	public void paint(Graphics g)
	{
		g.setColor(c);
		g.fillRect(x, y, w, h);
	}

	public void run()
	{
		Random random = new Random();

		while(true)
		{

			try
			{
				Thread.sleep(1000);	
			}
			catch(Exception e)
			{
				
			}

			x = random.nextInt(100);
			y = random.nextInt(100);
			repaint();

		}
	}

}
