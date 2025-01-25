import java.util.Scanner;

public class FALL_23_MID_SOLUTION_TESTER {
    public static void main(String[] args) {
        System.out.println("Enter any number between 2,4 and 5 to check the answers.\nTo run all tasks just press enter");
        System.out.print("Which Task do you wanna check: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        if( input.equals("1") || input.equals("") ) task1();
        if( input.equals("2") || input.equals("") ) task2();
        if( input.equals("3") || input.equals("") ) task03();
    }
    static void task1(){
        Integer[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {1, 3, 5, 2},
            {-2, 0, 6, -3}
        };
        
        Arr.print2D(matrix);
        System.out.println("...............");

        Integer[][] returnedArray = FALL_23_MID_SOLUTIONS.compressMatrix(matrix);
        Arr.print2D(returnedArray);
        donePrint("Question 01");
    }
    static void task2(){
        System.out.println("==============Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{10, 15, 34, 41});
        Node head2 = LinkedList.createList(new Integer[]{15, 10, 34, 41});
        LinkedList.printLL(head1);
        LinkedList.printLL(head2);
        boolean returnedValue = FALL_23_MID_SOLUTIONS.pairWiseEqual(head1, head2);
        System.out.println(returnedValue);
        assertTest(returnedValue, true, "Question 02 -- 01");
        System.out.println("==============Test Case 2=============");
        head1 = LinkedList.createList(new Integer[]{10, 15, 34, 42});
        head2 = LinkedList.createList(new Integer[]{15, 10, 34, 41});
        LinkedList.printLL(head1);
        LinkedList.printLL(head2);
        returnedValue = FALL_23_MID_SOLUTIONS.pairWiseEqual(head1, head2);
        System.out.println(returnedValue);
        assertTest(returnedValue, false, "Question 02 -- 02");
    }
    static void task03(){
        System.out.println("Test 01");
        Stack st = new Stack();
        st.push(10);
        st.push(10);
        st.push(20);
        st.push(20);
        st.push(30);
        st.push(10);
        st.push(50);

        System.out.println("Stack:");
        printStack(st);
        System.out.println("------");

        Stack reversedStack = FALL_23_MID_SOLUTIONS.conditionalReverse(st);

        System.out.println("Conditional Reversed Stack:");
        printStack(reversedStack); // Expected: 50, 10, 30, 20, 10
        System.out.println("------");

        donePrint("Question 03");
    }
    public static void printStack(Stack stack) {
        if (stack.isEmpty()) {
            return;
        }
        int elem = stack.pop();
        System.out.println("| " + elem + " |");
        printStack(stack);
        stack.push(elem);
    }
    public static void assertTest(boolean actual, boolean expected, String str) {
        if (actual == expected) {
            successPrint(str);
        } else {
            failedPrint(str);
        }
    }
    public static void assertTest(double actual, double expected, String str) {
        if (actual == expected) {
            successPrint(str);
        } else {
            failedPrint(str);
        }
    }
    public static void assertTest(int actual, int expected, String mazid) {
        if (actual == expected) {
            successPrint(mazid);
        } else {
            failedPrint(mazid);
        }
    }
    public static void assertTest(String actual, String expected, String str) {
        if (actual.equals(expected)) {
            successPrint(str);
        } else {
            failedPrint(str);
        }
    }
    private static void taskPrint(String task){
        System.out.println(taskFormat+task+endFormat);
    }
    static final String green = "\u001B[32m", red = "\u001B[31m", white = "\u001B[37m", cyan = "\033[0;96m";
    static final String bold="\u001B[1m", underline = "\u001B[4m", normal = "\033[0;0m";
    
    static String taskFormat = cyan;
    static String sucsFormat = "\n"+green+bold+underline;
    static String failFormat = "\n"+red+bold+underline;
    static String endFormat = normal+white;
    private static void successPrint(String task){
        System.out.println(sucsFormat+"    "+task+" Success!! Output Matched!!!     "+endFormat);
}

    private static void failedPrint(String task){
        System.out.println(failFormat+"    "+task+" Failed!! Output didn't Match!!!   "+endFormat);
    }
    private static void donePrint(String task){
        System.out.println(sucsFormat+"    "+task+" Success!! Output Printed!!!     "+endFormat);
}
}
