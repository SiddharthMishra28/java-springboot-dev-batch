package com.java.functional;

class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int numOfStudents;

    public Course(String name, String category, int reviewScore, int numOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.numOfStudents = numOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", reviewScore=" + reviewScore +
                ", numOfStudents=" + numOfStudents +
                '}';
    }
}