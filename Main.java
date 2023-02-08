import model.Head_Branch;
import model.Repair;
import model.Showroom;

import java.util.ArrayList;
        public class Main {
            public static void main(String[] args) {
                Head_Branch h1 = new Head_Branch("N Traders","Kathmadu",10);
                Head_Branch h2 = new Head_Branch("DSS Traders","Pokhara",15);
                Head_Branch h3 = new Head_Branch("Tri Trader","Butwal",18);
                ArrayList<Head_Branch> Head_BranchArrayList1 = new ArrayList<>();
                ArrayList<Head_Branch> Head_BranchArrayList2 = new ArrayList<>();
                Head_BranchArrayList1.add(h1);
                Head_BranchArrayList2.add(h2);
                Repair C1= new Repair("Deepti Neupane","Chotu","11:00AM","Bumper Replacement", 10000,"Done",true);
                Repair C2= new Repair("Suprabha Thami","Bade","12:30PM","Wheel Alignment", 7000,"Processing",false);
                Repair C3= new Repair("Saphal Sapkota","Ram","1:00PM","Dent Fixing", 3000,"Quee",true);
                ArrayList<Repair> RepairArrayList3= new ArrayList<>();
                ArrayList<Repair> RepairArrayList4= new ArrayList<>();
                ArrayList<Repair> RepairArrayList5= new ArrayList<>();
                RepairArrayList3.add(C1);
                RepairArrayList4.add(C2);
                Showroom S1= new Showroom("Danny ","Sammy","yes","Kathmandu","no","");
                Showroom S2 = new Showroom("Scarlet","Som", "No","No","Yes","");
                Showroom S3 = new Showroom("Harry","Jay","yes","Butwal","no","");
                ArrayList<Showroom> showroomsArrayList6 = new ArrayList<>();
                ArrayList<Showroom> showroomsArrayList7 = new ArrayList<>();
                showroomsArrayList6.add(S1);
                showroomsArrayList7.add(S2);

                for (Repair repairs:RepairArrayList3) {
                    System.out.println("Name : "+repairs.getName());
                    System.out.println("Mechanics : "+repairs.getMechanic());
                    System.out.println("Appointment Time: "+repairs.getAppointment_Time());
                    System.out.println("To Do: "+repairs.getTo_Do());
                    System.out.println("Estimated Time: "+repairs.getEstimated_Budget());
                    System.out.println("Remarks : "+repairs.getRemark());
                    System.out.println("Insurance: "+repairs.getInsurance());
                    System.out.println("--------------------------------------------");

                }

                for (Repair repairs:RepairArrayList4) {
                    System.out.println("Name : "+repairs.getName());
                    System.out.println("Mechanics : "+repairs.getMechanic());
                    System.out.println("Appointment Time: "+repairs.getAppointment_Time());
                    System.out.println("To Do: "+repairs.getTo_Do());
                    System.out.println("Estimated Time: "+repairs.getEstimated_Budget());
                    System.out.println("Remarks : "+repairs.getRemark());
                    System.out.println("Insurance: "+repairs.getInsurance());
                    System.out.println("--------------------------------------------");

                }

                for (Repair repairs:RepairArrayList5) {
                    System.out.println("Name : "+repairs.getName());
                    System.out.println("Mechanics : "+repairs.getMechanic());
                    System.out.println("Appointment Time: "+repairs.getAppointment_Time());
                    System.out.println("To Do: "+repairs.getTo_Do());
                    System.out.println("Estimated Time: "+repairs.getEstimated_Budget());
                    System.out.println("Remarks : "+repairs.getRemark());
                    System.out.println("Insurance: "+repairs.getInsurance());
                    System.out.println("--------------------------------------------");

                }

                for (Showroom showroom:showroomsArrayList6) {
                    System.out.println("Available Vehicle in Branch :"+showroom.getAvailable_vehicle_in_branch());
                    System.out.println("Available Vehicle: "+showroom.getAvailable_vehicle());
                    System.out.println("Trading :"+showroom.getTrading());
                    System.out.println("--------------------------------------------");

                }

                for (Showroom showroom:showroomsArrayList7) {
                    System.out.println("Available Vehicle in Branch :"+showroom.getAvailable_vehicle_in_branch());
                    System.out.println("Available Vehicle: "+showroom.getAvailable_vehicle());
                    System.out.println("Trading :"+showroom.getTrading());
                    System.out.println("--------------------------------------------");

                }

                for (Head_Branch head_branch:Head_BranchArrayList1) {
                    System.out.println("Name :"+head_branch.getName());
                    System.out.println("Location :"+head_branch.getLocation());
                    System.out.println("Branch Number :"+head_branch.getBranch_number());
                    System.out.println("--------------------------------------------");
                }

                for (Head_Branch head_branch:Head_BranchArrayList2) {
                    System.out.println("Name :"+head_branch.getName());
                    System.out.println("Location :"+head_branch.getLocation());
                    System.out.println("Branch Number :"+head_branch.getBranch_number());
                    System.out.println("--------------------------------------------");
                }
            }
        }

