package com.hcc.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * An enum containing each of the Assignments that an Assignment object can represent.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AssignmentEnum {
    Assignment1(1, "https://github.com/infomanc3r/Advertising-Service-Project"),
    Assignment2(2, "https://github.com/infomanc3r/Kindle-Publishing-Service"),
    Assignment3(3, "https://github.com/infomanc3r/Music-Playlist-Service"),
    Assignment4(4, "https://github.com/infomanc3r/Assignment-Review-Service"),
    Assignment5(5, "https://github.com/infomanc3r/Twitter-Archiver-Beta");

    private int assignmentNumber;
    private String githubURL;

    AssignmentEnum(int assignmentNumber, String githubURL) {
        this.assignmentNumber = assignmentNumber;
        this.githubURL = githubURL;
    }

    int getAssignmentNumber() { return this.assignmentNumber; }
    String getGithubURL() { return this.githubURL; }

}
