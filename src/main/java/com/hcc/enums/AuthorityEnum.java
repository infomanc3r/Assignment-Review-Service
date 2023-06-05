package com.hcc.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * An enum representing all the different levels of Authority an individual User may have. There are currently 3
 * different permission levels. Student Authority allows viewing, submitting, and resubmitting Assignments. Reviewer
 * Authority allows viewing, claiming/reclaiming, and approve/rejecting of Assignments. Owner Authority allows the
 * ability to create and edit Users and Assignments.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AuthorityEnum {
    Authority1(1, "ROLE_STUDENT"),
    Authority2(2, "ROLE_REVIEWER"),
    Authority3(3, "ROLE_ADMIN");

    private int authorityNumber;
    private String authority;

    AuthorityEnum(int authorityNumber, String authority) {
        this.authorityNumber = authorityNumber;
        this.authority = authority;
    }

    int getAuthorityNumber() { return this.authorityNumber; }
    String getAuthority() { return this.authority; }

}
