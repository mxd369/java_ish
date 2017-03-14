michaeldang$ cd Desktop
michaeldang$ vi NumConversion.java
michaeldang$ javac NumConversion
error: Class names, 'NumConversion', are only accepted if annotation processing is explicitly requested
1 error
michaeldang$ vi DemoWithArguments.java
michaeldang$ vi DemoWithArguments.java
michaeldang$ javac DemoWithArguments
error: Class names, 'DemoWithArguments', are only accepted if annotation processing is explicitly requested
1 error
michaeldang$ javac DemoWithArguments.java
michaeldang$ java DemoWithArguments
michaeldang$ java DemoWithArguments hello moto
hello
moto
michaeldang$ javac NumConversion.java
michaeldang$ java NumConversion 1 2 3 4
You entered1