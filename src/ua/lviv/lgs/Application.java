package ua.lviv.lgs;

public class Application {
    public static void main(String[] args) {

        byte a = 2;
        short s = 5;
        int d = 9;
        long f = 234;
        char g = 'c';
        double h = 5.5;
        float j = 5.7356f;
        boolean k = false;
//
//
        System.out.println("Byte max = "+ Byte.MAX_VALUE);
        System.out.println("Byte min = "+ Byte.MIN_VALUE);

        System.out.println("Short max = "+ Short.MAX_VALUE);
        System.out.println("Short min = "+ Short.MIN_VALUE);

        System.out.println("Integer max = "+ Integer.MAX_VALUE);
        System.out.println("Integer min = "+ Integer.MIN_VALUE);

        System.out.println("Long max = "+ Long.MAX_VALUE);
        System.out.println("Long min = "+ Long.MIN_VALUE);

        System.out.println("Double max = "+ Double.MAX_VALUE);
        System.out.println("Double min = "+ Double.MIN_VALUE);

        System.out.println("Float max = "+ Float.MAX_VALUE);
        System.out.println("Float min = "+ Float.MIN_VALUE);
//
//

        int[] q = new int[10];
        int max;
        int min;

        q[0] = 20;
        q[1] = 134;
        q[2] = 250;
        q[3] = 97;
        q[4] = 235;
        q[5] = 568;
        q[6] = 13;
        q[7] = 74;
        q[8] = 98;
        q[9] = 457;

        max = q[0];
        for (int i=1; i<q.length; i++)
            if (max < q[i])
                max = q[i];
        System.out.println("Max ="+ max);

        min = q[0];
        for (int i=1; i<q.length; i++)
            if (min > q[i])
                min = q[i];
        System.out.println("Min ="+ min);

    }
}
