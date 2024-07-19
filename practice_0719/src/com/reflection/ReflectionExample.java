package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

public class ReflectionExample {
	public static void main(String[] args) {
		
		Class c1 = Car.class;
		System.out.println(c1.getPackage());
		System.out.println(c1.getSimpleName());
		
		Field[] declaredFields = c1.getDeclaredFields();
		for (Field f : declaredFields) {
			System.out.println(f.getType().getName() + " " + f.getName());
		}
		
		Constructor[] declaredConstructors = c1.getDeclaredConstructors();
		for (Constructor c : declaredConstructors) {
			Parameter[] parameters = c.getParameters();
			for (Parameter p : parameters) {
				System.out.println(p.getType().getName() + " " + p.getName());
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
