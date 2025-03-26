package Generics;

public class EnumTypes {
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
    enum LeaveTypes{
        Sick, Vacation, Maternity;

        public <T extends String> void applyLeaves() {
            EnumTypes et = new EnumTypes();
            switch (this){
                case Sick:
//                    System.out.println( sickLeaves<=12? "Sick Leave Granted" : " Sick Leaves Over";
                    if(et.sickLeaves>0) {
                        et.setSickLeaves(et.sickLeaves-1);
                        et.setTotalLeaves(et.totalLeaves-1);
                        System.out.println(et.getTotalLeaves());
                        System.out.println("Sick Leave Granted\nTotal Sick Leaves:- "+et.getSickLeaves());
                    }
                    else System.out.println( "Sick Leaves Over");
                    break;
                case Vacation:
                    if(et.vacationLeaves>0) {
                        et.setVacationLeaves(et.vacationLeaves-1);
                        et.setTotalLeaves(et.totalLeaves-1);
                        System.out.println(et.getTotalLeaves());
                        System.out.println( "Vacation Leave Granted\nTotal Vacation Leaves:- "+et.getVacationLeaves());
                    }
                    else System.out.println( "Vacation Leaves Over");
                    break;
                case Maternity:
                    if(et.maternityLeaves>0) {
                        et.setMaternityLeaves(et.maternityLeaves-1);
                        et.setTotalLeaves(et.totalLeaves-1);
                        System.out.println(et.getTotalLeaves());
                        System.out.println( "Maternity Leave Granted\nTotal Maternity Leaves:- "+et.getMaternityLeaves());
                    }
                    else System.out.println( "Maternity Leaves Over");
                    break;
                default:
                    throw new AssertionError("Invalid Leave Type");
            }
        }
    }
    public static void main(String[] args) {
        LeaveTypes.Sick.applyLeaves();
        LeaveTypes.Vacation.applyLeaves();
        LeaveTypes.Maternity.applyLeaves();
        LeaveTypes.Sick.applyLeaves();
        LeaveTypes.Vacation.applyLeaves();

    }
}
