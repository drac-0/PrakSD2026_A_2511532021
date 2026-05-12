package org.example;

public class PenulusuranDLL_2511532021{
      static void forwardTraversal_2021(NodeDLL_2511532021 head_2021){
            NodeDLL_2511532021 curr_2021 = head_2021;

            while(curr_2021 != null){
                  System.out.print(curr_2021.data_2021 + " <-> ");
                  curr_2021 = curr_2021.next_2021;
            }

            System.out.println();
      }

      static void backwardTraversal_2021(NodeDLL_2511532021 tail_2021){
            NodeDLL_2511532021 curr_2021 = tail_2021;

            while(curr_2021 != null){
                  System.out.print(curr_2021.data_2021 + " <-> ");
                  curr_2021 = curr_2021.prev_2021;
            }

            System.out.println();
      }

      public static void main(String[] args){
            NodeDLL_2511532021 head_2021 = new NodeDLL_2511532021(1);

            NodeDLL_2511532021 second_2021= new NodeDLL_2511532021(2);
            NodeDLL_2511532021 third_2021= new NodeDLL_2511532021(3);
            
            head_2021.next_2021 = second_2021;
            second_2021.prev_2021 = head_2021;
            second_2021.next_2021 = third_2021;
            third_2021.prev_2021 = second_2021;

            System.out.println("Penulusuran Maju: ");
            forwardTraversal_2021(head_2021);

            System.out.println("Penulusuran Mundur: ");
            backwardTraversal_2021(third_2021);
      }
}
