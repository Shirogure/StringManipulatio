package manipulation.string;

import java.util.Scanner;

public class StringUtil {

    public static void main(String[] args) {

        Scanner textIn = new Scanner(System.in);
        System.out.print("Input your age: ");
        int age = textIn.nextInt();
        System.out.print("Input your name: ");
        String name = textIn.next();

        System.out.printf("Your name: %s \nYour age: %d\n", name, age);
        textIn.close();

        //2

        String source = "Hello Endava! How many words are there?";
        String[] word = source.split(" ");
        System.out.println(word.length);
        StringBuilder recoverSource = new StringBuilder();

        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
            char[] letters = word[i].toCharArray();
            recoverSource.append(" ");

            for (int j = 0; j < letters.length; j++) {
                System.out.println(letters[j]);
                recoverSource.append(letters[j]);

               /* if (recoverSource.length == word[i].length()){
                    recoverSource = recoverSource.append(" ");
                }*/
                System.out.println(recoverSource + " - (this is recoversource)");
            }
        }
    }
}