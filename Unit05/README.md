# Unit 05 - Writing Classes

## 5.1 - Anatomy of a Class
- All public class in CSA. 
-Class
Default constructor
overload constructor
accessor methods
mutator methods
## 5.2 - Constructors
private attributes, but public constructor
overload constructor:
public Class(String t, int a){
    name = t;
    number = 1;

}
a variable from a methods is not local to the other
## 5.3 - Documentation with Comments
// single line commnet
/* */ multiline 
/**
* 
*
*/ to create javadoc
## 5.4 - Accessor Methods
-must be public
Return must mathc the type of the instance varialbe
- public int getnum()
## 5.5 - Mutator Methods
- to change the instance variable
- it has to be void, since it would not return anything
## 5.6 - Writing Methods
in the same class:  just object.variable;
in a different class, but public method: object.method();

## 5.7 - Static Variables and Methods
static gets access to static, non-static gets access to everything
## 5.8 - Scope and Access
- Local variable can be declared in the body of constructors. Cannot take the parameter as the varible.
- if we redeclared, it will be only in the method
## 5.9 - `this` Keyword
- to distinguish between instance variable and parameter
## 5.10 - Ethical and Social Implications of Computing Systems
