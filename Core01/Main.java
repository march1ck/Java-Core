package Core01;

public class Main {
    public static void main(String[] args) {
//        int age = 15;
//        String name = "Bob";
//        long time = 151519265L;
//        float a = 15f;
//        double b = 15.2;
//        char firstLetter = 'B';
//        boolean isBoy = true;
//        byte aByte = 0110;
//        short o = 2541;

        int x;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);

        int[] array = new int[] {10 , 45 , 78 , 25 , 2594 , 144 ,125 , 471 ,5 , 41};

        int minValue = array[0];
        int maxValue = array[0];

        for (int i = 0; i < array.length; i++ ) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
            if (maxValue < array[i]){
                maxValue = array[i];
            }
        }
        System.out.println("min Value: " + minValue);
        System.out.println("max Value: " + maxValue);

    }
}
