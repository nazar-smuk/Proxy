package com.company;

public class Gamer {

  private String name;
  private int score;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public Gamer(String name, int score) {
    this.name = name;
    this.score = score;
  }
}
