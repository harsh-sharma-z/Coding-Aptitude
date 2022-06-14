/*
This programs removes the adjacent elements of a stack if its next element is similar to it.
 */
package DSA.College.CodingAptitude;

import java.io.*;
import java.util.*;

public class removeAdjStack {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);

        Queue<Integer> q=new LinkedList<Integer>();
        int l,k;
        l=sc.nextInt();
        k=sc.nextInt();
        int j;
        for (int i = 0; i < l; i++) {
            j=sc.nextInt();
            q.add(j);

        }

        Stack<Integer> st=new Stack<Integer>();

        for (int i = 0; i < k; i++) {

            st.push(q.peek());
            q.remove();

        }
        for (int i = 0; i < k; i++) {
            q.add(st.pop());

        }

        for (int i = 0; i < l-k; i++) {

            q.add(q.peek());
            q.remove();

        }

        for (int i = 0; i < l; i++) {

            System.out.print(q.remove()+" ");

        }


    }
}
