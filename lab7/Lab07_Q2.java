package lab7;

public class Lab07_Q2 {
    public static void main(String[] args) {

        int[] queue = new int[20];
        System.out.println("---- Testing joinQueue ----");
        joinQueue(3, queue);
        joinQueue(2, queue);
        joinQueue(4, queue);
        joinQueue(1, queue);
        joinQueue(2, queue);
        joinQueue(2, queue);
        joinQueue(1, queue);
        joinQueue(1, queue);

        System.out.println("\n---- Testing full queue ----");

        for (int i = 0; i < 12; i++) {
            joinQueue(2, queue);
        }
        joinQueue(1, queue);

        System.out.println("\n---- Testing Bake First ----");
        bake(8, queue);

        System.out.println("\n---- Testing Bake Second ----");
        queue = new int[20];
        bake(8, queue);
    }

    static void joinQueue(int orderedLoafs, int[] queue) {

        int indexToAdd = -1;

        // check for emty place
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == 0) {
                indexToAdd = i;
                break;
            }
        }

        if (indexToAdd != -1 && orderedLoafs != 1) // there is emty place and loaf is not 1
        {
            queue[indexToAdd] = orderedLoafs;

            System.out.print("Current Queue:");

            for (int i = 0; i < queue.length; i++) {
                if (queue[i] != 0) {
                    System.out.print(" " + queue[i]);
                }
            }
            System.out.println();
        } else if (indexToAdd != -1 && orderedLoafs == 1) // there is emty place and loaf is 1
        {
            int indexForOneLoaf = -1;

            for (int i = 0; i < queue.length - 2; i++)// find the index for 1
            {
                if (queue[i] == 1 && queue[i + 2] != 1) {
                    indexForOneLoaf = i + 2;
                    break;
                }
            }

            int[] temp = new int[queue.length];// temp array for adding

            for (int i = 0; i < queue.length; i++) {
                temp[i] = queue[i];
            }

            if (indexForOneLoaf == -1) // there is no other 1
            {
                temp[1] = 1;

                for (int i = 2; i < queue.length; i++) {
                    temp[i] = queue[i - 1];
                }
            } else // there is another 1
            {
                temp[indexForOneLoaf] = 1;

                for (int i = indexForOneLoaf; i < queue.length - 1; i++) {
                    temp[i + 1] = queue[i];
                }
            }
            for (int i = 0; i < queue.length; i++) {
                queue[i] = temp[i];
            }
            System.out.print("Current Queue:");

            for (int i = 0; i < queue.length; i++) {
                if (queue[i] != 0) {
                    System.out.print(" " + queue[i]);
                }
            }
            System.out.println();
        } else // there is no emty place
        {
            System.out.println("Queue is full. Order rejected.");
        }

    }

    static void bake(int expectedLoaves, int[] queue) {
        int lastReceiveIndex = -1;

        int total = 0;

        for (int i = 0; i < queue.length; i++) {
            total = total + queue[i];

            if (total <= expectedLoaves) {
                lastReceiveIndex = i;
            } else {
                break;
            }
        }

        if (lastReceiveIndex != 19)// check for enough
        {
            System.out.println("Not enough bread. Dismissing customers.");

            for (int i = queue.length - 1; i > lastReceiveIndex; i--) {
                System.out.println("Customer with order " + queue[i] + " loaves dismissed.");
                queue[i] = 0;
            }

            System.out.print("Current Queue:");
            for (int i = 0; i < queue.length; i++) {
                if (queue[i] != 0) {
                    System.out.print(" " + queue[i]);
                }
            }

            System.out.println();
            System.out.println("All customers will receive their bread. ");
        } else {
            System.out.print("Current Queue:");
            for (int i = 0; i < queue.length; i++) {
                if (queue[i] != 0) {
                    System.out.print(" " + queue[i]);
                }
            }
            System.out.println();
        }

    }

}
