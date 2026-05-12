package org.example;

public class HapusDLL_2511532021{
      public static NodeDLL_2511532021 delHead_2021(NodeDLL_2511532021 head_2021){
            if (head_2021 == null){
                  return null;
            }
            NodeDLL_2511532021 temp_2021 = head_2021;
            head_2021 = head_2021.next_2021;
            if (head_2021 != null){
                  head_2021.prev_2021 = null;
            }
            return head_2021;
      }

      public static NodeDLL_2511532021 delLast(NodeDLL_2511532021 head_2021){
            if (head_2021 == null){
                  return null;
            }
            if (head_2021.next_2021 == null){
                  return null;
            }

            NodeDLL_2511532021 curr_2021 = head_2021;

            while (curr_2021.next_2021 != null){
                  curr_2021 = curr_2021.next_2021;
            }

            if(curr_2021.prev_2021 != null){
                  curr_2021.prev_2021.next_2021 = null;
            }
            return head_2021;
      }

      public static NodeDLL_2511532021 delPost(NodeDLL_2511532021 head_2021, int pos_2021){
            if(head_2021 == null){
                  return head_2021;
            }
            NodeDLL_2511532021 curr_2021 = head_2021;

            for (int i = 1; curr_2021 != null && i < pos_2021; ++i){
                  curr_2021 = curr_2021.next_2021;
            }
            if(curr_2021 == null){
                  return head_2021;
            }

            if (curr_2021.prev_2021 != null){
                  curr_2021.prev_2021.next_2021 = curr_2021.next_2021;
            }

            if (curr_2021.next_2021 != null){
                  curr_2021.next_2021.prev_2021 = curr_2021.prev_2021;
            }

            if(head_2021 == curr_2021){
                  head_2021 = curr_2021.next_2021;
            }
            return head_2021;
      }

      public static void printList(NodeDLL_2511532021 head_2021) {
            NodeDLL_2511532021 curr_2021 = head_2021;
            while(curr_2021 != null){
                  System.out.print(curr_2021.data_2021 + " <-> ");
                  curr_2021 = curr_2021.next_2021;
            }
            System.out.println();
            
      }

      public static void main(String[] args) {
            NodeDLL_2511532021 head_2021 = new NodeDLL_2511532021(1);
            head_2021.next_2021 = new NodeDLL_2511532021(2);
            head_2021.next_2021.prev_2021 = head_2021;
            head_2021.next_2021.next_2021 = new NodeDLL_2511532021(3);
            head_2021.next_2021.next_2021.prev_2021 = head_2021.next_2021;
            head_2021.next_2021.next_2021.next_2021 = new NodeDLL_2511532021(4);
            head_2021.next_2021.next_2021.next_2021.prev_2021 = head_2021.next_2021.next_2021;
            head_2021.next_2021.next_2021.next_2021.next_2021 =new NodeDLL_2511532021(5);
            head_2021.next_2021.next_2021.next_2021.next_2021.prev_2021 = head_2021.next_2021.next_2021.next_2021;

            System.out.print("DLL awal : ");
            printList(head_2021);

            System.out.println("Setelah head dihapus : ");
            head_2021 = delHead_2021(head_2021);
            printList(head_2021);

            System.out.print("setelah node terakhir dihapus: ");
            head_2021 = delLast(head_2021);
            printList(head_2021);


            System.out.print("menghapus node ke 2:  ");
            head_2021 = delPost(head_2021,2);
            printList(head_2021);
      }
}
