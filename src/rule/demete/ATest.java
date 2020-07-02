package rule.demete;

import java.util.ArrayList;
import java.util.List;

/**
 * 这里的代码没问题，但是违背了迪米特法则，因为在HeadquartersCompanyManager的printTotal中，出现了一个非直接关系的类：BranchCompanyPeople
 * 改进的方式就是：让BranchCompanyManager中的input方法返回的类封装起来，
 */
public class ATest {
    public static void main(String[] args) {
        // HeadquartersCompanyManager headquartersCompanyManager = new HeadquartersCompanyManager();
        // BranchCompanyManager branchCompanyManager = new BranchCompanyManager();
        //
        // headquartersCompanyManager.printTotal(branchCompanyManager);
    }
}

// class HeadquartersCompanyPeople {
//     String id;
//
//     public String getId() {
//         return id;
//     }
//
//     public void setId(String id) {
//         this.id = id;
//     }
// }
// class BranchCompanyPeople {
//     String id;
//
//     public String getId() {
//         return id;
//     }
//
//     public void setId(String id) {
//         this.id = id;
//     }
// }
// // 分部管理
// class BranchCompanyManager {
//     // 录入分部信息，这里就简单使用id
//     public List<BranchCompanyPeople> input() {
//         List<BranchCompanyPeople> list = new ArrayList<>();
//         for(int i = 1; i <= 5; i++) {
//             BranchCompanyPeople people = new BranchCompanyPeople();
//             people.setId("分部员工id:" + i);
//             list.add(people);
//         }
//         return list;
//     }
// }
// // 总部管理
// class HeadquartersCompanyManager {
//     // 录入学生信息，这里就简单使用id
//     public List<HeadquartersCompanyPeople> input() {
//         List<HeadquartersCompanyPeople> list = new ArrayList<>();
//         for(int i = 1; i <= 10; i++) {
//             HeadquartersCompanyPeople people = new HeadquartersCompanyPeople();
//             people.setId("总部员工id:" + i);
//             list.add(people);
//         }
//         return list;
//     }
//
//     // 打印出公司的所有员工（包括分公司）, 传入分公司的对象
//     public void printTotal(BranchCompanyManager branchCompanyManager) {
//         System.out.println("----------总部----------");
//         List<HeadquartersCompanyPeople> headquartersCompanyPeople = this.input();
//         for(HeadquartersCompanyPeople people : headquartersCompanyPeople) {
//             System.out.println(people.getId());
//         }
//         // 分公司
//         System.out.println("----------分公司----------");
//         List<BranchCompanyPeople> branchCompanyPeople = branchCompanyManager.input();
//         for(BranchCompanyPeople people : branchCompanyPeople) {
//             System.out.println(people.getId());
//         }
//
//     }
// }

