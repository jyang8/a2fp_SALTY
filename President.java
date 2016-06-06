public class President{
    //instance vars
    boolean dead, assassinated, prezRel, scandal, ripOffice, impeached, served, prezWar, onCoin, onPaper, founder, vp, 
nonConsec, naturalDeath, resign, oneTerm, twoPlus;
    String name, party;
    
    //checks instance var against string question
    public President(String name, String party, boolean dead, boolean assassinated, boolean prezRel, boolean scandal,
    boolean ripOffice, boolean impeached, boolean served, boolean prezWar, boolean onCoin, boolean onPaper, boolean founder,
    boolean vp, boolean nonConsec, boolean naturalDeath, boolean resign, boolean oneTerm, boolean twoPlus )
    {
        this.name = name;
        this.party = party;
        this.dead = dead;
        this.assassinated = assassinated;
        this.prezRel = prezRel;
        this.scandal = scandal;
        this.ripOffice = ripOffice;
        this.impeached = impeached;
        this.served = served;
        this.prezWar = prezWar;
        this.onCoin = onCoin;
        this.onPaper = onPaper; 
        this.founder = founder;
        this.vp = vp;
        this.nonConsec = nonConsec;
        this.naturalDeath = naturalDeath;
        this.resign = resign;
        this.oneTerm = oneTerm;
        this.twoPlus = twoPlus;
    }

    //accessors and mutators
    public String getName() {return name;}
    public String getParty() {return party;}
    public boolean getName() {return name;}
    public boolean getName() {return name;}
    public boolean getName() {return name;}
    public boolean getName() {return name;}
}
