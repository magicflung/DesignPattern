package rule.demete;

import java.util.ArrayList;
import java.util.List;

/**
 * 解决的方法就是让BranchCompanyManager类去封装它的功能，让类只与它的直接朋友通信，并且对外提供一个方法调用。
 */
public class BTest {
}
class HeadquartersCompanyPeople {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
class BranchCompanyPeople {
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
// 分部管理
class BranchCompanyManager {
    // 录入分部信息，这里就简单使用id
    public List<BranchCompanyPeople> input() {
        List<BranchCompanyPeople> list = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            BranchCompanyPeople people = new BranchCompanyPeople();
            people.setId("分部员工id:" + i);
            list.add(people);
        }
        return list;
    }
    // 新增print方法
    public void print() {
        System.out.println("----------分公司----------");
        List<BranchCompanyPeople> branchCompanyPeople = this.input();
        for(BranchCompanyPeople people : branchCompanyPeople) {
            System.out.println(people.getId());
        }
    }
}
// 总部管理
class HeadquartersCompanyManager {
    // 录入学生信息，这里就简单使用id
    public List<HeadquartersCompanyPeople> input() {
        List<HeadquartersCompanyPeople> list = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            HeadquartersCompanyPeople people = new HeadquartersCompanyPeople();
            people.setId("总部员工id:" + i);
            list.add(people);
        }
        return list;
    }

    // 打印出公司的所有员工（包括分公司）, 传入分公司的对象
    public void printTotal(BranchCompanyManager branchCompanyManager) {
        System.out.println("----------总部----------");
        List<HeadquartersCompanyPeople> headquartersCompanyPeople = this.input();
        for(HeadquartersCompanyPeople people : headquartersCompanyPeople) {
            System.out.println(people.getId());
        }
        // 修改这里
        // 分公司
        branchCompanyManager.print();
    }
}