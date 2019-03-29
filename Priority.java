import java.util.PriorityQueue;
import java.util.Scanner;

class Priority {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Taking total number of events as input
        int n = Integer.parseInt(sc.nextLine());
        /*
         * Creating Instance of PriorityQueue class of type Data class with capacity n
         * and a DataComparator instance as its parameters
         */
        PriorityQueue<Data> pQueue = new PriorityQueue<Data>(n, new DataComparator());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] input = s.split(" ");
            if (input[0].equals("ENTER")) {
                // Instantiating the Data class Constructor with student name, CGPA, token
                Data dt = new Data(input[1], Float.parseFloat(input[2]), Integer.parseInt(input[3]));
                // Adding the details of student given by user
                pQueue.add(dt);
            } else if (input[0].equals("SERVED")) {
                // Removing the details of the student which has been served already
                pQueue.poll();
            }
        }
        // To check weather the queue is empty or not
        if (!pQueue.isEmpty()) {
            // Printing name of students which were unserved
            while (!pQueue.isEmpty()) {
                System.out.println(pQueue.poll().name);
            }
        } else
            System.out.println("EMPTY");
        sc.close();
    }
}