public class Akinator{
    //instance vars
    PriorityQueue<President> posAnswers, rejAnswers, idkAnswers;
    PriorityQueue<String> questions, idkQuestions;
    
    public Akinator() 
    {
    }
    
    /*
    String name, String party, boolean dead, boolean assassinated, boolean prezRel, 
    boolean scandal, boolean ripOffice, boolean impeached, boolean served, boolean prezWar, 
    boolean onCoin, boolean onPaper, boolean founder, boolean vp, boolean nonConsec, 
    boolean naturalDeath, boolean resign, boolean oneTerm, boolean twoPlus
    */
    public void create() 
    {
        President GeorgeWashington = new President("George Washington", "None", true, false, true);
        President JohnAdams = new President("John Adams", "Federalist", true, false, true);
        President ThomasJefferson = new President("Thomas Jefferson", "Democratic Republican", true, false, false);
        President JamesMadison = new President("James Madison", "Democratic Republican", true, false, true);
        President JamesMonroe = new President("James Monroe", "Democratic Republican", true, false, false);
        President JohnQuincyAdams = new President("John Quincy Adams", "Democratic Republican", true, false, true);
        President AndrewJackson = new President("Andrew Jackson", "Democratic", true, false, false);
        President MartinVanBuren = new President("Martin Van Buren", "Democratic", true, false, true);
        President WilliamHenryHarrison = new President("william Henry Harrison", "Whig", true, false, true);
        President JohnTyler = new President("John Tyler", "Whig", true, false, false);
        President JamesKPolk = new President("James K. Polk", "Democratic", true, false, false);
        President ZacharyTaylor = new President("Zachary Taylor", "Whig", true, false, true);
        President MillardFillmore = new President("Millard Fillmore", "Whig", true, false, false);
        President FranklinPierce = new President("Franklin Pierce", "Democratic", true, false, false);
        President JamesBuchanan = new President("James Buchanan", "Democratic", true, false, false);
        President AbrahamLincoln = new President("Abraham Lincoln", "Republican", true, true, false);
        President AndrewJohnson = new President("Andrew Johnson", "Democratic", true, false, false);
        President UlyssesSGrant = new President("Ulysses S. Grant", "Republican", true, false, true);
        President RutherfordBHayes = new President("Rutherford B. Hayes", "Republican", true, false, false);
        President JamesAGarfield = new President("James A. Garfield", "Republican", true, true, false);
        President ChesterAArthur = new President("Chester A. Arthur", "Republican", true, false, false);
        President GroverCleveland = new President("Grover Cleveland", "Democratic", true, false, false);
        President BenjaminHarrison = new President("Benjamin Harrison", "Republican", true, false, true);
        President WilliamMcKinley = new President("William McKinley", "Republican", true, true, false);
        President TheodoreRoosevelt = new President("Theodore Roosevelt", "Republican", true, false, true);
        President WilliamHowardTaft = new President("William Howard Taft", "Republican", true, false, true);
        President WoodrowWilson = new President("Woodrow Wilson", "Democratic", true, false, false);
        President WarrenGHarding = new President("Warren G. Harding", "Republican", true, false, false);
        President CalvinCoolidge = new President("Calvin Coolidge", "Republican", true, false, false);
        President HerberHoover = new President("Herbert Hoover", "Republican", true, false, false);
        President FranklinDRoosevelt = new President("Franklin D. Roosevelt", "Democratic", true, false, true);
        President HarrySTruman = new President("Harry S. Truman", "Democratic", true, false, false);
        President DwightDEisenhower = new President("Dwight D. Eisenhower", "Republican", true, false, false);
        President JohnFKennedy = new President("John F. Kennedy", "Democratic", true, true, false);
        President LyndonBJohnson = new President("Lyndon B. Johnson", "Democratic", true, false, false);
        President RichardNixon = new President("Richard Nixon", "Republican", true, false, false);
        President GeraldFord = new President("Gerald Fold", "Republican", true, false, false);
        President JimmyCarter = new President("Jimmy Carter", "Democratic", false, false, false);
        President RonaldReagan = new President("Ronald Reagan", "Republican", true, false, false);
        President GeorgeHWBush = new President("George H. W. Bush", "Republican", false, false, true);
        President BillClinton = new President("Bill Clinton", "Democratic", false, false, false);
        President GeorgeWBush = new President("George W. Bush", "Republican", false, false, true);
        President BarackObama = new President("Barack Obama", "Democratic", false, false, false);
    }
}
