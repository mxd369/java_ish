
// http://pythontutor.com/visualize.html#code=import%20java.util.*%3B%0A%0Apublic%20class%20YourClassNameHere%20%7B%0A%20%20%20%20public%20static%20void%20main(String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20Map%3CString,%20Double%3E%20treasures%20%3D%20new%20HashMap%3C%3E(%29%3B%0A%20%20%20%20%20%20String%20x%20%3D%20%22palm%22%3B%0A%20%20%20%20%20%20treasures.put(%22beach%22,%2025.%29%3B%0A%20%20%20%20%20%20treasures.put(%22palm%22,%2050.%29%3B%0A%20%20%20%20%20%20treasures.put(%22cove%22,%2075.%29%3B%0A%20%20%20%20%20%20treasures.put(%22x%22,%20100.%29%3B%0A%20%20%20%20%20%20treasures.put(%22palm%22,%20treasures.get(%22palm%22%29%20%2B%20treasures.size(%29%29%3B%0A%20%20%20%20%20%20treasures.remove(%22beach%22%29%3B%0A%20%20%20%20%20%20double%20found%20%3D%200%3B%0A%20%20%20%20%20%20for%20(double%20treasure%20%3A%20treasures.values(%29%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20found%20%2B%3D%20treasure%3B%0A%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20System.out.println(treasures.get(x%29%29%3B%0A%20%20%20%20%20%20System.out.println(treasures.get(%22x%22%29%29%3B%0A%20%20%20%20%20%20System.out.println(found%29%3B%20%20%20%20%20%20%0A%20%20%20%20%7D%0A%7D&cumulative=false&curInstr=24&heapPrimitives=false&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false
package reading1staticChecking;

import java.util.*;
	
	public class ListVsArrayQuestion {
	    public static void main(String[] args) {
	      Map<String, Double> treasures = new HashMap<>();
	      String x = "palm";
	      treasures.put("beach", 25.);
	      treasures.put("palm", 50.);
	      treasures.put("cove", 75.);
	      treasures.put("x", 100.);
	      treasures.put("palm", treasures.get("palm") + treasures.size());
	      treasures.remove("beach");
	      double found = 0;
	      for (double treasure : treasures.values()) {
	          found += treasure;
	      }
	      System.out.println(treasures.get(x));
	      System.out.println(treasures.get("x"));
	      System.out.println(found);      
	    }
	}

/*

Frames
main:5



Frames
main:6
treasures	
 
Objects
java.util.HashMap instance



Frames
main:7
treasures	
 
x	"palm"
Objects
java.util.HashMap instance



Frames
main:8
treasures	
 
x	"palm"
Objects
java.util.HashMap instance


Frames
main:9
treasures	
 
x	"palm"
Objects
java.util.HashMap instance


Frames
main:10
treasures	
 
x	"palm"
Objects
java.util.HashMap instance


Frames
main:11
treasures	
 
x	"palm"
Objects
java.util.HashMap instance


Frames
main:12
treasures	
 
x	"palm"
Objects
java.util.HashMap instance


Frames
main:13
treasures	
 
x	"palm"
Objects
java.util.HashMap instance


Frames
main:14
treasures	
 
x	"palm"
found	0.0
Objects
java.util.HashMap instance


Frames
main:15
treasures	
 
x	"palm"
found	0.0
treasure	75.0
Objects
java.util.HashMap instance


step 13
Frames
main:16
treasures	
 
x	"palm"
found	75.0
Objects
java.util.HashMap instance


Step 14
Frames
main:14
treasures	
 
x	"palm"
found	75.0
Objects
java.util.HashMap instance


Step 15
Frames
main:15
treasures	
 
x	"palm"
found	75.0
treasure	54.0
Objects
java.util.HashMap instance


Step 16
Frames
main:16
treasures	
 
x	"palm"
found	129.0
Objects
java.util.HashMap instance


Step 17
Frames
main:14
treasures	
 
x	"palm"
found	129.0
Objects
java.util.HashMap instance


Step 18
Frames
main:15
treasures	
 
x	"palm"
found	129.0
treasure	100.0
Objects
java.util.HashMap instance


Step 19
Frames
main:16
treasures	
 
x	"palm"
found	229.0
Objects
java.util.HashMap instance


Step 20
Frames
main:14
treasures	
 
x	"palm"
found	229.0
Objects
java.util.HashMap instance


Step 21
Frames
main:17
treasures	
 
x	"palm"
found	229.0
Objects
java.util.HashMap instance


Step 22
Frames
main:18
treasures	
 
x	"palm"
found	229.0
Objects
java.util.HashMap instance


Step 23
Frames
main:19
treasures	
 
x	"palm"
found	229.0
Objects
java.util.HashMap instance


Step 24
Frames
main:20
treasures	
 
x	"palm"
found	229.0
Objects
java.util.HashMap instance


Program Terminated
Frames
main:20
treasures	
 
x	"palm"
found	229.0
Return
value	void
Objects
java.util.HashMap instance

*/