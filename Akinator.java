import java.util.*;

public class Akinator{
    //instance vars
    PriorityQueue<President> posAnswers, rejAnswers;
    PriorityQueue<String> questions, idkQuestions;
    String userAns;
    
    public Akinator() 
    {
        posAnswers = new PriorityQueue<President>();
        rejAnswers = new PriorityQueue<President>();
        questions = new PriorityQueue<String>();
        idkQuestions = new PriorityQueue<String>();
        createQuestions();
        createAnswers();
        play();
    }
    
    /*
    String name, String party, boolean dead, boolean assassinated, boolean prezRel, 
    boolean scandal, boolean ripOffice, boolean impeached, boolean served, boolean prezWar, 
    boolean onCoin, boolean onPaper, boolean founder, boolean vp, boolean nonConsec, 
    boolean naturalDeath, boolean resign, boolean oneTerm, boolean twoPlus
    */
    public void createAnswers() 
    {
        President GeorgeWashington = new President("George Washington", "None", true, false, true, false, false, false, true, true, true, true, true, false, false, false, false, false, false);
        posAnswers.add(GeorgeWashington);
        President JohnAdams = new President("John Adams", "Federalist", true, false, true, false, false, false, false, false, true, false, true, true, false, false, false, true, false);
        posAnswers.add(JohnAdams);
        President ThomasJefferson = new President("Thomas Jefferson", "Democratic Republican", true, false, false, false, false, false, true, false, true, true, true, true, false, false, false, false, false);
        posAnswers.add(ThomasJefferson);
        President JamesMadison = new President("James Madison", "Democratic Republican", true, false, true, false, false, false, true, true, true, false, true, false, false, false, false, false, false);
        posAnswers.add(JamesMadison);
        President JamesMonroe = new President("James Monroe", "Democratic Republican", true, false, false, false, false, false, true, false, true, false, true, false, false, false, false, false, false);
        posAnswers.add(JamesMonroe);
        President JohnQuincyAdams = new President("John Quincy Adams", "Democratic Republican", true, false, true, false, false, false, false, false, true, false, false, false, false, false, false, true, false);
        posAnswers.add(JohnQuincyAdams);
        President AndrewJackson = new President("Andrew Jackson", "Democratic", true, false, false, false, false, false, true, false, true, true, false, false, false, false, false, false, false);
        posAnswers.add(AndrewJackson);
        President MartinVanBuren = new President("Martin Van Buren", "Democratic", true, false, true, false, false, false, true, false, true, false, false, true, false, false, false, true, false);
        posAnswers.add(MartinVanBuren);
        President WilliamHenryHarrison = new President("William Henry Harrison", "Whig", true, false, true, false, true, false, false, false, true, false, false, false, false, true, false, false, false);
        posAnswers.add(WilliamHenryHarrison);
        President JohnTyler = new President("John Tyler", "Whig", true, false, false, false, false, false, true, false, true, false, false, true, false, false, false, false, false);
        posAnswers.add(JohnTyler);
        President JamesKPolk = new President("James K. Polk", "Democratic", true, false, false, false, false, false, true, true, true, false, false, false, false, false, false, false, false);
        posAnswers.add(JamesKPolk);
        President ZacharyTaylor = new President("Zachary Taylor", "Whig", true, false, true, false, true, false, false, true, false, true, false, false, false, true, false, false, false);
        posAnswers.add(ZacharyTaylor);
        President MillardFillmore = new President("Millard Fillmore", "Whig", true, false, false, false, false, false, true, false, true, false, false, true, false, false, false, false, false);
        posAnswers.add(MillardFillmore);
        President FranklinPierce = new President("Franklin Pierce", "Democratic", true, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false, false);
        posAnswers.add(FranklinPierce);
        President JamesBuchanan = new President("James Buchanan", "Democratic", true, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false, false);
        posAnswers.add(JamesBuchanan);
        President AbrahamLincoln = new President("Abraham Lincoln", "Republican", true, true, false, false, true, false, true, true, true, true, false, false, false, false, false, false, false);
        posAnswers.add(AbrahamLincoln);
        President AndrewJohnson = new President("Andrew Johnson", "Democratic", true, false, false, false, false, true, true, false, false, false, false, true, false, false, false, false, false);
        posAnswers.add(AndrewJohnson);
        President UlyssesSGrant = new President("Ulysses S. Grant", "Republican", true, false, true, true, false, false, true, false, false, true, false, false, false, false, false, false, false);
        posAnswers.add(UlyssesSGrant);
        President RutherfordBHayes = new President("Rutherford B. Hayes", "Republican", true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false);
        posAnswers.add(RutherfordBHayes);
        President JamesAGarfield = new President("James A. Garfield", "Republican", true, true, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false);
        posAnswers.add(JamesAGarfield);
        President ChesterAArthur = new President("Chester A. Arthur", "Republican", true, false, false, false, false, false, true, false, false, false, false, true, false, false, false, false, false);
        posAnswers.add(ChesterAArthur);
        President GroverCleveland = new President("Grover Cleveland", "Democratic", true, false, false, false, false, false, false, false, false, true, false, false, true, false, false, true, false);
        posAnswers.add(GroverCleveland);
        President BenjaminHarrison = new President("Benjamin Harrison", "Republican", true, false, true, false, false, false, true, false, false, false, false, false, false, false, false, true, false);
        posAnswers.add(BenjaminHarrison);
        President WilliamMcKinley = new President("William McKinley", "Republican", true, true, false, false, true, false, true, true, false, true, false, false, false, false, false, false, false);
        posAnswers.add(WilliamMcKinley);
        President TheodoreRoosevelt = new President("Theodore Roosevelt", "Republican", true, false, true, false, false, false, true, false, false, false, false, true, false, false, false, false, false);
        posAnswers.add(TheodoreRoosevelt);
        President WilliamHowardTaft = new President("William Howard Taft", "Republican", true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false);
        posAnswers.add(WilliamHowardTaft);
        President WoodrowWilson = new President("Woodrow Wilson", "Democratic", true, false, false, false, false, false, false, true, false, true, false, false, false, false, false, false, false);
        posAnswers.add(WoodrowWilson);
        President WarrenGHarding = new President("Warren G. Harding", "Republican", true, false, false, true, true, false, false, false, false, false, false, false, false, true, false, false, false);
        posAnswers.add(WarrenGHarding);
        President CalvinCoolidge = new President("Calvin Coolidge", "Republican", true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false);
        posAnswers.add(CalvinCoolidge);
        President HerberHoover = new President("Herbert Hoover", "Republican", true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false);
        posAnswers.add(HerberHoover);
        President FranklinDRoosevelt = new President("Franklin D. Roosevelt", "Democratic", true, false, true, false, true, false, false, true, true, false, false, false, false, true, false, false, true);
        posAnswers.add(FranklinDRoosevelt);
        President HarrySTruman = new President("Harry S. Truman", "Democratic", true, false, false, false, false, false, true, true, false, false, false, true, false, false, false, false, false);
        posAnswers.add(HarrySTruman);
        President DwightDEisenhower = new President("Dwight D. Eisenhower", "Republican", true, false, false, false, false, false, true, true, true, false, false, false, false, false, false, false, false);
        posAnswers.add(DwightDEisenhower);
        President JohnFKennedy = new President("John F. Kennedy", "Democratic", true, true, false, false, true, false, true, true, true, false, false, false, false, false, false, false, false);
        posAnswers.add(JohnFKennedy);
        President LyndonBJohnson = new President("Lyndon B. Johnson", "Democratic", true, false, false, false, false, false, true, true, false, false, false, true, false, false, false, false, false);
        posAnswers.add(LyndonBJohnson);
        President RichardNixon = new President("Richard Nixon", "Republican", true, false, false, true, false, false, true, true, false, false, false, true, false, false, true, false, false);
        posAnswers.add(RichardNixon);
        President GeraldFord = new President("Gerald Ford", "Republican", true, false, false, false, false, false, true, false, false, false, false, true, false, false, false, true, false);
        posAnswers.add(GeraldFord);
        President JimmyCarter = new President("Jimmy Carter", "Democratic", false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, true, false);
        posAnswers.add(JimmyCarter);
        President RonaldReagan = new President("Ronald Reagan", "Republican", true, false, false, true, false, false, true, false, false, false, false, false, false, false, false, false, false);
        posAnswers.add(RonaldReagan);
        President GeorgeHWBush = new President("George H. W. Bush", "Republican", false, false, true, false, false, false, true, true, false, false, false, true, false, false, false, true, false);
        posAnswers.add(GeorgeHWBush);
        President BillClinton = new President("Bill Clinton", "Democratic", false, false, false, true, false, true, false, false, false, false, false, false, false, false, false, false, false);
        posAnswers.add(BillClinton);
        President GeorgeWBush = new President("George W. Bush", "Republican", false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false);
        posAnswers.add(GeorgeWBush);
        President BarackObama = new President("Barack Obama", "Democratic", false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false);
        posAnswers.add(BarackObama);
    }
    
    public void createQuestions() 
    {
        questions.add("Is he dead?");
        questions.add("Was he assassinated?");
        questions.add("Did any of his relatives serve in office?");
        questions.add("Did he have a scandal?");
        questions.add("Did he die in office?");
        questions.add("Was he impeached?");
        questions.add("Did he serve in the military?");
        questions.add("Did he serve as president during a (major) war?");
        questions.add("Is/Was he on a coin?");
        questions.add("Is/Was he on paper currency (dollar bills)?");
        questions.add("Was he a Republican?");
        questions.add("Was he a Democrat?");
        questions.add("Was he a Democratic-Republican?");
        questions.add("Was he a Whig?");
        questions.add("Was he a Federalist?");
        questions.add("Was he non-affiliated (not part of a party)?");
        questions.add("Was he a founding father?");
        questions.add("Did he ever serve as vice president?");
        questions.add("Did he serve non-consecutive terms?");
        questions.add("Did he die of a natural cause?");
        questions.add("Did he resign?");
        questions.add("Has he served only one term?");
        questions.add("Has he served more than two terms?");
    }
    
    //removes and adds presidents that don't satisfy answer to rejAnswers
    public void retainAll(String condition, boolean val) 
    {
        if (condition.equals("Is he dead?")) {
            for (President p: posAnswers) {
                if (p.getDead() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Was he assassinated?")) {
            for (President p: posAnswers) {
                if (p.getAssassinated() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Did any of his relatives serve in office?")) {
            for (President p: posAnswers) {
                if (p.getPrezRel() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Did he have a scandal?")) {
            for (President p: posAnswers) {
                if (p.getScandal() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Did he die in office?")) {
            for (President p: posAnswers) {
                if (p.getRipOffice() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Was he impeached?")) {
            for (President p: posAnswers) {
                if (p.getImpeached() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Did he serve in the military?")) {
            for (President p: posAnswers) {
                if (p.getServed() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Did he serve as president during a (major) war?")) {
            for (President p: posAnswers) {
                if (p.getPrezWar() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Is/Was he on a coin?")) {
            for (President p: posAnswers) {
                if (p.getOnCoin() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Is/Was he on paper currency (dollar bills)?")) {
            for (President p: posAnswers) {
                if (p.getOnPaper() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Was he a Republican?")) {
            for (President p: posAnswers) {
                if (p.getParty().equals("Republican") != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Was he a Democrat?")) {
            for (President p: posAnswers) {
                if (p.getParty().equals("Democratic") != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Was he a Democratic-Republican?")) {
            for (President p: posAnswers) {
                if (p.getParty().equals("Democratic Republican") != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Was he a Whig?")) {
            for (President p: posAnswers) {
                if (p.getParty().equals("Whig") != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Was he a Federalist?")) {
            for (President p: posAnswers) {
                if (p.getParty().equals("Federalist") != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Was he non-affiliated (not part of a party)?")) {
            for (President p: posAnswers) {
                if (p.getParty().equals("None") != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Was he a founding father?")) {
            for (President p: posAnswers) {
                if (p.getFounder() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Did he ever serve as vice president?")) {
            for (President p: posAnswers) {
                if (p.getVp() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Did he serve non-consecutive terms?")) {
            for (President p: posAnswers) {
                if (p.getNonConsec() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Did he die of a natural cause?")) {
            for (President p: posAnswers) {
                if (p.getNaturalDeath() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Did he resign?")) {
            for (President p: posAnswers) {
                if (p.getResign() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Has he served only one term?")) {
            for (President p: posAnswers) {
                if (p.getOneTerm() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        else if (condition.equals("Has he served more than two terms?")) {
            for (President p: posAnswers) {
                if (p.getTwoPlus() != val) {
                    rejAnswers.add(p);
                }
            }
            for (President prez: rejAnswers) {
                posAnswers.remove(prez);
            }
        }
        
    }
    
    public boolean isValid(String s) 
    {
        String str = s.toLowerCase();
        if (str.equals("yes"))
            return true;
        else if (str.equals("no"))
            return true;
        else if (str.equals("idk"))
            return true;
        else
            return false;
    }
    
    public void play()
    {
        String s = "Welcome to the Akinator!" + "\n";
        s += "The topic of this game is Presidents!" + "\n";
        s += "For each question I ask, respond with a \"yes\", \"no\", or \"idk\"" + "\n";
        s += "You should take this time to think of a president you want me to guess" + "\n";
        s += "Are you ready?";
        System.out.println(s);
        Scanner input = new Scanner(System.in);
        userAns = input.nextLine().toLowerCase();
        while (!userAns.equals("yes")){
            s = "You should take this time to think of a president you want me to guess" + "\n";
            s += "Are you ready?";
            System.out.println(s);
            userAns = input.nextLine().toLowerCase();
        }
        while (!posAnswers.isEmpty()){
            if (!questions.isEmpty()){
                String tmp = questions.poll();
                System.out.println("\n" + tmp);
                userAns = input.nextLine().toLowerCase();
                while (!isValid(userAns)){
                    System.out.println("Sorry, invalid answer" + "\n");
                    System.out.println(tmp);
                    userAns = input.nextLine().toLowerCase();
                }
                if (userAns.equals("yes")) 
                    retainAll(tmp,true);
                else if (userAns.equals("idk")) {
                    idkQuestions.add(tmp);
                    retainAll(tmp,true);
                }
                else 
                    retainAll(tmp,false);
            }
                String guess = posAnswers.poll().getName();
                System.out.println("\n" + "Is it " + guess + "?");
                    userAns = input.nextLine().toLowerCase();
                    while (!isValid(userAns)){
                        System.out.println("Sorry, invalid answer" + "\n");
                        System.out.println("\n" + "Is it " + guess + "?");
                        userAns = input.nextLine().toLowerCase();
                    }
                    if (userAns.equals("yes")) {
                        System.out.println("WOOHOO!! Would you like to play again?");
                        userAns = input.nextLine().toLowerCase();
                        if (userAns.equals("yes")){
                            Akinator b = new Akinator();
                        }
                        else {
                            System.out.println("Thanks for playing!! Bye~");
                            System.exit(0);
                        }
                    }
            }
    }
    
    public static void main(String[] args)
    {
        Akinator a = new Akinator();
    }
}
