package edu.ksu.canvas.interfaces;


import java.io.IOException;
import java.util.List;

import edu.ksu.canvas.model.assignment.Submission;
import edu.ksu.canvas.requestOptions.ListSubmissionOptions;

public interface SubmissionReader  extends CanvasReader<Submission, SubmissionReader> {

    /**
     * Retrieves all submissions a given student has submitted for assignments
     * in a given course.
     *
     * @param options specifies the course and student
     * @return list of submissions for the student
     * @throws IOException
     */
    List<Submission> listCourseSubmissionsForUser(ListSubmissionOptions options) throws IOException;
}
