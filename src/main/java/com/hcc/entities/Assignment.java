package com.hcc.entities;

import javax.persistence.*;

/**
 *  This class represents an Assignment entity. It stores the associated user, code reviewer, status, branch, as well as
 *  Github and review video URLs. It is mapped to the "assignments" table with a persistent generated id stored
 *  as a long acting primary key.
 */

@Entity
@Table(name = "assignments")
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    private int number;
    private String githubUrl;
    private String branch;
    private String reviewVideoUrl;
    @ManyToOne
    private User user;
    private User codeReviewer;

    public Assignment(String status, int number, String githubUrl, String branch, String reviewVideoUrl
                        , User user, User codeReviewer) {
        this.status = status;
        this.number = number;
        this.githubUrl = githubUrl;
        this.branch = branch;
        this.reviewVideoUrl = reviewVideoUrl;
        this.user = user;
        this.codeReviewer = codeReviewer;
    }

    public Assignment() {
    }

    // TODO: remove temporary constructor (used in order to build)
    public Assignment(long id, String decodedString) {
        this.id = id;
        this.status = decodedString;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNumber() { return number; }

    public void setNumber(Integer number) { this.number = number; }

    public String getGithubUrl() { return githubUrl; }

    public void setGithubUrl(String githubUrl) { this.githubUrl = githubUrl; }

    public String getBranch() { return branch; }

    public void setBranch(String branch) { this.branch = branch; }

    public String getReviewVideoUrl() { return reviewVideoUrl; }

    public void setReviewVideoUrl(String reviewVideoUrl) { this.reviewVideoUrl = reviewVideoUrl; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

    public User getCodeReviewer() { return codeReviewer; }

    public void setCodeReviewer() { this.codeReviewer = codeReviewer; }
}

