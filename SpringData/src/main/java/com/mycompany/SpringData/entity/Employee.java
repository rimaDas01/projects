package com.mycompany.SpringData.entity;

import java.time.LocalDate;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




    @Entity
    @Table(name="employees")
    public class Employee {



       @Id
        @Column(name="eid")
        private Integer eid;
        @Column(name="ename")
        private String ename;
        @Column(name="esalary")
        private Double esalary;
        @Column(name="edesignation")
        private String edesignation;
        @Column(name="doj")
        private LocalDate doj;
        
        public Employee(){}
        public Employee( Integer eid,String ename,Double esalary,String edesignation,LocalDate doj){
            this.eid=eid;
            this.ename=ename;
            this.esalary=esalary;
            this.edesignation=edesignation;        
            this.doj=doj;
        }
        public Integer getId() {
            return eid;
        }
        public void setId(Integer eid) {
            this.eid = eid;
        }
        public String getName() {
            return ename;
        }
        public void setName(String ename) {
            this.ename = ename;
        }
        public Double getSalary() {
            return esalary;
        }
        public void setSalary(Double esalary) {
            this.esalary = esalary;
        }
        public String getDesignation() {
            return edesignation;
        }
        public void setDesignation(String edesignation) {
            this.edesignation = edesignation;
        }    
        public LocalDate getDoj() {
            return doj;
        }
        public void setDoj(LocalDate doj) {
            this.doj = doj;
        }
        @Override
        public String toString() {
            return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", edesignation=" + edesignation
                    + ", doj=" + doj + "]";
        }
        
    }