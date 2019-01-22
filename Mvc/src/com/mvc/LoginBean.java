package com.mvc;

public class LoginBean
{
private String name,password;

public String getName()  
{
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void setPassword(String password) {
	this.password = password;
}

public String getPassword() {
	return password;
}
public boolean validate()
{
if(name.equals("admin") && password.equals("123"))
	{
return true;
	}
	else
	{
return false;

	}
}
}