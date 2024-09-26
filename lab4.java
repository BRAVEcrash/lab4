public class lab4 {
    public static void main(String[] args){

        Book book = new Book("titanic", 4);
        //System.out.println("---(문제4-1)---");
        System.out.println("================");
        book.total();

        System.out.println("================");
        System.out.println("---(문제4-2)---");
        Phone[] phones = {
                new Phone("황진이"),
                new AnsweingPhone("길동이", "내일"),
                new SmartPhone("민국이", "저녁때", "갤러그")
        };
        System.out.println("================");
        for (Phone phone : phones) {
            if (phone instanceof AnsweingPhone) {
                ((AnsweingPhone) phone).autoAnswering();
            }
            else if (phone instanceof SmartPhone) {
                ((SmartPhone) phone).playGame();
            } else{
                phone.talk();
            }
        }
        System.out.println("================");
        System.out.println("---(문제4-3)---");
        Vehicle vehicle = new Vehicle("파랑", 200);
        vehicle.show();

        Car car = new Car("파랑", 200, 1000, 5);
        car.show();
    }
}