package com.geofffilippi.javaReference;

import java.util.Date;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * The <code>JavaReference</code> class demonstrates features of Java
 *
 * @author      Geoff Filippi
 * @see "Core Java 1 Volume 1"
 */
public class JavaReference {

    // Constants
    // `static` members belong to the class (not a specific instance)
    // `static` `final` members cannot be altered, therefore constant
    public static final int MIN_INT = -2147483648;
    public static final int MAX_INT = 2147483647;
    public static final short MIN_SHORT = -32768;
    public static final short MAX_SHORT = 32767;
    public static final long MIN_LONG = -9223372036854775808L;
    public static final long MAX_LONG = 9223372036854775807L;
    public static final byte MIN_BYTE = -128;
    public static final byte MAX_BYTE = 127;
    public static final String EMPTY_STRING = "";

    // Class property definitions
    // Java Types
    int intExample = 40000;
    short shortExample = 30000;
    // long literals require an 'L' suffix
    long longExample = 3000000000L;
    byte byteExample = 120;
    float floatExample = 3.14F;
    // 3.14D is allowed, but double is assumed
    double doubleExample = 3.14;
    // avoid except for strict UTF-16 uses
    char charExample = 'A';
    boolean booleanExample = true;
    
    /**
     * JavaReference main.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("In main()");

	// Operators
        System.out.println("1 + 2 = " + (1 + 2));
        System.out.println("1 - 2 = " + (1 - 2));
        System.out.println("2 * 3 = " + (2 * 3));
        System.out.println("6 / 3 = " + (6 / 3));
        System.out.println("7 % 3 = " + (7 % 3));

	System.out.println("3 != 7 = " + (3 != 7));
	System.out.println("3 < 7 = " + (3 < 7));
	System.out.println("3 <= 7 = " + (3 <= 7));
	System.out.println("3 == 7 = " + (3 == 7));
	System.out.println("3 >= 7 = " + (3 >= 7));
	System.out.println("3 > 7 = " + (3 > 7));
	
	System.out.println("true && true = " + (true && true));
	System.out.println("true || false = " + (true || false));

	System.out.println("true ? true : false = " + (true ? true : false));
	
	// TODO & | ^ ~ << >> 
	System.out.println("Math.sqrt(4) = " + (Math.sqrt(4)));
	System.out.println("Math.sqrt(4) = " + (Math.sqrt(4)));
	System.out.println("Math.sin(Math.PI) = " + (Math.sin(Math.PI)));
	System.out.println("Math.cos(Math.PI) = " + (Math.cos(Math.PI)));
	System.out.println("Math.tan(Math.PI) = " + (Math.tan(Math.PI)));
	System.out.println("Math.atan(Math.PI) = " + (Math.atan(Math.PI)));
	System.out.println("Math.atan2(Math.PI, 0.0) = " + (Math.atan2(Math.PI, 0.0)));
	System.out.println("Math.log(Math.E) = " + (Math.log(Math.E)));
	System.out.println("Math.log10(1000) = " + (Math.log10(1000)));

	// TODO - type conversion and casting
	// TODO - operator precedence
	// TODO - ENUMs
	//
	// Strings
        String exampleString = "Example String";
        System.out.println(exampleString);
        System.out.println("One String " + "Another String");
        System.out.println();

        System.out.println("MIN_INT [" + MIN_INT +
			"]\nMAX_INT [" + MAX_INT +
			"]\nMIN_SHORT [" + MIN_SHORT +
			"]\nMAX_SHORT [" + MAX_SHORT +
			"]\nMIN_LONG [" + MIN_LONG +
			"]\nMAX_LONG [" + MAX_LONG +
			"]\nMIN_BYTE [" + MIN_BYTE +
			"]\nMAX_BYTE [" + MAX_BYTE + "]\n");

	String stringOne = "stringOne";
	String stringTwo = "stringTwo";

	System.out.println(stringOne + ".equals(" + stringTwo + ") = [" + stringOne.equals(stringTwo) + "]");

	stringOne = "sameString";
	stringTwo = "sameString";

	System.out.println("stringOne.equals(" + stringTwo + ") = [" + stringOne.equals(stringTwo) + "]");

	System.out.println("(" + stringTwo + ") = [" + stringOne.equals(stringTwo) + "]");
	System.out.println("(" + stringTwo + ") = [" + stringOne.equals(stringTwo) + "]");

        System.out.println("EMPTY_STRING.length() == 0 [" + ( EMPTY_STRING.length() == 0 )+ "]");

	String nullString = null;

        System.out.println("nullString == null [" + ( nullString == null )+ "]");

	StringBuilder stringBuilder = new StringBuilder();
	char aChar = 'a';
	String aString = " built string";

	stringBuilder.append(aChar);
	stringBuilder.append(aString);

	String combinedString = stringBuilder.toString();
	
	System.out.println("combinedString [" + combinedString + "]");

        System.out.println(new Date());
        System.out.printf("%tF", new Date());
        System.out.println();

	// TODO - Reading files
	
	// Flow
	// Conditional
	int smallerInt = 1;
	int biggerInt = 5;

	if (biggerInt >= smallerInt) {
		System.out.println("biggerInt >= smallerInt");
	} else if (biggerInt < smallerInt) {
	        // cannot happen
	} else {
                // cannot happen either
	}

	while (smallerInt < biggerInt) {
	   System.out.println("In while loop... " + smallerInt + " < "  + biggerInt);
	   smallerInt++;
	}
	System.out.println("smallerInt [" + smallerInt + "]");

	smallerInt = 1;
	biggerInt = 5;

	do {
	   System.out.println("In do loop..." + smallerInt + " < "  + biggerInt);
	   smallerInt++;
	} while (smallerInt < biggerInt);
	System.out.println("smallerInt [" + smallerInt + "]");

	for (smallerInt = 1; smallerInt < biggerInt; smallerInt++) {
	   System.out.println("In for loop... " + smallerInt + " < "  + biggerInt);
	}

	int caseValue = 3;

	switch (caseValue) {
		case 1:
			System.out.println("case 1 chosen");
			break;
		case 2:
			System.out.println("case 2 chosen");
			break;
		case 3: 
			System.out.println("case 3 chosen");
			break;
		default: 
			System.out.println("default case");
			break;
	}

	int[] anArray = new int[25];

	for (int i = 0; i < 25; i++) {
		anArray[i] = i;
	}

	for (int i = 0; i < 25; i++) {
		System.out.print(anArray[i] + " ");
	}
	System.out.println();

	System.out.println("anArray.length [" + anArray.length + "]");

	for (int element : anArray) {
		System.out.print(element + " ");
	}
	System.out.println();

	System.out.println(Arrays.toString(anArray));

	ArrayList<Object> anArrayListOfObjects = new ArrayList<Object>(25);

    }

}
