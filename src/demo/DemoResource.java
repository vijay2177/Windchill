package demo;

import wt.util.resource.RBEntry;
import wt.util.resource.RBUUID;
import wt.util.resource.WTListResourceBundle;

@RBUUID("demo.DemoResource")
public final class DemoResource extends WTListResourceBundle{

	
	@RBEntry("Dummy")
	public static final String   Dummy1 = "demo.dummy.description";

	
	@RBEntry("Dummy Tool Tip")
	public static final String   Dummy2 = "demo.dummy.tooltip";
 
 
	@RBEntry("activity_new.png")
	public static final String   Dummy3 = "demo.dummy.icon";

}
