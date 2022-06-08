package fundamentals;

public class Conditionals {
    public static void main(String[] args) {
        int age =17;
        int guest = 2;

        if(age >= 18){
            System.out.println("You can get a beer!");
        } else {
            if (guest >=2){
                System.out.println("You are not allowed to drink but you are not alone, so take your beer!"); //17
            } else {
                System.out.println("no drinks for you. Take this cookie");
            }
        }

    }
}
