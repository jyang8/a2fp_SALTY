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

    //accessors 
    public String getName() {return name;}
    public String getParty() {return party;}
    public boolean getDead() {return dead;}
    public boolean getAssassinated() {return assassinated;}
    public boolean getPrezRel() {return prezRel;}
    public boolean getRipOffice() {return ripOffice;}
    public boolean getImpeached() {return impeached;}
    public boolean getServed() {return served;}
    public boolean getPrezWar() {return prezWar;}
    public boolean getOnCoin() {return onCoin;}
    public boolean getOnPaper() {return onPaper;}
    public boolean getFounder() {return founder;}
    public boolean getVp() {return vp;}
    public boolean getNonConsec() {return nonConsec;}
    public boolean getNaturalDeath() {return naturalDeath;}
    public boolean getResign() {return resign;}
    public boolean getOneTerm() {return oneTerm;}
    public boolean getTwoPlus() {return twoPlus;}
    
    /*
    public void setName(String name) {this.name = name;}
    public void setParty(String party) {this.party = party;}
    public void setDead(boolean dead) {this.dead = dead;}
    public void setAssassinated(boolean assassinated) {this.assassinated = assassinated;}
    public void setPrezRel(boolean prezRel) {this.prezRel = prezRel;}
    public void setRipOffice(boolean ripOffice) {this.ripOffice = ripOffice;}
    public void setImpeached(boolean impeached) {this.impeached = impeached;}
    public void setServed(boolean served) {this.served = served;}
    public void setPrezWar(boolean prezWar) {this.prezWar = prezWar;}
    public void setOnCoin(boolean onCoin) {this.onCoin = onCoin;}
    public void setOnPaper(boolean onPaper) {this.onPaper = onPaper;}
    public void setFounder(boolean founder) {this.founder = founder;}
    public void setVp(boolean vp) {this.vp = vp;}
    public void setNonConsec(boolean nonConsec) {this.nonConsec = nonConsec;}
    public void setNaturalDeath(boolean naturalDeath) {this.naturalDeath = naturalDeath;}
    public void setResign(boolean resign) {this.resign = resign;}
    public void setOneTerm(boolean oneTerm) {this.oneTerm = oneTerm;}
    public void setTwoPlus(boolean twoPlus) {this.twoPlus = twoPlus;}
    */
}
