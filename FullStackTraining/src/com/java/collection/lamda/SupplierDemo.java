package com.java.collection.lamda;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Pattern;

public class SupplierDemo {
 public static void main(String[] args) {
	Predicate <String> p=(a)->
	/* For Email Verification */
//	Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$",Pattern.CASE_INSENSITIVE).matcher(a).find();
	Pattern.compile("(0/91)?[7-9][0-9]{9}",Pattern.CASE_INSENSITIVE).matcher(a).find();

	System.out.println(p.test("9099990900"));
}
}
