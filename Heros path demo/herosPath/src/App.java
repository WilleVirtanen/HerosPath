import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
public class App {
    //komentarer
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        String name;
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        int playerChoice;
        int playerHealth=10;
        boolean combatOngoing=true;
        int skeletonHealth=4;
        String anybutton;
        File file =new File("Broken Drum Machine - Godmode.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();


        System.out.println("  ___ ___                                            __  .__     ");
        System.out.println(" /   |   \\   ___________  ____  ______ ___________ _/  |_|  |__  ");
        System.out.println("/    ~    \\_/ __ \\_  __ \\/  _ \\/  ___/ \\____ \\__  \\\\   __\\  |  \\ ");
        System.out.println("\\    Y    /\\  ___/|  | \\(  <_> )___ \\  |  |_> > __ \\|  | |   Y  \\");
        System.out.println(" \\___|_  /  \\___  >__|   \\____/____  > |   __(____  /__| |___|  /");
        System.out.println("       \\/       \\/                 \\/  |__|       \\/          \\/ ");
        System.out.println();
        System.out.println("By: Wolf light studios");

        System.out.println();
        System.out.println();
        System.out.println("Hello brave adventurer! what would your name be!");
        name=scan.next();
        System.out.println("Ah "+name+" so you have come to save us all!, well good luck to you! The world is dark and full of terrors!");
       
       
        System.out.println("    .                  .-.    .  _   *     _   .");
        System.out.println("           *          /   \\     ((       _/ \\       *    .");
        System.out.println("         _    .   .--'/\\_ \\     `      /    \\  *    ___");
        System.out.println("     *  / \\_    _/ ^      \\/\\'__        /\\/\\  /\\  __/   \\ *");
        System.out.println("       /    \\  /    .'   _/  /  \\  *' /    \\/  \\/ .`'\\_\\/\\   .");
        System.out.println("  .   /\\/\\  /\\/ :' __  ^/  ^/    `--./.'  ^  `-.\\ _    _:\\ _");
        System.out.println("     /    \\/  \\  _/  \\-' __/.' ^ _   \\_   .'\\   _/ \\ .  __/ \\");
        System.out.println("   /\\  .-   `. \\/     \\ / -.   _/ \\ -. `_   .\\   _/ \\ .  __/ \\");
        System.out.println("  /  `-.__ ^   / .-'.--'    . /    `--./ .-'  `-.  `-. `.  -  `.");
        System.out.println(" /        `.  / /      `-.   /  .-'   / .   .'   \\    \\  \\  .-  \\ ");
           
        System.out.println("You find yourself in the cold mountains in the middle of the night! what path shall you take?");
        System.out.println("1:would you like to climb the mountain(its slippry and you need to be strong!)");
        System.out.println("2:would you like to go under the mountain into the caverns(fear the balrog!)");
        System.out.println("3:would you like to go to the tavern and have a nice beer?(its cozy and warm!)");
        playerChoice=scan.nextInt();
       
        if(playerChoice==1)
        {
            System.out.println("           .---.");
            System.out.println("           '-.  |   |  .-'         ");
            System.out.println("             ___|   |___          ");
            System.out.println("        -=  [           ]  =-    ");    
            System.out.println("            `---.   .---'         ");
            System.out.println("                |   |             ");
            System.out.println("                |   |          ");
            System.out.println("                |   |          ");
            System.out.println("             _.-|   |-,_       ");
            System.out.println("         .-\"`   `\"`'`   \"-.   ");
            System.out.println("       .'                   '.");
            System.out.println();
            System.out.println("Sadly you where unprepared and froze to death! but the kind yetis buried your popsicle of a corps!");
            System.out.println("This is the end of the demo");
        }
        else if (playerChoice==2)
        {
        System.out.println("                              _.--\"\"-._");
        System.out.println("  .                         .\"         \".");
        System.out.println(" / \\    ,^.         /(     Y             |      )\\");
        System.out.println("/   `---. |--'\\    (  \\__..'--   -   -- -'\"\"-.-'  )");
        System.out.println("|        :|    `>   '.     l_..-------.._l      .'");
        System.out.println("|      __l;__ .'      \"-.__.||_.-'v'-._||`\"----\"");
        System.out.println(" \\  .-' | |  `              l._       _.'");
        System.out.println("  \\/    | |                   l`^^'^^'j");
        System.out.println("        | |                _   \\_____/     _");
        System.out.println("        j |               l `--__)-'(__.--' |");
        System.out.println("        | |               | /`---``-----'\"1 |  ,-----.");
        System.out.println("        | |               )/  `--' '---'   \\'-'  ___  `-.");
        System.out.println("        | |              //  `-'  '`----'  /  ,-'   I`.  \\");
        System.out.println("      _ L |_            //  `-.-.'`-----' /  /  |   |  `. \\");
        System.out.println("     '._' / \\         _/(   `/   )- ---' ;  /__.J   L.__.\\ :");
        System.out.println("      `._;/7(-.......'  /        ) (     |  |            | |");
        System.out.println("      `._;l _'--------_/        )-'/     :  |___.    _._./ ;");
        System.out.println("        | |                 .__ )-'\\  __  \\  \\  I   1   / /");
        System.out.println("        `-'                /   `-\\-(-'   \\ \\  `.|   | ,' /");
        System.out.println("                           \\__  `-'    __/  `-. `---'',-'");
        System.out.println("                              )-._.-- (        `-----'");
        System.out.println("                             )(  l\\ o ('..-.");
        System.out.println("                       _..--' _'-' '--'.-. |");
        System.out.println("                __,,-'' _,,-''            \\ \\");
        System.out.println("               f'. _,,-'                   \\ \\");
        System.out.println("              ()--  |                       \\ \\");
        System.out.println("                \\ .  |                       /  \\");
        System.out.println("                  \\ \\                      |._  |");
        System.out.println("                   \\ \\                     |  ()|");
        System.out.println("                    \\ \\                     \\  /");
        System.out.println("                     ) `-.                   | |");
        System.out.println("                    // .__)                  | |");
        System.out.println("                 _.//7'                      | |");
        System.out.println("               '---'                         j_| `");
        System.out.println("                                            (| |");
        System.out.println("                                             |  \\");
        System.out.println("                                             |lllj");
        System.out.println("                                             ||||| ");
        System.out.println();
        System.out.println("The balrog was not home! but in the dark and dank caverns you hear rustle of bone and metal draging on the ground! prepeare for combat!");

        System.out.println("You have a choice! 1:fight or 2:run!");
        playerChoice=scan.nextInt();
            if(playerChoice==1)
            {
                while(combatOngoing==true)
                {
                    System.out.println("Your health: ");
                    for(int i=1; i<=playerHealth; i++)
                    {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.println("foe health: ");
                    for(int i=1; i<=skeletonHealth; i++)
                    {
                        System.out.print("|");
                    }
                    System.out.println();
                    System.out.println("to attack press any button!");
                    anybutton=scan.next();
                    System.out.println("                     ._.");
                    System.out.println("______   ______  _  _| |");
                    System.out.println("\\____ \\ /  _ \\ \\/ \\/ / |");
                    System.out.println("|  |_> >  <_> )/ \\     |");
                    System.out.println("|   __/ \\____/ \\/\\_/__|");
                    System.out.println("|__|                  \\/");
                    playerHealth--;
                    skeletonHealth--;
                    if(skeletonHealth<=0)
                    {
                        System.out.println("          A");
                        System.out.println("         /!\\");
                        System.out.println("        / ! \\");
                        System.out.println(" /\\     )___(");
                        System.out.println("(  `.____(_)_________");
                        System.out.println("|           __..--\"\"");
                        System.out.println("(       _.-|");
                        System.out.println(" \\    ,' | |");
                        System.out.println("  \\  /   | |");
                        System.out.println("   \\(    | |");
                        System.out.println("    `    | |");
                        System.out.println("         | |");
                        System.out.println("         | |");
                        System.out.println("         | |");
                        System.out.println("         | |");
                        System.out.println("         | |");
                        System.out.println("         | |");
                        System.out.println("         | |");
                        System.out.println("         | |");
                        System.out.println("         |_|");
                        System.out.println("You have defeated the dreaded skeleton warrior of myth! you have retreived his magical ax!(+2 damage and iron typ)");
                        System.out.println("This is the end of the demo");
                        combatOngoing=false;
                    }

                }
            }
            else if(playerChoice==2)
            {
            System.out.println("You ran all the way to the tavern! you chicken!");
            System.out.println(".~~~~.");
            System.out.println("i====i_");
            System.out.println("|cccc|_)");
            System.out.println("|cccc|   ");
            System.out.println("`-==-'");
            System.out.println("ah a refreshing beer! lets drink and then go to bed!");
            System.out.println("This is the end of the demo");
            }


        }
        else if(playerChoice==3)
        {
            System.out.println(".~~~~.");
            System.out.println("i====i_");
            System.out.println("|cccc|_)");
            System.out.println("|cccc|   ");
            System.out.println("`-==-'");
            System.out.println("ah a refreshing beer! lets drink and then go to bed!");
            System.out.println("This is the end of the demo");
        }

    }
}
