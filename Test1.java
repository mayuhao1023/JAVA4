package exp;

import java.util.Scanner;

public class Test1 {
    static final double z1 = 0.03;
    static final double z2 = 0.1;

    public static void main(String[] arg) {
        DoctoralCandidate[] x = new DoctoralCandidate[2];
        for (int e = 0; e < 2; e++) {
            x[e] = new DoctoralCandidate();
            while (true) {
                try {
                    System.out.println("请输入姓名");
                    Scanner name = new Scanner(System.in);
                    String p =name.nextLine();
                    x[e].setName(p);
                    if (p.matches("[^a-z]"))
                        throw new  Exception();
                    break;
                }
                catch (Exception w){
                    System.out.println("您输入有误");
                }
            }
            System.out.println("请输入性别");
            Scanner sex = new Scanner(System.in);
            x[e].setSex(sex.nextLine());
            while (true) {
                try {
                    System.out.println("请输入年龄");
                    Scanner age = new Scanner(System.in);
                    x[e].setAge(age.nextInt());
                    break;
                } catch (Exception q) {
                    System.out.println("您输入的值有误，请重新输入");
                }
            }
            while (true) {
                try {
                    System.out.println("请输入学费");
                    Scanner fees = new Scanner(System.in);
                    x[e].setFees(fees.nextDouble());
                    break;
                } catch (Exception q) {
                    System.out.println("您输入的值有误，请重新输入");
                }
            }
            System.out.println("请输入工资");
            Scanner roll = new Scanner(System.in);
            x[e].setRoll(roll.nextDouble());
            System.out.println(x[e]);
        }
        for (int j = 0; j < 2; j++) {
            System.out.println("=======================================================================================");
            System.out.println(x[j]);
            a:
            while (true) {
                System.out.println("请输入您所需要的的功能代码，1:查询学费(每学期),2:查询工资(每月),3:个人所得税,4:退出系统");
                Scanner i = new Scanner(System.in);
                int u = i.nextInt();
                switch (u) {
                    case 1:
                        System.out.println("本学期学费为:" + x[j].CheckTuition());
                        break;
                    case 2:
                        System.out.println("每月薪水(税前)为:" + x[j].QuerySalary());
                        if ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())>0 && (9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())<=36000){
                            System.out.println("每月薪水(税后)为:" + ((9 * x[j].QuerySalary() - ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition()) * z1 )) / 9));
                        }
                        else if ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())>36000 && (9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())<144000) {
                            System.out.println("每月薪水(税后)为:" + ((9 * x[j].QuerySalary() - ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition()) * z2 - 2520)) / 9));
                        }
                        break;
                    case 3:
                        if ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())>0 && (9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())<=36000){
                            System.out.println("个人所得税(每年)为:" + ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition()) * z1));
                        }
                        else if ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())>36000 && (9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())<144000) {
                            System.out.println("个人所得税(每年)为:" + ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition()) * z2 - 2520));
                        }
                        break;
                    case 4:
                        break a;
                    default:
                        System.out.println("您输入的代码有误，请重新输入");
                }
            }
        }
        System.out.println("谢谢您的使用，⑧⑧⑥");
    }
}

