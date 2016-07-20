package com.example.android.reportcard;

/**
 * Created by anirudha.joshi on 6/30/2016.
 */
public class ReportCard {

    // Grades for different subjects - these will be A, B, C or F
    private String mEnglishGrade = "";
    private String mPhysicsGrade = "";
    private String mChemistryGrade = "";
    private String mBiologyGrade = "";
    private String mMathGrade = "";

    // Define constants - these are letter grades that cannot change
    private final String gradeA = "A";
    private final String gradeB = "B";
    private final String gradeC = "C";
    private final String gradeF = "F";

    // public constructor for class
    public ReportCard() {
        // Instantiate each variable in the class
        mEnglishGrade = "";
        mPhysicsGrade = "";
        mChemistryGrade = "";
        mBiologyGrade = "";
        mMathGrade = "";
    }

    // Instantiate each class member variable with the values provided
    public ReportCard(String englishGrade, String physicsGrade, String chemistryGrade, String biologyGrade, String mathGrade) {
        // Instantiate each variable in the class
        mEnglishGrade = englishGrade;
        mPhysicsGrade = physicsGrade;
        mChemistryGrade = chemistryGrade;
        mBiologyGrade = biologyGrade;
        mMathGrade = mathGrade;
    }

    // Getter and setter methods for grades private variables.
    // The setter methods will throw an exception if the grade is anything other than A, B, C or F
    public String getEnglishGrade() {
        return mEnglishGrade;
    }

    public void setEnglishGrade(String englishGrade) {
        if (isValidGrade(englishGrade)) {
            mEnglishGrade = englishGrade;
        } else {    // Anything other that A, B, C or F is invalid - throw invalid argument exception
            throw new IllegalArgumentException();
        }
    }

    public String getPhysicsGrade() {
        return mPhysicsGrade;
    }

    public void setPhysicsGrade(String physicsGrade) {
        if (isValidGrade(physicsGrade)) {
            mPhysicsGrade = physicsGrade;
        } else {    // Anything other that A, B, C or F is invalid - throw invalid argument exception
            throw new IllegalArgumentException();
        }
    }

    public String getChemistryGrade() {
        return mChemistryGrade;
    }

    public void setChemistryGrade(String chemistryGrade) {
        if (isValidGrade(chemistryGrade)) {
            mChemistryGrade = chemistryGrade;
        } else {    // Anything other that A, B, C or F is invalid - throw invalid argument exception
            throw new IllegalArgumentException();
        }
    }

    public String getBiologyGrade() {
        return mBiologyGrade;
    }

    public void setBiologyGrade(String biologyGrade) {
        if (isValidGrade(biologyGrade)) {
            mBiologyGrade = biologyGrade;
        } else {    // Anything other that A, B, C or F is invalid - throw invalid argument exception
            throw new IllegalArgumentException();
        }
    }

    public String getMathGrade() {
        return mMathGrade;
    }

    public void setMathGrade(String mathGrade) {
        if (isValidGrade(mathGrade)) {
            mMathGrade = mathGrade;
        } else {    // Anything other that A, B, C or F is invalid - throw invalid argument exception
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        //Write code here to return the grade information
        //as a String.
        return "Report Card: {"
                + "English grade:" + this.mEnglishGrade + ", "
                + "Physics grade: " + this.mPhysicsGrade + ", "
                + "Chemistry grade: " + this.mChemistryGrade + ", "
                + "Biology grade: " + this.mBiologyGrade + ", "
                + "Math grade: " + this.mMathGrade + "}";
    }

    private boolean isValidGrade(String grade) {
        String errMsg = "Letter grades can only be A, B, C or F";
        if (grade.equalsIgnoreCase(gradeA)
                || grade.equalsIgnoreCase(gradeB)
                || grade.equalsIgnoreCase(gradeC)
                || grade.equalsIgnoreCase(gradeF))
            return true;
        else
            return false;
    }
}
