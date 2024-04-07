**Quick Intro To Java and Object Oriented Programming**

**Terminology**
**JVM**: Java Virtual Machine.  The main thing that runs your java code. Each program
runs within JVM instance, it uses the same process and pool of RAM.

**Class**: blue print of an object.  Typically it has properties, and methods.
properties define the characteristic of the object (e.g. a Ball object may have "color" property)
Methods is how we tell the object to do something.

**Constructor**: special method in a class used to "construct" an object.  It usually
takes in arguments that are used as the default value for the object properties.

**Object/Instance**: created out of the class ("new"), by calling the appropriate constructor

**Instantiation**: the act of creating a new object. 
String a = new String("hello") --> we're instantiating a new String object.

**Access modifier**: This is how we limit access to certain things in an object.  Java supports:
public, protected, private, and package protected.
For now, just know public and private. 

**public**: Openly accessible.  It can be accessed from within the class itself, or it can be accessed externally

**private**: Closed to public.  It can only be accessed from within the class (e.g. called from other method within the class)

**Static**: the scope of the variable is at the class level. This is different than instant-level
scoping, where the data is only accessible from the instance of the object.

**Anatomy of a class**
```
// this class is publicly accessible 
// (anyone running in the same JVM can instantiate and access this class)
public class Telephone {

    // properties of the Telephone
    // because there's no "static" keyword, this is instance variables
    // but since it's private, it's not accessible externally
    // example:
    // Telephone.brand --> error: it's not static, so cannot be accessed via class level.
    //
    // Telephone a = new Telephone()
    // a.brand; // error: brand is private.  If brand is public, this line would've worked, because a is the instance of Telephone.
    private String brand;
    private boolean hasData;
    
    // constructor. When called, it will create a new Telephone instance with a 
    // predefined brand, and "hasData"
    // example:
    // Telephone iphone = new Telephone("iphone", true);
    // Telephone nineKey = new Telephone("nokia", false);
    // 
    // See how we can create 2 totally different types of phones 
    // using the same class. 
    public Telephone(String brand, boolean hasData) {
        this.brand = brand;
        this.hasData = hasData;
    }
    
    // instance methods, can only be called via instance of an object
    // example:
    // Telephone.setBrand("foo") // error: it cannot be accessed from class Level
    // 
    // Telephone iphone = new Telephone("iphone", true);
    // iphone.setBrand("samsung") // technically correct, but morally wrong.
    //
    // This is a good example of API design, even though you can make
    // everything public, it may not be a good idea, especially when the method
    // changes a critical data for the object. 
    // 
    // As noted in this example, it's like buying an phone from Temu
    // they will construct a new phone, and call setBrand("iphone") and sell it as iPhone
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setHasData(boolean flag) {
        this.hasData = flag;
    }
    
    public boolean getHasData() {
        return hasData;
    }
    
    public String getBrand() {
        return brand;
    }
}
```