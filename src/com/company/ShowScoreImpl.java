package com.company;

public class ShowScoreImpl implements ShowScore{
  @Override
  public void showGamerScore(Gamer gamer) {
    System.out.println("Your score:"+ gamer.getScore());
  }
}
