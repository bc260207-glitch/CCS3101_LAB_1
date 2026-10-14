public class TestFan {
    public static void main(String[] args) {
    	Fan fan0 = new Fan();
    	
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("green");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("yellow");
        fan2.setOn(true);
        
        Fan fan3 = new Fan();
        fan3.setSpeed(Fan.SLOW);
        fan3.setRadius(2);
        fan3.setColor("red");
        fan3.setOn(true);

        System.out.println(fan0.toString());
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan3.toString());
    }
}