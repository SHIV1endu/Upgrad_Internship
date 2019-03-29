import java.util.Comparator;

class DataComparator implements Comparator<Data> {

    // Comparing the student data accroding to their CGPA and case sensitive name to
    // set Priority
    public int compare(Data s1, Data s2) {
        if (s1.CGPA < s2.CGPA)
            return 1;
        else if (s1.CGPA > s2.CGPA)
            return -1;
        else {
            if (s1.name.compareTo(s2.name) < 0)
                return -1;
            else
                return 1;
        }
    }
}