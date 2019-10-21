package com.revature.homework;
import java.util.Comparator;
public class Question7comp implements Comparator <Question7emp> {

public int compare(Question7emp arg0, Question7emp arg1) {
	return (int) (arg0.getAge()- arg1.getAge())*100;
}

}
