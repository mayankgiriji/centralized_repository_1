package org.testing.assertion;

import org.testing.utilities.Logsscapture;

public class Assertion1 
{
public static void assertion_1(String exp, String actual,String classname )
{
if(exp.equals(actual))
{
Logsscapture.takelog(classname, " Assertion is getting passed");
}
else 
{
	Logsscapture.takelog(classname, " Assertion is getting Failed");
}
}
}
