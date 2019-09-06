import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        String go, look, open, eat, yes, no, cabinet, turn, take, walk;
        String upstairs, kitchen, patio, livingRoom, basement;
        String refrigerator, cabinet, bedroom, bathroom, pool, shed, Tv, couch, lights, dark;

        System.out.println("WELCOME TO MERIAN'S TINY ADVENTURE!");
        System.out.println(" ");
        System.out.println("You are in a creepy house! Would you like to go 'upstairs' or into the 'kitchen'?");
        System.out.println(">");
        go = key.next();


        if (go == ("kitchen")) {
            System.out.println("There is a long counterTop with dirty dishes everywhere. Off to one side there's a refrigerator. " +
                    "You may open the 'refrigerator' or look in a 'cabinet'.");
        }
        System.out.println(">");
        open = key.next();

            if (open == ("refrigerator")) {
            System.out.println("Inside the refrigerator you see 'strangeMilk' and 'leftOvers'. It looks pretty nasty. " +
                    "Would you like to eat some of the food? ('yes' or 'no')");
        }

            System.out.println(">");
            eat = key.next();

                if (eat == ("no")) {
                System.out.println("You collapse from starvation....eventually");
        }           else if (eat == ("yes")) {
                    System.out.println("You live");

        }   else if (open == ("cabinet")) {
            System.out.println("You find a can of expired beans and a dirty plate. " +
                    "Would you like to eat the beans on the plate? ('yes' or 'no') ");


                if (eat == ("no")) {
                System.out.println("You survive food poisoning ");
            }
                    else if (eat == ("yes")) {
                    System.out.println("You collapse from food poisoning");
            }

        }else if (go == ("upstairs")) {
            System.out.println("upstairs you see a hallway. At the end of the hallway is the master 'bedroom'." +
                    "There's also a 'bathroom' off the hallway. Where would you like to 'go'?");


        }
        System.out.println(">");
        go = key.next();

            if (go == ("bedroom")) {
            System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture." +
                    "The bed is unmade. In the back of the room, the closet door is ajar." +
                    "Would you like to open the door? ('yes' or 'no')");
        }

            System.out.println(">");
            open = key.next();

                if (open == ("no")) {
                System.out.println("Then we'll never know what was in there");
        }           else if (open == ("yes")) {
                    System.out.println("You find a treasure chest");
        }
        System.out.println(">");
        go = key.next();

           else if(go == ("bathroom")){
           System.out.println("You find a rusty mirror and a clean toilet. A medicine cabinet is attached to " +
                    "the mirror and the toilet is covered. Would you like to open the medicine cabinet? ('yes' or 'no'");
        }
            System.out.println(">");
            open = key.next();
                if (open == ("no"){
                System.out.println("You are a coward");
                    else if(open == ("yes"))
                    System.out.println("You find a key to a treasure chest");

                }
    }



}
