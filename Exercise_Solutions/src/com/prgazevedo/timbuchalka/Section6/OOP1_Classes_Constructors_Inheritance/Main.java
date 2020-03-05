package com.prgazevedo.timbuchalka.Section6.OOP1_Classes_Constructors_Inheritance;

import com.prgazevedo.timbuchalka.Section6.OOP1_Classes_Constructors_Inheritance.InheritanceChallenge.Car;
import com.prgazevedo.timbuchalka.Section6.OOP1_Classes_Constructors_Inheritance.carpetCost.Calculator;
import com.prgazevedo.timbuchalka.Section6.OOP1_Classes_Constructors_Inheritance.carpetCost.Carpet;
import com.prgazevedo.timbuchalka.Section6.OOP1_Classes_Constructors_Inheritance.carpetCost.Floor;
import com.prgazevedo.timbuchalka.Section6.OOP1_Classes_Constructors_Inheritance.InheritanceChallenge.PoliceCar;


public class Main {

    public static void main(String[] args) {
		//testBankAccount();
		//testSimpleCalculator();
		//testVipCustomer();
		//testWall();
		//testPoint();
		//testCarpetCost();
		//testComplexNumber();
		testPoliceCar();
    }



	public static void testPoliceCar(){
		PoliceCar policeCar1 = new PoliceCar();
		policeCar1.setGears(Car.Gears.D);
		policeCar1.increaseSpeed(10);
		policeCar1.setDirection(Car.Direction.F);
		policeCar1.setSiren(true);
		policeCar1.increaseSpeed(10);
		policeCar1.getSpeed();
		policeCar1.getDirection();
		policeCar1.getGears();
		policeCar1.isSiren();
		PoliceCar policeCar2 = new PoliceCar(0,"Police car",false, Car.Gears.NEUTRAL, Car.Direction.F,true);
		policeCar2.increaseSpeed(10);
		policeCar2.increaseSpeed(20);
		policeCar2.increaseSpeed(20);
		policeCar2.increaseSpeed(20);
		policeCar2.decreaseSpeed(20);
		policeCar2.decreaseSpeed(20);
		policeCar2.decreaseSpeed(20);
		policeCar2.decreaseSpeed(20);



	}


    public static void testComplexNumber(){
		ComplexNumber one = new ComplexNumber(1.0, 1.0);
		ComplexNumber number = new ComplexNumber(2.5, -1.5);
		one.add(1,1);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		one.subtract(number);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		number.subtract(one);
		System.out.println("number.real= " + number.getReal());
		System.out.println("number.imaginary= " + number.getImaginary());
	}

	public static void testCarpetCost(){
		Carpet carpet = new Carpet(3.5);
		Floor floor = new Floor(2.75, 4.0);
		Calculator calculator = new Calculator(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());
		carpet = new Carpet(1.5);
		floor = new Floor(5.4, 4.5);
		calculator = new Calculator(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());
	}

    public static void testWall(){
    	Wall wall = new Wall();
		System.out.println("setHeight to -10");
    	wall.setHeight(-10);
    	System.out.println("getHeight is : "+wall.getHeight());
		System.out.println("setwidth to -10");
		wall.setWidth(-10);
		System.out.println("getwidth is : "+wall.getWidth());
		Wall wall2= new Wall(10,10);
		System.out.println("getArea of Wall with 10x10");
		System.out.println("getArea is : "+wall2.getArea());
	}

	public static void testPoint(){
    	Point point1 = new Point();
		System.out.println("point1 has values");
		System.out.println("x : "+point1.getX()+" y : "+point1.getY());
		Point point2 = new Point(10,10);
		System.out.println("point2 has values");
		System.out.println("x : "+point2.getX()+" y : "+point2.getY());
		System.out.println("point2 distance to 0,0 is: "+ point2.distance());
		System.out.println("point2 distance to 10,10 is: "+ point2.distance(10,10));
		System.out.println("point2 distance to point 1 is: "+ point2.distance(point1));
	}

    public static void testVipCustomer(){
    	VipCustomer vipCustomer1 = new VipCustomer();
		printVipCustomerdata(vipCustomer1);
		VipCustomer vipCustomer2 = new VipCustomer("John Doe",0.0);
		printVipCustomerdata(vipCustomer2);
		VipCustomer vipCustomer3 = new VipCustomer("John Smith", 100, "jsmith@email.com");
		printVipCustomerdata(vipCustomer3);

	}

	public static void printVipCustomerdata(VipCustomer vip){
		System.out.println("Customer name: " + vip.getName());
		System.out.println("Customer credit: " + vip.getCredit());
		System.out.println("Customer email: " + vip.getEmail());
	}

    public static void testSimpleCalculator(){
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4) ;
		System.out.println("add=" + calculator.getAdditionResult());
		System.out.println("subtract="+calculator.getSubtractionResult());
		calculator.setFirstNumber(5.25) ;
		calculator.setSecondNumber(0) ;
		System.out.println("multiply=" + calculator.getMultiplicationResult());
		System.out.println("division="+calculator.getDivisionResult());
	}

	public static void testBankAccount(){
    	/*
    	BankAccount account= new BankAccount();
    	account.setAccountNumber(1000);
    	account.setBalance(1000);
    	account.setCustomerName("John Smith");
    	account.setEmail("jsmith@email.com");
    	account.setPhoneNumber(123456789);
    	*/
    	BankAccount account = new BankAccount( 100, 0.0,"John Smith" , "jsmith@email.com", 123456789);
		System.out.println("account details");
		System.out.println(account.getAccountNumber());
		System.out.println(account.getCustomerName());
		System.out.println(account.getEmail());
		System.out.println(account.getPhoneNumber());
		System.out.println(account.getBalance());
		System.out.println("deposit 100");
		account.depositFunds(100);
		System.out.println("deposit -100");
		account.depositFunds(-100);
		System.out.println("withdraw 1200");
		account.withdrawFunds(1200);


	}
}



