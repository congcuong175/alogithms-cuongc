public class Bai24Queue {
    class Node {
        public Node next;
        public int info;
    }

    class Queue {
        Node phead, ptail;

        //tao hang doi rong
        public Queue() {
            phead = ptail = null;
        }

        //kiem tra hang doi rong
        boolean Empty() {
            return phead == null;
        }

        //them 1 phan tu vao cuoi hang doi
        public void EnQueue(int x) {
            Node p = new Node();
            p.info = x;
            p.next = null;
            if (phead == null) {
                phead = ptail = p;
            } else {
                ptail.next = p;
                ptail = p;
            }
        }

        //loai bo phan tu o dau hang doi
        public int DeQueue() {
            if (Empty() == true) {
                return 0;
            } else {
                int x = phead.info;
                phead = phead.next;
                if (phead == null) {
                    ptail = null;
                }
                return x;
            }
        }

        //xem thong tin phan tu dau hang doi
        public int Front() {
            if (Empty()) {

            }
            return phead.info;
        }

    }
}
