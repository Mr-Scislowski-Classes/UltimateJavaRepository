# 2.1 Objects - Instances of Classes

Area of a Circle: 
```
package Unit02.Topic2_1;

public class AreaofACircle {
    private int radius;


    public AreaofACircle(int r) {
        radius = r;    
    }

    public void cirlceparameters(){
        double area = radius * radius * 3.14;
        System.out.println(area);
    }
     public static void main(String args[]){
        AreaofACircle c1 = new AreaofACircle(5);
        c1.cirlceparameters();
     }

}

```

Circle:
```
package Unit02.Topic2_1;

public class Circle {
    private static void printArea(int r) {
        System.out.println(3.14 * r * r);
    }
    
    public static void main(String[] args) {

        printArea(1);

        printArea(5);
    }

}
```