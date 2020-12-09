package exp;

import java.util.Scanner;

class DoctoralCandidate implements StudentManager, TeacherManager {
    private String name;
    private String sex;
    private int age;
    double fees;
    private double roll;

    DoctoralCandidate(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

    public void PayFees() {
        while (true) {
            Scanner x = new Scanner(System.in);
            double Fees = x.nextDouble();
            if (Fees - fees > 0) {
                System.out.println("您输入金额有误，请重新缴纳");
            } else if (Fees - fees < 0) {
                System.out.println("您输入金额有误，请重新缴纳");
            } else {
                System.out.println("您已成功缴纳");
                break;
            }
        }
    }



    public double CheckTuition(){
        return fees;
    }

    public double PayRoll(){
        return roll;
    }
    public double QuerySalary() {
        return roll;
    }

    public String toString() {
        return "学生信息为{" + "姓名'" + name + ", 性别'" + sex + ", 年龄" + age + ", 学费(每学期)" + fees + ", 收入(税前每月)" + roll + '}';
    }
}



