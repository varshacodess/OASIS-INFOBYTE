import java.util.Scanner;

public class OnlineExamApplication {
    static Scanner sc = new Scanner(System.in);
    static int score = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Quiz Application!");
        System.out.println("You will be alloted 60 seconds to answer each question.\n");
        System.out.println("Question 1: Which tag is used to define a standard cell inside a table?");
        if (askQuestion("A. <button>", "B. <td>", "C. <footer>", "B")) {
            score++;
        }
        System.out.println("\nQuestion 2: What does HTML stands for?");
        if (askQuestion("A. Hyper Text Markup Leveler", "B. Hyper Text Markup Language", "C. Hyper Text Marking Language", "B")) {
            score++;
        }
        System.out.println("\nQuestion 3: Which format specifier is used to print float?");
        if (askQuestion("A. %f", "B. %lf", "C. %Lf", "A")) {
            score++;
        }
        System.out.println("\nQuestion 4: Who discovered Java?");
        if(askQuestion("A.James Gosling","B.Dennis Ritchie","C.Jan Weilemaker", "A")){
            score++;
        }
        System.out.println("\nQuestion 5: What is the cmonnad use to output data to the screen?");
        if(askQuestion("A.Cin<<","B.Cout>>","C.Cout<<", "C")){
            score++;
        }
        System.out.println("\nQuestion 6: Which data structure uses LIFO?");
        if(askQuestion("A.Array","B.Stacks","C.Queues", "B")){
            score++;
        }
        System.out.println("\nQuestion 7: What is FIFO?");
        if(askQuestion("A.First in Few Out","B.Few in Few Out","C.First in first out", "C")){
            score++;
        }
        System.out.println("\nQuestion 8: Which memory location holds a single letter or number?");
        if(askQuestion("A.Double","B.Char","C.Word", "B")){
            score++;
        }
        System.out.println("\nQuestion 9: What are short sections of code written to complete a task?");
        if(askQuestion("A.Buffer","B.Array","C.Function", "C")){
            score++;
        }
        System.out.println("\nQuestion 10: One loop inside another loop is called?");
        if(askQuestion("A.Loop in loop","B.Nested","C.Double loops", "B")){
            score++;
        }
        System.out.println("\nYour final score is: " + score);
    }
    static boolean askQuestion(String option1, String option2, String option3, String correctAnswer) {
        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);
        long startTime = System.currentTimeMillis();
        String answer = sc.nextLine();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        if (answer.equalsIgnoreCase(correctAnswer) && elapsedTime <= 30000) {
            System.out.println("Correct! Time taken: " + elapsedTime / 1000 + " seconds");
            return true;
        } else if (elapsedTime > 30000) {
            System.out.println("Time's up!");
            return false;
        } else {
            System.out.println("Incorrect answer!");
            return false;
        }
    }
}
