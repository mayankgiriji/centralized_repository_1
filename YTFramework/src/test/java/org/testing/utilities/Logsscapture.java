package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logsscapture
{
public static void takelog(String classname, String msg)
{
DOMConfigurator.configure("../YTFramework/layout.xml");
Logger L=Logger.getLogger(classname);
L.info(msg);
}
}
