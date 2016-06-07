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
        President GeorgeWashington = new President("George Washington", "None");
        President JohnAdams = new President("John Adams", "Federalist");
        President ThomasJefferson = new President("Thomas Jefferson", "Democratic Republican");
        President JamesMadison = new President("James Madison", "Democratic Republican");
        President JamesMonroe = new President("James Monroe", "Democratic Republican");
        President JohnQuincyAdams = new President("John Quincy Adams", "Democratic Republican");
        President AndrewJackson = new President("Andrew Jackson", "Democratic");
        President MartinVanBuren = new President("Martin Van Buren", "Democratic");
        President WilliamHenryHarrison = new President("william Henry Harrison", "Whig");
        President JohnTyler = new President("John Tyler", "Whig");
        President JamesKPolk = new President("James K. Polk", "Democratic");
        President ZacharyTaylor = new President("Zachary Taylor", "Whig");
        President MillardFillmore = new President("Millard Fillmore", "Whig");
        President FranklinPierce = new President("Franklin Pierce", "Democratic");
        President JamesBuchanan = new President("James Buchanan", "Democratic");
        President AbrahamLincoln = new President("Abraham Lincoln", "Republican");
        President AndrewJohnson = new President("Andrew Johnson", "Democratic");
        President UlyssesSGrant = new President("Ulysses S. Grant", "Republican");
        President RutherfordBHayes = new President("Rutherford B. Hayes", "Republican");
        President JamesAGarfield = new President("James A. Garfield", "Republican");
        President ChesterAArthur = new President("Chester A. Arthur", "Republican");
        President GroverCleveland = new President("Grover Cleveland", "Democratic");
        President BenjaminHarrison = new President("Benjamin Harrison", "Republican");
        President WilliamMcKinley = new President("William McKinley", "Republican");
        President TheodoreRoosevelt = new President("Theodore Roosevelt", "Republican");
        President WilliamHowardTaft = new President("William Howard Taft", "Republican");
        President WoodrowWilson = new President("Woodrow Wilson", "Democratic");
        President WarrenGHarding = new President("Warren G. Harding", "Republican");
        President CalvinCoolidge = new President("Calvin Coolidge", "Republican");
        President HerberHoover = new President("Herbert Hoover", "Republican");
        President FranklinDRoosevelt = new President("Franklin D. Roosevelt", "Democratic");
        President HarrySTruman = new President("Harry S. Truman", "Democratic");
        President DwightDEisenhower = new President("Dwight D. Eisenhower", "Republican");
        President JohnFKennedy = new President("John F. Kennedy", "Democratic");
        President LyndonBJohnson = new President("Lyndon B. Johnson", "Democratic");
        President RichardNixon = new President("Richard Nixon", "Republican");
        President GeraldFord = new President("Gerald Fold", "Republican");
        President JimmyCarter = new President("Jimmy Carter", "Democratic");
        President RonaldReagan = new President("Ronald Reagan", "Republican");
        President GeorgeHWBush = new President("George H. W. Bush", "Republican");
        President BillClinton = new President("Bill Clinton", "Democratic");
        President GeorgeWBush = new President("George W. Bush", "Republican");
        President BarackObama = new President("Barack Obama", "Democratic");
    }
}
