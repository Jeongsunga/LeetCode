public class MyQueue {

    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void push(int x) { // Stack의 맨 아래로 들어가야

        while(!inputStack.isEmpty()){  // step1. 기존 스택의 데이터를 임시스택으로 옮김
            outputStack.push(inputStack.pop());
        }

        inputStack.push(x); //step2. 마지막 데이터를 가장 나중에 나갈 수 있게 제일 안쪽에 넣음

        while(!outputStack.isEmpty()){ // step3 다시 임시 스택에서 데이터를 가져옴
            inputStack.push(outputStack.pop());
        }

    }

    public int pop() {
        return inputStack.pop();
    }

    public int peek() {
        return inputStack.peek();
    }

    public boolean empty() {
        return inputStack.isEmpty();
    }
}