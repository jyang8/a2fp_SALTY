public class Akinator{
    //instance vars
    PriorityQueue<President> posAnswers, rejAnswers, idkAnswers;
    PriorityQueue<String> questions, idkQuestions;
    
    public Akinator() 
    {
        createAnswers();
        
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
        President MartinVanBuren = new President("Martin Van Buren", "Democratic", true, false, true, false, false, false, false, false, true, false, false, false, true, false, false, false, true, false);
        posAnswers.add(MartinVanBuren);
        President WilliamHenryHarrison = new President("William Henry Harrison", "Whig", true, false, true, false, true, false, true, false, true, false, false, false, false, false, true, false, false, false);
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
        President JohnFKennedy = new President("John F. Kennedy", "Democratic", true, true, false, false, true, false, true, true, true, false, false, false, false, false, false, false);
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
    
    public static void play()
    {
        Akinator a = new Akinator();
    }
    
    public static void main(String[] args)
    {
        play();
    }
}
