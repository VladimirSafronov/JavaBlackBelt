package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {

  private String name;
  private List<T> participants = new ArrayList<>();

  public Team(String name) {
    this.name = name;
  }

  public void addNewParticipant(T participant) {
    participants.add(participant);
    System.out.println("In team " + name + " was added new player " + participant.getName());
  }

  public void playWith(Team<T> team) {
    String winner;
    int i = new Random().nextInt(2);
    if (i == 0) {
      winner = this.name;
    } else {
      winner = team.name;
    }
    System.out.println("The winner is " + winner);
  }
}
