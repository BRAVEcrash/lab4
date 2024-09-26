public class AnsweingPhone extends Phone{
    protected String when;

    AnsweingPhone(String when, String owner){
        super(owner);
        this.when = when;
    }
    public void autoAnswering(){
        System.out.println(owner +  " 이가 부재 중이다." + when + " 전화 줄래.");
    }
}