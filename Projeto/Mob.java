public abstract class Mob {
    protected byte atk, def;
    protected byte p1, p2;
    
    public byte getP1() {
        return p1;
    }

    public void setP1(byte p1) {
        if(p1>=0 && p1<=4){
            this.p1 = p1;
        }
    }

    public byte getP2() {
        return p2;
    }

    public void setP2(byte p2) {
        if(p2>=0 && p2<=4){
            this.p2 = p2;
        }
    }

    public byte getAtk() {
        return atk;
    }

    public void setAtk(byte atk) {
        this.atk = atk;
    }

    public byte getDef() {
        return def;
    }

    public void setDef(byte def) {
        this.def = def;
    }
}
