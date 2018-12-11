import java.util.ArrayDeque;
import java.util.Scanner;

class Pyaniza {
        public static void getCards(ArrayDeque<Integer> deque) {
                Scanner scanner = new Scanner(System.in);

                for (int i = 0; i < 5; i++) {
                        deque.addLast(scanner.nextInt());
                }
        }

        public static void main(String args[]) {
                ArrayDeque<Integer>     firstDeque  = new ArrayDeque<Integer>();
                ArrayDeque<Integer>     secondDeque = new ArrayDeque<Integer>();
                int                     firstCard;
                int                     secondCard;

                getCards(firstDeque);
                getCards(secondDeque);

                for (int i = 1; i <= 106; i++) {
                        firstCard = firstDeque.pollFirst();
                        secondCard = secondDeque.pollFirst();

                        if (((firstCard > secondCard) && (secondCard != 0 && firstCard != 9)) || (firstCard == 0 && secondCard == 9)) {
                                firstDeque.addLast(firstCard);
                                firstDeque.addLast(secondCard);

                                if (secondDeque.peekFirst() == null) {
                                        System.out.println("first " + i);
                                        return ;
                                }
                        }
                        else if (((secondCard > firstCard) && (firstCard != 0 && secondCard != 9)) || (secondCard == 0 && firstCard == 9)) {
                                secondDeque.addLast(firstCard);
                                secondDeque.addLast(secondCard);

                                if (firstDeque.peekFirst() == null) {
                                        System.out.println("second " + i);
                                        return ;
                                }
                        }
                }

                System.out.println("botva");
        }
}
