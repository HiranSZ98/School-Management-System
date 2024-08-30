package school.management.system;

/**
 * This class is responsible for keep the
 * track of students fees, name, grade
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new Student by initializing.
     * Fees for every student is $30,000.
     * @param id
     * @param name
     * @param grade
     */

    public Student(int id, String name, int grade) {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }

    //Not going to alter student's name, student's id.

    public int getGrade() {
        return grade;
    }

    /**
     * used to update the student's name, student's id.
     * @param grade new grade of the student
     */


    /**
     * keep adding the fees to feesPaid Field;
     * Add the fees to the fees paid.
     * The school is going receive the funds
     *
     *
     * @param fees that the student pays
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * Return the remaining feels
     * @return
     */
    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }
}
