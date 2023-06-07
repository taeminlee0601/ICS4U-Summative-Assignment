import java.util.ArrayList;
import java.util.Scanner;
public class App
{

    public static void main(String[]args)
    {
        Stats yogStat = new Stats(900,100,50,150);
        Stats cthulhuStat = new Stats(1000,90,70,140);
        Stats azathothStat = new Stats(1500,110,40,170);

        Stats rickStat = new Stats(750,60,90,100);
        Stats derpStat = new Stats(650,100,110,80);
        Stats godzillaStat = new Stats(950, 100, 100, 130);

        Stats odinStat = new Stats(900,80,70,50);
        Stats lokiStat = new Stats(800, 90, 80,60);
        Stats thorStat = new Stats(850,100,85,40);

        Stats anubisStat = new Stats (750,130,95,80);
        Stats raStat = new Stats (650,120,105,70);
        Stats horusStat = new Stats (700,115,100,85);

        Stats zeusStat = new Stats (900,90,115,100);
        Stats posidionStat = new Stats (1000,85,95,95);
        Stats hadesStat = new Stats (850,100,120,90);

        Move yogMove1= new Move("Eldritch Grasp",150,80);
        Move yogMove2 = new Move("Unfathomable Presence",180,60);
        Move yogMove3 = new Move("Chaos Rift",120,100);

        ArrayList<Move> yogMoveset = Move.addMoveToMoveset(yogMove1,yogMove2, yogMove3);

        Move cthulhuMove1 = new Move("Abyssal Awakening", 130, 100);
        Move cthulhuMove2 = new Move("Call of the Deep");
        Move cthulhuMove3 = new Move("R’lyehian Resurgence");
        
        ArrayList<Move> cthMoveset = Move.addMoveToMoveset(cthulhuMove1,cthulhuMove2, cthulhuMove3);

        Move azathothMove1 = new Move("Nihilistic Pulse",260,20);
        Move azathothMove2 = new Move("Slumbering Malevolence",140, 70);
        Move azathothMove3 = new Move("h' zhro geb",1);

        ArrayList<Move> azaMoveset = Move.addMoveToMoveset(azathothMove1,azathothMove2, azathothMove3);

        Move rickMove1 = new Move("Rickroll Surprise",90,100);
        Move rickMove2 = new Move("Rick’s Redemption");
        Move rickMove3 = new Move("Melodic Encore");

        ArrayList<Move> rickMoveset = Move.addMoveToMoveset(rickMove1,rickMove2,rickMove3);

        Move derpMove1 = new Move("Derpy Pouce",90,100);
        Move derpMove2 = new Move("Derpocalypse ",100);
        Move derpMove3 = new Move("Whimsical Charm");

        ArrayList<Move> derpMoveset = Move.addMoveToMoveset(derpMove1,derpMove2,derpMove3);
        
        Move godzillaMove1 = new Move("Atomic Breath",100,90);
        Move godzillaMove2 = new Move("Nuclear Regeneration");
        Move godzillaMove3 = new Move("Vengeful Retaliation");

        ArrayList<Move> godzillaMoveset = Move.addMoveToMoveset(godzillaMove1,godzillaMove2,godzillaMove3);

        Move odinMove1 = new Move("Hugin and Munin");
        Move odinMove2 = new Move("Allfather Strike",120,80);
        Move odinMove3 = new Move("Insight");

        ArrayList<Move> odinMoveset = Move.addMoveToMoveset(odinMove1,odinMove2,odinMove3);

        Move lokiMove1 = new Move("Shape Shift");
        Move lokiMove2 = new Move("Illusionary Strike",100,90);
        Move lokiMove3 = new Move("Mirror Image");
        
        ArrayList<Move> lokiMoveset = Move.addMoveToMoveset(lokiMove1, lokiMove2, lokiMove3);

        Move thorMove1 = new Move("Mjolnir's Strike",90,100);
        Move thorMove2 = new Move("Lighting bolt",110,80);
        Move thorMove3 = new Move("Call of Lighting");
        ArrayList<Move> thorMoveset = Move.addMoveToMoveset(thorMove1, thorMove2, thorMove3);
        
        Move anubisMove1 = new Move("Soul Drain",100,70);
        Move anubisMove2 = new Move("Pharaoh's Tomb",70,90);
        Move anubisMove3 = new Move("Underworld Summon");

        ArrayList<Move> anubisMoveset = Move.addMoveToMoveset(anubisMove1, anubisMove2, anubisMove3);
        Move raMove1 = new Move("Flash");
        Move raMove2 = new Move("Lightspeed");
        Move raMove3 = new Move("Sunshine",160,70);

        ArrayList<Move> raMoveset = Move.addMoveToMoveset(raMove1, raMove2, raMove3);

        Move horusMove1 = new Move("Falcon Strike",80,100);
        Move horusMove2 = new Move("Divine Healing");
        Move horusMove3 = new Move("Pharaoh's Judgement",200,80);

        ArrayList<Move> horusMoveset = Move.addMoveToMoveset(horusMove1, horusMove2, horusMove3);

        Move zeusMove1 = new Move("ThunderBolt",80,100);
        Move zeusMove2 = new Move("ThunderStorm",140,70);
        Move zeusMove3 = new Move("Typhoon",100,90);

        ArrayList<Move> zeusMoveset = Move.addMoveToMoveset(zeusMove1, zeusMove2, zeusMove3);

        Move poseidonMove1 = new Move("Flood",100,80);
        Move poseidonMove2 = new Move("Regenerate");
        Move poseidonMove3 = new Move("Trident Throw",70,100);

        ArrayList<Move> poseidonMoveset = Move.addMoveToMoveset(poseidonMove1, poseidonMove2, poseidonMove3);

        Move hadesMove1 = new Move("Invisinility");
        Move hadesMove2 = new Move("Soul Absorb",80,100);
        Move hadesMove3 = new Move("Reckless Attack",170,50);
        
        ArrayList<Move> hadesMoveset = Move.addMoveToMoveset(hadesMove1, hadesMove2, hadesMove3);
        
        ArrayList<Legends> characterList = new ArrayList<Legends>();

        Legends yog = new Legends("Yog-Sothoth","Cosmic entitiy who trasends space and time",yogMoveset,yogStat,"Outer");

        characterList.add(yog);

        Legends chthulhu = new Legends("Cthulhu","Colossal ancient god lying dormant in the sea waiting for someone to wake him",cthMoveset,cthulhuStat,"Outer");

        characterList.add(chthulhu);

        Legends azathoth = new Legends("Azathoth","Chaotic deity know as the blind god existing at the center of the cosmos",azaMoveset,azathothStat,"Outer");

        characterList.add(azathoth);

        Legends rick = new Legends("Rick Asley","Never gonna give you up never gonna let you down never gonna run around and desert you",rickMoveset,rickStat,"Meme");

        characterList.add(rick);

        Legends cat = new Legends("Derp Cat","nyanynaynaynaynaynayna",derpMoveset,derpStat,"Meme");

        characterList.add(cat);

        Legends godzilla = new Legends("Godzilla","King of the monster",godzillaMoveset,godzillaStat,"Meme");

        characterList.add(godzilla);

        Legends odin = new Legends("Odin","God of wisdom war and death the Allfather",odinMoveset,odinStat,"Norse");

        characterList.add(odin);

        Legends loki = new Legends("Loki","God of mischief who knows what he might do?",lokiMoveset,lokiStat,"Norse");

        characterList.add(loki);

        Legends thor = new Legends("Thor","God of thunder and also a powerful warrior",thorMoveset,thorStat,"Norse");

        characterList.add(thor);

        Legends anubis = new Legends("Anubis","God of the after life is your heart lighter then a feather?",anubisMoveset,anubisStat,"Egyptian");

        characterList.add(anubis);

        Legends ra = new Legends("Ra","God of the sun and creator of all life supreme leader of the Eygiptian gods",raMoveset,raStat,"Egyptian");

        characterList.add(ra);

        Legends horus = new Legends("Horus","God of the sky ruler of the pharaohs",horusMoveset,horusStat,"Egyptian");
        
        characterList.add(horus);

        Legends zeus = new Legends("Zeus","King of gods and ruler of Olympus",zeusMoveset,zeusStat,"Olympus");

        characterList.add(zeus);

        Legends poseidon = new Legends("Poseidon","God of the sea owner of atlantis",poseidonMoveset,posidionStat,"Olympus");

        characterList.add(poseidon);

        Legends hades = new Legends("Hades","God of the underworld owner of the domain of the dead",hadesMoveset,hadesStat,"Olympus");

        characterList.add(hades);

        Player player1 = new Player();
        Player player2 = new Player();

        // System.out.println("Player 1 choose Legends:");
        // showCharacterList(characterList);
        // System.out.println();
        // System.out.println();

        // System.out.print("Choose your first legend: ");
        // Legends temp = checkSwap(characterList);
        // player1.setCharacter(0,temp);
        // removeAlreadyPickedCharacterList(characterList,temp);
        // showCharacterList(characterList);
        // System.out.println();
        // System.out.println();

        // System.out.print("Choose your second legend: ");
        // temp = checkSwap(characterList);
        // player1.setCharacter(1,temp);
        // removeAlreadyPickedCharacterList(characterList,temp);
        // showCharacterList(characterList);
        // System.out.println();
        // System.out.println();

        // System.out.print("Choose your third legend: ");
        // temp = checkSwap(characterList);
        // player1.setCharacter(2,temp);
        // removeAlreadyPickedCharacterList(characterList,temp);
        // showCharacterList(characterList);
        // System.out.println();
        // System.out.println();
        
        // System.out.println();
        // System.out.println("These are your three selected Legends:");
        // System.out.print(player1.toString());

        // System.out.println();
        // System.out.println();

        // System.out.println("Player 2 choose Legends: ");
        // showCharacterList(characterList);
        // System.out.println();
        // System.out.println();

        // System.out.print("Choose your first legend: ");
        // temp = checkSwap(characterList);
        // player2.setCharacter(0,temp);
        // removeAlreadyPickedCharacterList(characterList,temp);
        // showCharacterList(characterList);
        // System.out.println();
        // System.out.println();

        // System.out.print("Choose your second legend: ");
        // temp = checkSwap(characterList);
        // player2.setCharacter(1,temp);
        // removeAlreadyPickedCharacterList(characterList,temp);
        // showCharacterList(characterList);
        // System.out.println();
        // System.out.println();


        // System.out.print("Choose your third legend: ");
        // temp = checkSwap(characterList);
        // player2.setCharacter(2,temp);
        // removeAlreadyPickedCharacterList(characterList,temp);
        // showCharacterList(characterList);
        // System.out.println();
        // System.out.println();

        // System.out.println();
        // System.out.println("These are your three selected Legends:");
        // System.out.print(player2.toString());
        // System.out.println();
        // System.out.println();

        System.out.println("Zeus health is now: " + zeus.getStats().getHP());
        System.out.println("Azathoth health is now: " + azathoth.getStats().getHP());
        System.out.println("Azathoth attacks Zeus, he does " + Legends.calcDamage(0,azathoth,zeus));
        System.out.println();
        attack(azaMoveset, azathoth, zeus);
        System.out.println("Zeus health is now: " + zeus.getStats().getHP());


    }

    public static void showCharacterList(ArrayList<Legends> characterList)
    {
        for(int i = 0 ;i<characterList.size();i++)
        {
            System.out.print(characterList.get(i).getName()+" ");
        }
    }

    public static void removeAlreadyPickedCharacterList(ArrayList<Legends> characterList,Legends legend)
    {
        for(int i = 0 ; i<characterList.size();i++)
        {
            if(legend==characterList.get(i))
            {
                characterList.remove(i);
            }
        }
    }

    //Improved Version, added check for invalid input that cause loop until it is correct
    public static Legends checkSwap(ArrayList<Legends> characterList) {
        Scanner input = new Scanner(System.in);
        String legend = "";

        boolean validInput = false;
        while (!validInput) {
            legend = input.nextLine();

            for (int i = 0; i < characterList.size(); i++) {
                if (legend.equals(characterList.get(i).getName())) {
                    validInput = true;
                    return characterList.get(i);
                }
            }

            System.out.print("Invalid input! Please enter a valid legend name: ");
        
        }

        return null;
    }

    public static void attack(ArrayList<Move> moveset,Legends legend, Legends otherLegend)
    {

        Scanner input = new Scanner(System.in);
        Legends.showMoveset(moveset);
        System.out.print("Choose your move: ");
        String move = "";
        boolean validInput = false;
        while(!validInput)
        {
            move=input.nextLine();

            for(int i = 0 ; i<moveset.size();i++)
            {
                if(move.equals(moveset.get(i).getMoveName())&&Legends.accuracyCheck(moveset.get(i).getAccuracy())==true)
                {
                    validInput=true;
                    int newHP = otherLegend.getStats().getHP()-Legends.calcDamage(i, legend,otherLegend);
                    otherLegend.getStats().setHP(newHP);
                    System.out.println("Your move hit!");
                    break;
                }
                else if(move.equals(moveset.get(i).getMoveName())&&Legends.accuracyCheck(moveset.get(i).getAccuracy())==false)
                {
                    System.out.println("Your move missed! Try again next time!");
                    return;
                }
            }
            
            
            if(!validInput)
            {
                System.out.print("Invalid input! Please enter a valid move name: ");
            }
            

        }

        
        

    }



    

    














    // public static Legends checkSwap(Legends yog, Legends chthulhu, Legends azathoth, Legends rick, Legends cat, Legends godzilla, Legends odin, Legends loki, Legends thor, Legends anubis, Legends ra, Legends horus, Legends zeus, Legends poseidon, Legends hades)
    // {
    //     Scanner input = new Scanner (System.in);
    //     String legend = input.nextLine();
    //     if(legend.equals("Yog-Sothoth"))
    //     {
            
    //         return yog;
    //     }
    //     if(legend.equals("Chthulhu"))
    //     {
            
    //         return chthulhu;
    //     }
    //     if(legend.equals("Azathoth"))
    //     {
            
    //         return azathoth;
    //     }
    //     if(legend.equals("Rick Asley"))
    //     {
            
    //         return rick;
    //     }
    //     if(legend.equals("Derp Cat"))
    //     {
            
    //         return cat;
    //     }
    //     if(legend.equals("Godzilla"))
    //     {
            
    //         return godzilla;
    //     }
    //     if(legend.equals("Odin"))
    //     {
            
    //         return odin;
    //     }
    //     if(legend.equals("Loki"))
    //     {
            
    //         return loki;
    //     }
    //     if(legend.equals("Thor"))
    //     {
            
    //         return thor;
    //     }
    //     if(legend.equals("Anubis"))
    //     {
            
    //         return anubis;
    //     }
    //     if(legend.equals("Ra"))
    //     {
            
    //         return ra;
    //     }
    //     if(legend.equals("Horus"))
    //     {
            
    //         return horus;
    //     }
    //     if(legend.equals("Zeus"))
    //     {
            
    //         return zeus;
    //     }
    //     if(legend.equals("Poseidon"))
    //     {
            
    //         return poseidon;
    //     }
    //     if(legend.equals("Hades"))
    //     {
            
    //         return hades;
    //     }
        
    //     return null;
    // }
}