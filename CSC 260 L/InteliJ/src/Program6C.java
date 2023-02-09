/*
    Luke Nordheim
    Course: CSC 260L
    February 25, 2021
    Assignment: Lab 6
    Instructor: Doyle
 */


public class Program6C {
    public static void main(String[] args) {
        int count = 0;
        int anotherCount = 0;

        // loop 1
        for (int j = 1; j <= 10; j++) {
            count = count + j;
            System.out.print(count + "\n");
        }

        System.out.print("\n");

        // loop 2
        for (int i = 1; anotherCount <= 200; i++) {
            anotherCount = anotherCount + i;
            System.out.print(anotherCount + "\n");
        }
    }
}

/*
1
3
6
10
15
21
28
36
45
55

1
3
6
10
15
21
28
36
45
55
66
78
91
105
120
136
153
171
190
210
 */