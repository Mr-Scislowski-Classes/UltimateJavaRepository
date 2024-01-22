# 2.5 Calling a Non-void Method

public class Gpa{
    public void calcAverage(int a, int b, int c, double d){
        double average = (a + b + c +d)/4;
        return average;
    }
    public static void main (String[] args){
        Gpa student1 = new Gpa;
        System.out.println("The average is: " + student1.calcAverage(4, 4, 3, 3));
    }
    
}