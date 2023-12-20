import java.util.Scanner;

class main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();

        if(age < 16){
          System.out.println("Sorry,you are not quite old emnough to drive!");
        }
        else{
            System.out.println("Yeah! Happy driving!");
        }
    }
}