package org.array;

import java.util.ArrayList;

import java.util.List;

public class Addition {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		System.out.println(l);
		//replace a value
		l.set(2, 30);
		System.out.println(l);
		List li=new ArrayList();
		li.add(100);
		li.add(200);
		li.add(30);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		System.out.println(li);
		li.addAll(l);
		System.out.println(l);
		li.removeAll(l);
		System.out.println(l);

	}
}
