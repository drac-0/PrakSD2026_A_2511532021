package org.example;

public class InsertDLL_2511532021 {

    public static NodeDLL_2511532021 InsertBegin(NodeDLL_2511532021 head_2021, int data_2021) {
        NodeDLL_2511532021 new_node_2021 = new NodeDLL_2511532021(data_2021);
        new_node_2021.next_2021 = head_2021;
        if (head_2021 != null) {
            head_2021.prev_2021 = new_node_2021;
        }
        return new_node_2021;
    }

    public static NodeDLL_2511532021 InsertEnd(NodeDLL_2511532021 head_2021, int newData_2021) {
        NodeDLL_2511532021 newNode_2021 = new NodeDLL_2511532021(newData_2021);

        if (head_2021 == null) {
            return newNode_2021;
        } else {
            NodeDLL_2511532021 curr_2021 = head_2021;
            while (curr_2021.next_2021 != null) {
                curr_2021 = curr_2021.next_2021;  
            }
            curr_2021.next_2021 = newNode_2021;
            newNode_2021.prev_2021 = curr_2021;
        }
        return head_2021;
    }

    public static NodeDLL_2511532021 insertAtPosition(NodeDLL_2511532021 head_2021, int pos_2021, int new_data_2021){
          NodeDLL_2511532021 new_node_2021 = new NodeDLL_2511532021(new_data_2021);
          if (pos_2021 == 1){
                new_node_2021.next_2021 = head_2021;
                if (head_2021 != null){
                      head_2021.prev_2021 = new_node_2021;
                }
                head_2021 = new_node_2021;
                return head_2021;
          }

          NodeDLL_2511532021 curr_2021 = head_2021;

          for (int i = 1; i < pos_2021 -1 && curr_2021 != null; i++){
                curr_2021 = curr_2021.next_2021;
          }
          if (curr_2021 == null){
                System.out.println("Posisi tidak ada");
                return head_2021;
          }
          new_node_2021.prev_2021 = curr_2021;
          new_node_2021.next_2021 = curr_2021.next_2021;
          curr_2021.next_2021 = new_node_2021;
          if(new_node_2021.next_2021 != null){
                new_node_2021.next_2021.prev_2021 = new_node_2021;
          }
          return head_2021;
    }

    public static void printlist(NodeDLL_2511532021 head_2021){
          NodeDLL_2511532021 curr_2021 = head_2021;
          while (curr_2021 != null){
                System.out.print(curr_2021.data_2021 + " <-> ");
                curr_2021 = curr_2021.next_2021;
          }
          System.out.println();
    }

    public static void main(String[] args){
          NodeDLL_2511532021 head_2021 = new NodeDLL_2511532021(2);
          head_2021.next_2021 = new NodeDLL_2511532021(3);
          head_2021.next_2021.prev_2021 = head_2021;
          head_2021.next_2021.next_2021 = new NodeDLL_2511532021(5);
          head_2021.next_2021.next_2021.prev_2021 = head_2021.next_2021;

          System.out.print("DLL Awal: ");
          printlist(head_2021);

          head_2021 = InsertBegin(head_2021,1);
          System.out.print(
                      "simpul 1 ditambah di awal: "
                      );
          printlist(head_2021);

          System.out.print(
                      "simpul 6 ditambah di akhir: "
                      );
          
          int data_2021 = 6;
          head_2021 = InsertEnd(head_2021, data_2021);
          printlist(head_2021);

          System.out.print("Tambah node 4 di posisi 4: ");
          int data2_2021 = 4;
          int pos_2021 = 4;

          head_2021 = insertAtPosition(head_2021, pos_2021, data2_2021);
          printlist(head_2021);
    }
}
