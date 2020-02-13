
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String userInput = scanner.nextLine();
       System.out.print("Enter Something: ");
            if(StringUtils.isNumeric(userInput)) {
                System.out.println("\"" + userInput + "\"" + " is a number");
            } else {
                System.out.println("\"" + userInput + "\"" + " is not a number");
            }
            System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
            System.out.println("Reversed: " + StringUtils.reverse(userInput));
        }
    }