public class SmartPhone extends Phone{
    private String game;
    String time;

    SmartPhone(String owner, String game, String time){
        super(owner);
        this.game = game;
        this.time = time;
    }

    void playGame(){
        System.out.println(owner+"가 " + game+" 게임을 하는 중이다."+ time+" 전화 줄래.");
    }

}