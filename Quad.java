package com.exceptionhndl;

public class Quad {
	private double a;
	private double b;
	private double c;
	
	public Quad(double a, double b, double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
public double getDiscriminant() {
	return b*b - 4*a*c;
}
public double getRoot1() {
	return (b + Math.sqrt(getDiscriminant()))/(2*a);
}
public double getRoot2() {
	return (b - Math.sqrt(getDiscriminant()))/(2*a);
}

public void getPrint() {
	if (getDiscriminant() > 0) {
		System.out.print("r1= " + getRoot1() +"\nr2= " + getRoot2());
		}
	else if(getDiscriminant()==0) {
			System.out.print("r = " + getRoot1());
		}
	else {
			System.out.print("The equation has no roots");
		}
	
}
}
