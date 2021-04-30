public class RingBuffer {
/* Gunerli, Hakan
I did not cheat during this assignment.  */




    public static void main(String[] args){
        RingBuffer circularBuffer = new RingBuffer(5); // i am making it size 5 since i need to prove that it is in fact full when i have 5 values. 
        circularBuffer.bufferEnqueue(1); // add from front to back. 
        circularBuffer.bufferEnqueue(2);// add from front to back. 
        circularBuffer.bufferEnqueue(3);// add from front to back. 
        circularBuffer.bufferEnqueue(4);// add from front to back. 
        circularBuffer.printBuffer(); // print the circular queue. 
        System.out.println("deleted value: " + circularBuffer.deque());
        System.out.println("deleted value: " + circularBuffer.deque());
        circularBuffer.printBuffer(); 
        circularBuffer.bufferEnqueue(9); // after i deleted values i'm adding these to prove that the buffer is full
        circularBuffer.bufferEnqueue(20);
        circularBuffer.bufferEnqueue(5);
        circularBuffer.printBuffer(); // print the buffer results. 
        circularBuffer.bufferEnqueue(13); // to prove that the buffer is full. 
    }

// variables. 

static int bufferArray[];
private static int front, rear; // declare the queue variables front and last, 
private static int length, size; // we'll use these for the classes to refer to their sizes. 

    
    public void bufferEnqueue(int element){
        if(size == length){ // if the amount of elemnent i have is the length of the queue, then the buffer is full. 
            System.out.println("This buffer is full.");
        }else{ // if not, enqueue the element and increase the size int. 
            rear = (rear + 1) % length;
            bufferArray[rear] = element;
            size += 1;
            if(front == -1){ // this is to check if it empty. we also have an empty checker in deque. 
                front = rear;
            }
        }
    }
    public void fill(){  // iterate through the buffer. placeholder, not counted. 
        for(int i = 0; i < bufferArray.length; i++){
            bufferArray[i] = -1;
        }
    }
    public int deque(){
        int temp = 0;
        if(front == -1){ // once again, a buffer empty checker. 
            System.out.println("This buffer is empty.");
        }else{
            temp = bufferArray[front]; 
            if(front == rear){ // this is in case we have one element in the queue. 
                front = -1;
                rear = -1;
                bufferArray[0] = -1;
            }else if(front == length - 1){  // comes from the instructions, Check if (front==rear) if it is true then set front=rear= -1 else check if (front==size-1), if it is true then set front=0 and return the element.
                front = 0;  
            }else{
                for(int i = 0; i < bufferArray.length -1; i++){                     
                    bufferArray[i] = bufferArray[i+1];
                }
            }
            bufferArray[length-1] = -1;
            size -= 1;
            rear -= 1;
        }
        return temp; // return the element in which we dequed. as mentioned at the quetsion. 
    }
    public void printBuffer(){
        if(front == -1){
            System.out.println("This buffer is empty."); // if it is empty, just say it is empty. 
        }else{
            System.out.print("The elements in this buffer are: "); 
            for(int i = front; i <= rear; i++){ //iterate through each value within the buffer. 
                System.out.print(bufferArray[i] + " "); // print each element. 
            }
            System.out.println();
        }
    }


    public RingBuffer(int length){
        bufferArray = new int[length]; // i'm using an array, not an arraylist. 
        this.length = length; // this refers to the int i've created in the beginning. 
        fill();    
        rear = -1; 
        front = -1;
        size = 0;
    }


    
}

/* time and space complexity:
time: O(n), Linear complexity. No iteration loop for deque or enqueue. 
space: O(n), Linear complexity. No iteration loop for deque or enqueue */