package com.hcc.enums;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * An enum containing all possible statuses an Assignment object may have.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum AssignmentStatusEnum {
    AssignmentStatus1(1, "Not_Submitted"),
    AssignmentStatus2(2, "Submitted"),
    AssignmentStatus3(3, "Under_Review"),
    AssignmentStatus4(4, "Approved"),
    AssignmentStatus5(5, "Rejected");

    private int statusNumber;
    private String status;

    AssignmentStatusEnum(int statusNumber, String status) {
        this.statusNumber = statusNumber;
        this.status = status;
    }

    int getStatusNumber() { return statusNumber; }

    String getStatus() { return status; }

}

