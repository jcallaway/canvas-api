package edu.ksu.canvas.requestOptions;

import java.util.List;

public class ListSubmissionOptions extends BaseOptions {

    private final String courseId;

    public ListSubmissionOptions(String courseId) {
        this.courseId = courseId;
    }

    public ListSubmissionOptions userIds(List<String> userIds) {
        addStringList("student_ids[]", userIds);
        return this;
    }

    public String getCourseId() {
        return courseId;
    }
}
