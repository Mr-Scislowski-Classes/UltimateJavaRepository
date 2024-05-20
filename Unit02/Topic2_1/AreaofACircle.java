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
