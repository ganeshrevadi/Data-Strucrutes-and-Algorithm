public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(ptr == DEFAULT_SIZE - 1){
            System.out.println("Stack is FUll");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;

    }

    public int pop() throws Exception{
        if(ptr == -1){
            throw new Exception("Stack is Empty");
        }
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(ptr == -1){
            throw new Exception("Stack is Empty");
        }
        return data[ptr];
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(10);
        stack.push(10);

        System.out.println(stack.pop());
        System.out.println("Done!!");

    }
}
