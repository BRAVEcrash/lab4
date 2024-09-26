public class Phone {
    protected String owner;

    Phone(String owner){
        this.owner = owner;
    }

    public void talk(){
        System.out.println(owner + " 통화 중이다.");
    }
}