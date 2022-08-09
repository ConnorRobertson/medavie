public class Main {
    public static void main(String[] args) {
        CeilingFan testFan = new CeilingFan();
        System.out.println(testFan);
        testFan.pullSpeedCord();
        testFan.pullSpeedCord();
        testFan.pullSpeedCord();
        testFan.pullSpeedCord();
        testFan.pullDirectionCord();
        System.out.println(testFan);
    }
}
