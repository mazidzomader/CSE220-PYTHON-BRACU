import java.util.Arrays;
public class FALL_23_MID_SOLUTIONS {
    // Question 01
    public static Integer[][] compressMatrix(Integer[][] mat) {
        int newRows = mat.length / 2;
        int newCols = mat[0].length / 2;
        Integer[][] newArr = new Integer[newRows][newCols];
        int x = 0, y;
        for (Integer[] p: newArr){
            Arrays.fill(p, 0);
        }
        for (int index = 0; index < mat.length; index += 2) {
            y = 0;
            for (int index1 = 0; index1 < mat[0].length; index1 += 2) {
                newArr[x][y] += mat[index][index1] + mat[index][index1 + 1] + 
                                mat[index + 1][index1] + mat[index + 1][index1 + 1];
                y++;
            }
            x++;
        }
        return newArr;
    }

    // Question 02
    private static int calcLen(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            count +=1;
        }
        return count;
    }
    public static boolean pairWiseEqual(Node h1, Node h2) {
        if ((calcLen(h1) != calcLen(h2)) || calcLen(h1) % 2 != 0 || calcLen(h2) % 2 != 0) {
            return false;
        } 
        else {
            Node t1 = h1;
            Node t2 = h2;
            int a = calcLen(h1);
            for (int i = 0; i < a; i += 2) {
                int x = (int) t1.elem;
                int y = (int) t1.next.elem;
                int p = (int) t2.elem;
                int q = (int) t2.next.elem;
                if (x + y != p + q) {
                    return false;
                }
                t1 = t1.next.next;
                t2 = t2.next.next;
            }
            return true;
        }
    }
    // Question 03
    public static Stack conditionalReverse(Stack stack) {
        Stack reversed = new Stack();
        while(!stack.isEmpty()) {
            if (!stack.peek().equals(reversed.peek())) {
                reversed.push(stack.peek());
            }
            stack.pop();
        }
        return reversed;
    }
}
