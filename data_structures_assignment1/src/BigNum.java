public class BigNum {
    private Link head;
    private Link tail;

    // Constructor to create a BigNum from a string of digits
    // Input: A string of digits representing a large non-negative integer (e.g., "123456789").
    // This method should convert the string into a doubly linked list where each node stores a single digit.
    // The most significant digit will be stored at the head, and the least significant digit will be at the tail.
    public BigNum(String numberStr) {
        // TODO: Implement the string to linked list conversion

        //checking if the number is short
            if(numberStr.length() == 2){
                head = new Link(numberStr.charAt(0));
                tail = new Link(numberStr.charAt(1));
                head.next = tail;
                tail.prev = head;
            }
            else if(numberStr.length() == 1){
                head = new Link(Character.getNumericValue(numberStr.charAt(0)));
                tail = head;
            }else{

                head = new Link(Character.getNumericValue(numberStr.charAt(0)));
                head.next = new Link(Character.getNumericValue(numberStr.charAt(1)));
                Link temp = head.next;
                Link tempPrev = head;
                for(int i=2; i < numberStr.length() ; i++) {
                    if(i == numberStr.length()-1){
                        tail = new Link(Character.getNumericValue(numberStr.charAt(numberStr.length()-1)));
                        tail.prev = temp;
                        temp.next = tail;
                        break;
                    }
                    temp.next = new Link(Character.getNumericValue(numberStr.charAt(i)));
                    temp.prev = tempPrev;
                    tempPrev = temp;
                    temp = temp.next;
                }
        }

    }

    // Default constructor that creates an empty BigNum with no digits.
    public BigNum() { }

    // Adds two BigNum objects and returns the result as a new BigNum
    // Input: Another BigNum object representing a large non-negative integer.
    // This method should add the current BigNum object with the input BigNum digit by digit.
    // It must handle carry-over when the sum of two digits exceeds 9.
    // Output: A new BigNum object representing the sum of the two numbers.
    public BigNum add(BigNum other) {
        // TODO: Implement addition of two BigNum objects
        return null;
    }

    // Multiplies two BigNum objects and returns the result as a new BigNum
    // Input: Another BigNum object representing a large non-negative integer.
    // This method multiplies the current BigNum object with the input BigNum, handling partial products and carries.
    // You need to shift the partial results as required, similar to how manual long multiplication is done.
    // Output: A new BigNum object representing the product of the two numbers.
    public BigNum multiply(BigNum other) {
        // TODO: Implement multiplication of two BigNum objects
        return null;
    }

    // Converts the linked list back to a string representation of the number
    // Output: A string that represents the linked list as a number (e.g., "123456789").
    public String toString() {
        StringBuilder result = new StringBuilder();
        Link current = head;
        while (current != null) {
            result.append(current.digit);
            current = current.next;
        }
        return result.toString();
    }
}
