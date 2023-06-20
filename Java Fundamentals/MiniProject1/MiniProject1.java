public class MiniProject1 {
    public static void main(String[] args) {
        try {
            String[][] table1 = { { "1001", "Ashish", "1/4/2009", "e", "R&D", "20000", "8000", "3000" },
                    { "1002", "Sushma", "23/8/2012", "c", "PM", "3000", "12000", "9000" },
                    { "1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000" },
                    { "1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000" },
                    { "1005", "Ranjan", "16/7/2005", "m", "Engg", "50000", "20000", "20000" },
                    { "1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400" },
                    { "1007", "Tanmay", "12/6/2006", "c", "PM", "29000", "12000", "10000" } };

            String[][] table2 = { { "e", "Engineer", "20000" },
                    { "c", "Consultant", "32000" },
                    { "k", "Clerk", "12000" },
                    { "r", "Receptionist", "15000" },
                    { "m", "Manager", "40000" } };
            String empNo = args[0];
            int col = 0;
            int basic = 0;
            int hra = 0;
            int da = 0;
            int it = 0;
            boolean flag = false;
            String name = "";
            String department = "";
            String designationCode = "";
            int Salary;
            String designation = "";
            for (int i = 0; i < table1.length; i++) {
                if (empNo.equals(table1[i][col])) {
                    flag = true;
                    name = table1[i][++col];
                    designationCode = table1[i][col + 2];
                    department = table1[i][col + 3];
                    basic = Integer.parseInt(table1[i][col + 4]);
                    hra = Integer.parseInt(table1[i][col + 5]);
                    it = Integer.parseInt(table1[i][col + 6]);
                }
            }
            if (flag) {
                switch (designationCode) {
                    case "e":
                        designation = "Engineer";
                        da = Integer.parseInt(table2[0][2]);
                        break;
                    case "c":
                        designation = "Consultant";
                        da = Integer.parseInt(table2[1][2]);
                        break;
                    case "k":
                        designation = "Clerk";
                        da = Integer.parseInt(table2[0][2]);
                        break;
                    case "r":
                        designation = "Receptionist";
                        da = Integer.parseInt(table2[0][3]);
                        break;
                    case "m":
                        designation = "Manager";
                        da = Integer.parseInt(table2[0][4]);
                        break;
                }
                Salary = basic + hra + da - it;
                System.out.println("Emp no" + "   " + "Emp Name" + "   " + "Department" + "   " + "Designation" + "   "    + "Salary");
                System.out.println(empNo + "     " + name + "      " + department + "     " + designation + "    " + Salary);

            } else {
                System.out.println(empNo + "is invalid id ");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
