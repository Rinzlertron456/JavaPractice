package Generics;

public class EnumTypes {

    enum LeaveTypes{
        Sick, Vacation, Maternity;
        int sickLeaves = 12, vacationLeaves = 20, maternityLeaves = 84, totalLeaves = 116;

        public int getSickLeaves() {
            return sickLeaves;
        }

        public void setSickLeaves(int sickLeaves) {
            this.sickLeaves = sickLeaves;
        }

        public int getVacationLeaves() {
            return vacationLeaves;
        }

        public void setVacationLeaves(int vacationLeaves) {
            this.vacationLeaves = vacationLeaves;
        }

        public int getMaternityLeaves() {
            return maternityLeaves;
        }

        public void setMaternityLeaves(int maternityLeaves) {
            this.maternityLeaves = maternityLeaves;
        }

        public int getTotalLeaves() {
            return totalLeaves;
        }

        public void setTotalLeaves(int totalLeaves) {
            this.totalLeaves = totalLeaves;
        }

        public <T extends String> String applyLeaves() {
            switch (this){
                case Sick:
//                    return sickLeaves<=12? "Sick Leave Granted" : " Sick Leaves Over";
                    if(sickLeaves>0) {
                        setSickLeaves(sickLeaves-1);
                        setTotalLeaves(totalLeaves-1);
                        System.out.println(getSickLeaves());
                        System.out.println(getTotalLeaves());
                        return "Sick Leave Granted";
                    }
                    else return "Sick Leaves Over";
                case Vacation:
                    if(vacationLeaves>0) {
                        setVacationLeaves(vacationLeaves-1);
                        setTotalLeaves(totalLeaves-1);
                        System.out.println(getSickLeaves());
                        System.out.println(getTotalLeaves());
                        return "Vacation Leave Granted";
                    }
                    else return "Vacation Leaves Over";
                case Maternity:
                    if(maternityLeaves>0) {
                        setMaternityLeaves(maternityLeaves-1);
                        setTotalLeaves(totalLeaves-1);
                        System.out.println(getMaternityLeaves());
                        System.out.println(getTotalLeaves());
                        return "Maternity Leave Granted";
                    }
                    else return "Maternity Leaves Over";
                default:
                    throw new AssertionError("Invalid Leave Type");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(LeaveTypes.Sick.applyLeaves());
        System.out.println(LeaveTypes.Vacation.applyLeaves());
        System.out.println(LeaveTypes.Maternity.applyLeaves());

    }
}
