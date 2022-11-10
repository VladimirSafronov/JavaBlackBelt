package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

//игра камень/ножницы/бумага

public class ExchangerEx {

  public static void main(String[] args) {
    Exchanger<Action> exchanger = new Exchanger<>();
    List<Action> firstFriendAction = new ArrayList<>();
    firstFriendAction.add(Action.ROCK);
    firstFriendAction.add(Action.PAPER);
    firstFriendAction.add(Action.SCISSORS);
    List<Action> secondFriendAction = new ArrayList<>();
    secondFriendAction.add(Action.SCISSORS);
    secondFriendAction.add(Action.ROCK);
    secondFriendAction.add(Action.ROCK);
    new BestFriend("Oleg", firstFriendAction, exchanger);
    new BestFriend("Boria", secondFriendAction, exchanger);

  }
}

enum Action {
  ROCK, PAPER, SCISSORS
}

class BestFriend extends Thread {
  private String name;
  private List<Action> myActions;
  private Exchanger<Action> exchanger;

  public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
    this.name = name;
    this.myActions = myActions;
    this.exchanger = exchanger;
    this.start();
  }

  private void whoWins(Action myAction, Action friendAction) {
    if((myAction == Action.SCISSORS && friendAction == Action.PAPER)
    || (myAction == Action.PAPER && friendAction == Action.ROCK)
    || (myAction == Action.ROCK && friendAction == Action.SCISSORS)) {
      System.out.println(name + " wins!");
    }
  }

  @Override
  public void run() {
    Action reply; //будет содержать ответ друга
    for (Action action : myActions) {
      try {
        //при помощи exchanger-a получаем ответ от друга,передавая в параметре метода свое действие
        reply = exchanger.exchange(action);
        whoWins(action, reply);
        sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}