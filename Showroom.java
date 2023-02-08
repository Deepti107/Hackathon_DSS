package model;

import java.util.ArrayList;

    public class Showroom  {
        String Customer_name;
        String Salesman ;
        String available_vehicle;
        String available_vehicle_in_branch;
        String Trading;
        ArrayList<Showroom>showrooms;

        public ArrayList<Showroom> getShowrooms() {
            return showrooms;
        }

        public void setShowrooms(ArrayList<Showroom> showrooms) {
            this.showrooms = showrooms;
        }

        public String getCustomer_name() {
            return Customer_name;
        }

        public void setCustomer_name(String customer_name) {
            Customer_name = customer_name;
        }

        public String getSalesman() {
            return Salesman;
        }

        public void setSalesman(String salesman) {
            Salesman = salesman;
        }

        public String getAvailable_vehicle() {
            return available_vehicle;
        }

        public void setAvailable_vehicle(String available_vehicle) {
            this.available_vehicle = available_vehicle;
        }

        public String getAvailable_vehicle_in_branch() {
            return available_vehicle_in_branch;
        }

        public void setAvailable_vehicle_in_branch(String available_vehicle_in_branch) {
            this.available_vehicle_in_branch = available_vehicle_in_branch;
        }

        public String getTrading() {
            return Trading;
        }

        public void setTrading(String trading) {
            Trading = trading;
        }


        public Showroom(String customer_name, String salesman, String available_vehicle, String available_vehicle_in_branch, String trading, ArrayList<Showroom> showrooms) {
            Customer_name = customer_name;
            Salesman = salesman;
            this.available_vehicle = available_vehicle;
            this.available_vehicle_in_branch = available_vehicle_in_branch;
            Trading = trading;
            this.showrooms = showrooms;
        }
    }


