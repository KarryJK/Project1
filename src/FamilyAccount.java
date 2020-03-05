public class FamilyAccount {
    public static int balance = 10000;//基本金
    public static int income;//收入
    public static int outcome;//支出
    public static String detail_in;//收入说明
    public static String detail_out;//支出说明
    public static String details="";

    public static void showMainMenu(){
        System.out.println();
        for (int i = 0; i < 33; i++) {
            if (i != 15)
                System.out.print('-');
            else
                System.out.print("家庭收支记账软件");
        }
        System.out.println('\n');
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 17; j++) {
                System.out.print(" ");
            }
            if (i == 0)
                System.out.println("1 收支明细");
            else if (i == 1)
                System.out.println("2 登记收入");
            else if (i == 2)
                System.out.println("3 登记支出");
            else if (i == 3)
                System.out.println("4 退出");
            else if (i == 4)
                System.out.println();
            else
                System.out.print("请选择(1-4):");
        }
    }

    public static void showDetails(){
        System.out.println();
        for (int i = 0; i < 33; i++) {
            if (i != 15)
                System.out.print('-');
            else
                System.out.print("当前收支明细记录");
        }
        System.out.println();
        System.out.println("收支\t账户金额\t\t收支金额\t\t说  明");
        System.out.println(details);
        System.out.println();
        System.out.print("\t\t\t请选择(1-4):");
    }

    public static void registerIncome(){
        System.out.print("本次收入金额：");
        Utility t = new Utility();
        income = t.readNumber();
        System.out.print("本次收入说明：");
        detail_in = t.readString();
        details = details+"收入\t"+(balance+income)+'\t'+'\t'+income+'\t'+'\t'+'\t'+detail_in+'\n';
        System.out.println();
        System.out.print("\t\t\t请选择(1-4):");
    }

    public static void registerOutcome(){
        System.out.print("本次支出金额：");
        Utility t = new Utility();
        outcome = t.readNumber();
        System.out.print("本次支出说明：");
        detail_out = t.readString();
        details = details+"支出\t"+(balance-outcome)+'\t'+'\t'+outcome+'\t'+'\t'+'\t'+detail_out+'\n';
        System.out.println();
        System.out.print("\t\t\t请选择(1-4):");
    }

    public static void exitProgram(){
        System.out.println();
        System.out.print("\t\t确认是否退出(Y/N):");
        Utility t = new Utility();
        char confirm = t.readConfirmSelection();
        if(confirm=='Y'){
            System.out.println("感谢使用本软件！");
            System.exit(0);}
        if(confirm=='N')
            showMainMenu();
    }

    public static void main(String[] args) {
        showMainMenu();
        Utility t = new Utility();
        while(true){
            char choice = t.readMenuSelection();
            if(choice=='1')
                showDetails();
            if(choice=='2')
                registerIncome();
            if(choice=='3')
                registerOutcome();
            if(choice=='4')
                exitProgram();
        }

    }
}
