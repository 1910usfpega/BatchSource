package com.revature.bean;

public class Animal{

 private String name;

 private int age;

 private int weight;

 private boolean pet;


 public Animal(){
 }

 public Animal(String name, int age, int weight, boolean pet){
        this.name=name;
	this.age=age;
	this.weight = weight;
	this.pet=pet;



 }

public String getName(){
	return name;
}
public void setName(String name){
	this.name=name;
}
public void setAge(int age){
	this.age=age;
}
public int getAge(){
	return age;
}
public void setWeight(int weight){
	this.weight=weight;
}

public int getWeight(){
	return weight;
}
public boolean isPet(){
	return pet;
}
public void setPet(boolean pet){
	this.pet=pet;
}

public String toString(){

return "Pet name= "+name+" Age = "+age+" Weight= "+weight+" is a pet = "+pet; 

}






}
