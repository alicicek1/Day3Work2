package Entity;

public class Student extends Person{
    private String comment;
    private int totalWatchedVideoCount;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getTotalWatchedVideoCount() {
        return totalWatchedVideoCount;
    }

    public void setTotalWatchedVideoCount(int totalWatchedVideoCount) {
        this.totalWatchedVideoCount = totalWatchedVideoCount;
    }

    public int getTotalAttendedCourseCount() {
        return totalAttendedCourseCount;
    }

    public void setTotalAttendedCourseCount(int totalAttendedCourseCount) {
        this.totalAttendedCourseCount = totalAttendedCourseCount;
    }

    private int totalAttendedCourseCount;
}
