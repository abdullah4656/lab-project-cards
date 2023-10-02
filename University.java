public class University {
        private Lab[] labs;
        private int labCount;

        public University(int maxLabCount) {
                labs = new Lab[maxLabCount];
                labCount = 0;
        }

        public void addLab(Lab lab) {
                if (labCount < labs.length) {
                        labs[labCount] = lab;
                        labCount++;
                } else {
                        System.out.println("Cannot add more labs. Lab capacity reached.");
                }
        }

        public void removeLab(int labIndex) {
                if (labIndex >= 0 && labIndex < labCount) {
                        for (int i = labIndex; i < labCount - 1; i++) {
                                labs[i] = labs[i + 1];
                        }
                        labs[labCount - 1] = null;
                        labCount--;
                } else {
                        System.out.println("Invalid lab index.");
                }
        }
        public Lab fetchLab(int labIndex) {
                if (labIndex >= 0 && labIndex < labCount) {
                        return labs[labIndex];
                } else {
                        System.out.println("Invalid lab index.");
                        return null;
                }
        }
}
