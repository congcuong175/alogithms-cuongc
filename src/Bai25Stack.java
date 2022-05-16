public class Bai25Stack {
    class Node
    {
        public int info;
        public Node next;
    }
    class Stack
    {
        public Node phead;
        public Stack()
        {
            phead = null;
        }
        public boolean isEmpty()
        {
            return phead == null;
        }
        public void Push(int x)
        {
            Node p = new Node();
            p.info = x;
            p.next = phead;
            phead = p;
        }
        public int Pop()
        {
            Node p = phead;
            int x;
            if (phead == null)
            {
                return 0;
            }
            else
            {
                x = phead.info; // lay thong tin nut dau
                phead = phead.next; // xoas nut dau
            }

            return x; //tra ve gia tri nut dau
        }
        public int Top()
        {
            Node p = phead;
            int x;
            if (phead == null)
            {
                return 0;
            }
            else
            {
                x = phead.info;
            }
            return x;
        }

    }
}
