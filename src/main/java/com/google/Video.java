package com.google;

import java.util.Collections;
import java.util.List;

/** A class used to represent a video. */
class Video {

  private final String title;
  private final String videoId;
  private final List<String> tags;
  private boolean isPlaying;
  private boolean isPaused;

  Video(String title, String videoId, List<String> tags) {
    this.title = title;
    this.videoId = videoId;
    this.tags = Collections.unmodifiableList(tags);
    this.isPlaying = false;
    this.isPaused = false;
  }

  /** Returns the title of the video. */
  String getTitle() {
    return title;
  }

  /** Returns the video id of the video. */
  String getVideoId() {
    return videoId;
  }

  /** Returns a readonly collection of the tags of the video. */
  List<String> getTags() {
    return tags;
  }

  public int compareTo(Video v) {

    if (v == null || this == null) {
      return 0;
    }

    return this.getTitle().compareTo(v.getTitle());
  }


  public boolean isPlaying() {
    return this.isPlaying;
  }

  public void stopPlaying() {
    this.isPlaying = false;
  }

  public void startPlaying() {
    this.isPlaying = true;
  }

  public boolean isPaused() {
    return this.isPaused;
  }

  public void pause() {
    this.isPaused = true;
  }

  public void unPause() {
    this.isPaused = false;
  }

  public void printTags() {
    System.out.print("[");

    for (int i = 0; i < this.getTags().size(); i++) {

      if (i != this.getTags().size() - 1) {
        System.out.print(this.getTags().get(i) + " ");
      } else if (i == this.getTags().size() - 1) {
        System.out.print(this.getTags().get(i));
      }
    }

    System.out.print("]");
  }

}
