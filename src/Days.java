public enum Days {
    DUYSHOMBI("Lesson Java theory"),
    SHEYSHEMBI("Lesson Java practice"),
    SHARSHEMBI("Lesson English"),
    BEYSHEMBI("Lesson Java practice"),
    JUMA("Lesson Java theory"),
    ISHEMBI("Repeat lessons"),
    JEKSHEMBI("Relax");

    private String doing;

    Days(String doing) {
        this.doing = doing;
    }

    @Override
    public String toString() {
        return "Days{" +
                "doing='" + doing + '\'' +
                '}';
    }
}
