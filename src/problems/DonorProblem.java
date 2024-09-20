package problems;

import java.util.Scanner;

class InvalidDonorException extends RuntimeException{
	
	
	
}

class Donor{
	
	 int age;
	 int weight;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Donor(int age, int weight) {
		super();
		this.age = age;
		this.weight = weight;
	}
	
	public Donor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Donor [age=" + age + ", weight=" + weight + "]";
	}
	
	
	
}

public class DonorProblem {

	public static void main(String[] args) {
		
		
		System.out.println("Enter age for Donor");;
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age <21 || age>61) {
			throw new InvalidDonorException();
		}
		System.out.println("Enter age for Donor");;
		int weight = sc.nextInt();

		if(weight<40 || weight>70) {
			throw new InvalidDonorException();
		}
		
		Donor d= new Donor(age,weight);
		System.out.println("Donor created");
		System.out.println(d);
		
		
	}
}
