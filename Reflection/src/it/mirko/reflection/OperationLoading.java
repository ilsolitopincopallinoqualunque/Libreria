package it.mirko.reflection;

import java.lang.reflect.*;

public class OperationLoading {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException{
	Class c=Class.forName("it.mirko.reflection.Somma");
	Operation op=(Operation)c.newInstance();
	op.opChoise();
	System.out.println(op.execute(25, 65));
	
	Method[] ms=c.getMethods();
	for (Method m:ms){
	System.out.println(ms);
	}
	
	
}
	
}
