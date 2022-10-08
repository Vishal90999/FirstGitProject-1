package com.vny.test;

import com.vny.add.Addition;
import com.vny.div.Division;
import com.vny.multi.Multiplication;
import com.vny.sub.Subtraction;

public class TestMath {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(10, 20);
		
		Subtraction s=new Subtraction();
		s.sub(170, 30);
		
		Division d=new Division();
		d.div(48, 7);
		
		Multiplication m=new Multiplication();
		m.mul(25, 10);
	}

}
