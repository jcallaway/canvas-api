package edu.ksu.canvas.model.quizzes;

/**
 * Class to hold the permissions returned when querying quizzes.
 * Each one represents whether the user making the query has the permission described
 */
public class QuizPermission {

    private Boolean read;
    private Boolean submit;
    private Boolean create;
    private Boolean manage;
    private Boolean read_statistics;
    private Boolean review_grades;
    private Boolean update;

    public Boolean canRead() {
        return read;
    }

    public Boolean canSubmit() {
        return submit;
    }

    public Boolean canCreate() {
        return create;
    }

    public Boolean canManage() {
        return manage;
    }

    public Boolean canRead_statistics() {
        return read_statistics;
    }

    public Boolean canReview_grades() {
        return review_grades;
    }

    public Boolean canUpdate() {
        return update;
    }
}