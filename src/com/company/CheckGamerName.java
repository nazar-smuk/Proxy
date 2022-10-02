package com.company;

public class CheckGamerName implements ShowScore {

  private final ShowScore showScore;

  public CheckGamerName() {
    this.showScore = new ShowScoreImpl();
  }

  @Override
  public void showGamerScore(Gamer gamer) {

    if (isNotEmptyName(gamer)) {
      showScore.showGamerScore(gamer);
    }
  }

  private boolean isNotEmptyName(Gamer gamer) {
    return !gamer.getName().isEmpty();
  }
}
