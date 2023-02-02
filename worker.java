public class worker {
    String workUserName;
    int workAge;
    String workRegal;

    public void worker(String WorkUserName, String WorkRegal, int WorkAge){
        this.workUserName = WorkUserName;
        this.workRegal = WorkRegal;
        this.workAge = WorkAge;
    }
    public String getWorkUserName(){
        return workUserName;
    }
    public String getWorkRegal(){
        return workRegal;
    }
    public int getWorkAge(){
        return workAge;
    }
}
