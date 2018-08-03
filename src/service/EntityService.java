package service;
import java.util.*;

import entity.Bus;
import entity.Car;
import entity.Plane;
import entity.Train;
import entity.Vehicle;
public class EntityService 
{
	public void vehicle1()
	{
		Scanner sc=new Scanner(System.in);
		String vehicleType,name,year,company,varient,model,engineType;
		Car obje1=new Car();
		System.out.println("Enter the name of the car.\n");
		name=sc.nextLine();
		System.out.println("Enter the year.\n");
		year=sc.nextLine();
		System.out.println("Enter the name of the company.\n");
		company=sc.nextLine();
		System.out.println("Enter the name of the varient.\n");
		varient=sc.nextLine();
		System.out.println("Enter the model.\n");
		model=sc.nextLine();
		System.out.println("Enter the type of engine.\n");
		engineType=sc.nextLine();
		obje1.setType("car");
		obje1.setName(name);
		obje1.setYear(year);
		obje1.setCompany(company);
		obje1.setVarient(varient);
		obje1.setModel(model);
		obje1.setEngineType(engineType);
		String text=obje1.toString();
		System.out.println(text);
	}
	public void vehicle2()
	{
		Scanner sc=new Scanner(System.in);
		String vehicleType,name,year,company,typeOfBus,typeOfEngine;
		Bus obje2=new Bus();
		System.out.println("Enter the name of the bus.\n");
		name=sc.nextLine();
		System.out.println("Enter the year.\n");
		year=sc.nextLine();
		System.out.println("Enter the name of the company.\n");
		company=sc.nextLine();
		System.out.println("Enter the type of bus.\n");
		typeOfBus=sc.nextLine();
		System.out.println("Enter the type of engine.\n");
		typeOfEngine=sc.nextLine();
		obje2.setType("bus");
		obje2.setName(name);
		obje2.setYear(year);
		obje2.setCompany(company);
		obje2.setTypeOfBus(typeOfBus);
		obje2.setTypeOfEngine(typeOfEngine);
		String text=obje2.toString();
		System.out.println(text);	
	}
	public void vehicle3()
	{
		Scanner sc=new Scanner(System.in);
		String vehicleType,name,year,company,typeOfTrain,typeOfTrainEngine;
		Train obje3=new Train();
		System.out.println("Enter the name of the train.\n");
		name=sc.nextLine();
		System.out.println("Enter the year.\n");
		year=sc.nextLine();
		System.out.println("Enter the name of the company.\n");
		company=sc.nextLine();
		System.out.println("Enter the type of train.\n");
		typeOfTrain=sc.nextLine();
		System.out.println("Enter the type of engine.\n");
		typeOfTrainEngine=sc.nextLine();
		obje3.setType("bus");
		obje3.setName(name);
		obje3.setYear(year);
		obje3.setCompany(company);
		obje3.setTypeOfTrain(typeOfTrain);
		obje3.setTypeOfTrainEngine(typeOfTrainEngine);
		String text=obje3.toString();
		System.out.println(text);	
	}
	public void vehicle4()
	{
		Scanner sc=new Scanner(System.in);
		String vehicleType,name,year,company,typeOfPlane,varient;
		Plane obje4=new Plane();
		System.out.println("Enter the name of the plane.\n");
		name=sc.nextLine();
		System.out.println("Enter the year.\n");
		year=sc.nextLine();
		System.out.println("Enter the name of the company.\n");
		company=sc.nextLine();
		System.out.println("Enter the type of train.\n");
		typeOfPlane=sc.nextLine();
		System.out.println("Enter the varient.\n");
		varient=sc.nextLine();
		obje4.setType("plane");
		obje4.setName(name);
		obje4.setYear(year);
		obje4.setCompany(company);
		obje4.setTypeOfPlane(typeOfPlane);
		obje4.setVarient(varient);
		String text=obje4.toString();
		System.out.println(text);	
		
	}
	
}
