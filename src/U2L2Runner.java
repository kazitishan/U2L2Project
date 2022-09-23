public class U2L2Runner {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(150, 200);
        Rectangle s = new Rectangle(100);
        Rectangle d = new Rectangle();
        r.setWidth(125);
        s.setWidth(125);
        d.setWidth(125);
        int rPerimeter = (r.getLength() * 2) + (r.getWidth() * 2);
        int sPerimeter = (s.getLength() * 4);
        int dPerimeter = (d.getLength() * 2) + (d.getWidth() * 2);
        int perimeterSum = rPerimeter + sPerimeter + dPerimeter;
        int rArea = r.calculateArea();
        int sArea = s.calculateArea();
        int dArea = d.calculateArea();
        int areaSum = rArea + sArea + dArea;
        System.out.println("The total amount of fencing needed is " + perimeterSum);
        
    }
}
