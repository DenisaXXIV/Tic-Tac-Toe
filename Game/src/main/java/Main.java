import javax.swing.*;
import java.util.Scanner;

public class Main {
    static char[] square = { 'o','1','2','3','4','5','6','7','8','9'};

//    int checkwin(){
//        return 0;
//    }
//    static void board(){
//
//    }

    public static void main(String[] args) {
        Board board=new Board();
        board.setVisible(true);
        board.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
//        int player = 1,i,choice;
//        char mark;
//        Scanner userInput = new Scanner(System.in);
//
//        do {
//            board();
//            if (player % 2 == 0){
//                player =1;
//            }
//            else {
//                player=2;
//            }
//            System.out.println("Player "+player+", enter a number:");
//            choice = userInput.nextInt();
//
//            if(player==1){
//                mark='X';
//            }
//            else {
//                mark='0';
//            }
//
//            if(choice == 1 && square[1]=='1')
//                square[1]=mark;
//
//            else if(choice == 2 && square[2]=='2')
//                square[2]=mark;
//
//            else if(choice == 3 && square[3]=='3')
//                square[3]=mark;
//
//            else if(choice == 4 && square[4]=='4')
//                square[4]=mark;
//
//            else if(choice == 5 && square[5]=='5')
//                square[5]=mark;
//
//            else if(choice == 6 && square[6]=='6')
//                square[6]=mark;
//
//            else if(choice == 7 && square[7]=='7')
//                square[7]=mark;
//
//            else if(choice == 8 && square[8]=='8')
//                square[8]=mark;
//
//            else if(choice == 9 && square[9]=='9')
//                square[9]=mark;
//            else{
//                System.out.println("Invalid move");
//                player--;
//
//            }
//        }
//    }
}
