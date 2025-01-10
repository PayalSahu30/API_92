package com.ShopperStack.GenericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utility 
{
public int generateRandomNumber()
{
	Random r=new Random();
	int num =r.nextInt();
	return num;
}

public String localDate() {
	String date=LocalDate.now().toString().replace("-", "");
	return date;
}

public String localDateTime()
{
	String dateTime = LocalDateTime.now().toString().replace("-", "").replace(":","").replace(".", "");
	return dateTime;
}
}
