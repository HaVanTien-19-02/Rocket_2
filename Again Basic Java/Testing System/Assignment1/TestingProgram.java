//
package AgainAssignment1;

import java.util.Date;

/**
 * This class is .
 * 
 * @Description: .
 * @author: HVTien
 * @create_date: 22-04-2020
 * @version: 1.0
 * @modifer: HVTien
 * @modifer_date: 22-04-2020
 */
public class TestingProgram {
	public static void main(String[] args) {
		// logic

		// create department
		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Marketing";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Sales";

		// print
		System.out.println("Thông tin phòng ban 1:");
		System.out.println("id: " + department1.id);
		System.out.println("name: " + department1.name);
		System.out.println("\n");

		System.out.println("Thông tin phòng ban 2:");
		System.out.println("id: " + department2.id);
		System.out.println("name: " + department2.name);
		System.out.println("\n");
		//

		// create position
		Position position1 = new Position();
		position1.id = 1;
		position1.name = "Trưởng phòng";

		Position position2 = new Position();
		position2.id = 1;
		position2.name = "Phó phòng";
		
		//
		System.out.println("Thông tin chức vụ 1:");
		System.out.println("id: " + position1.id);
		System.out.println("name: " + position1.name);
		System.out.println("\n");

		System.out.println("Thông tin chức vụ 2:");
		System.out.println("id: " + position2.id);
		System.out.println("name: " + position2.name);
		System.out.println("\n");

		// create account
		Account account1 = new Account();
		account1.id = 1;
		account1.email = "havantien1902@gmail.com";
		account1.userName = "tienhavan";
		account1.fullName = "Ha Van Tien";
		account1.departmentID = department1;
		account1.positionID = position1;
		account1.createDate = new Date("2020/1/1");

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "buivantien1902@gmail.com";
		account2.userName = "tienbuivan";
		account2.fullName = "Bui Van Tien";
		account2.departmentID = department1;
		account2.positionID = position1;
		account2.createDate = new Date("2020/1/2");
		
		//
		System.out.println("Thông tin account 1:");
		System.out.println("id: " + account1.id);
		System.out.println("email: " + account1.email);
		System.out.println("userName: " + account1.userName);
		System.out.println("fullName: " + account1.fullName);
		System.out.println("departmentID: " + account1.departmentID.id);
		System.out.println("positionID: " + account1.positionID.id);
		System.out.println("createDate: " + account1.createDate);
		System.out.println("\n");

		System.out.println("Thông tin account 2:");
		System.out.println("id: " + account2.id);
		System.out.println("email: " + account2.email);
		System.out.println("userName: " + account2.userName);
		System.out.println("fullName: " + account2.fullName);
		System.out.println("departmentID: " + account2.departmentID.id);
		System.out.println("positionID: " + account2.positionID.id);
		System.out.println("createDate: " + account2.createDate);
		System.out.println("\n");
		
		// create group
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Nhom MKT";
		group1.creatorID = 1;
		group1.createDate = new Date("2020/1/5");
		
		//
		System.out.println("Thông tin group 1:");
		System.out.println("id: " + group1.id);
		System.out.println("name: " + group1.name);
		System.out.println("CreatorID: " + group1.creatorID);
		System.out.println("CreateDate: " + group1.createDate);
		System.out.println("\n");

		// create groupAccount
		GroupAccount ga1 = new GroupAccount();
		ga1.groupID = group1;
		ga1.accountID = account1;
		ga1.joinDate = new Date("2020/2/1");
		
		//
		System.out.println("Thông tin groupAccount:");
		System.out.println("GroupID: " + ga1.groupID.id);
		System.out.println("AccountID: " + ga1.accountID.id);
		System.out.println("JoinDate: " + ga1.joinDate);
		System.out.println("\n");

		// create TypeQuestion
		TypeQuestion tq1 = new TypeQuestion();
		tq1.id = 1;
		tq1.name = "Essay";
		
		//
		System.out.println("Thông tin TypeQuestion:");
		System.out.println("id: " + tq1.id);
		System.out.println("name: " + tq1.name);
		System.out.println("\n");
		
		// create CategoryQuestion
		CategoryQuestion cq1 = new CategoryQuestion();
		cq1.id = 1;
		cq1.name = "Java";
		
		//
		System.out.println("Thông tin CategoryQuestion:");
		System.out.println("id: " + tq1.id);
		System.out.println("id: " + cq1.id);
		System.out.println("name: " + cq1.name);
		System.out.println("\n");

		// create Question
		Question q = new Question();
		q.id = 1;
		q.content = "what is content?";
		q.categoryID = cq1;
		q.typeID = tq1;
		q.creatorID = 1;
		q.createDate = new Date("2020/5/4");
		
		//
		System.out.println("Thông tin Question:");
		System.out.println("id: " + q.id);
		System.out.println("content: " + q.content);
		System.out.println("categoryID: " + q.categoryID.id);
		System.out.println("typeID: " + q.typeID.id);
		System.out.println("creatorID: " + q.creatorID);
		System.out.println("createDate: " + q.createDate);
		System.out.println("\n");


		// create Answer
		Answer a1 = new Answer();
		a1.id = 1;
		a1.content = "It is .....";
		a1.questionID = q;
		a1.isCorrect = false;
		
		//
		System.out.println("Thông tin Answer:");
		System.out.println("id: " + a1.id);
		System.out.println("content: " + a1.content);
		System.out.println("questionID: " + a1.questionID.id);
		System.out.println("isCorrect: " + a1.isCorrect);
		System.out.println("\n");

		// create Exam
		Exam ex1 = new Exam();
		ex1.id = 1;
		ex1.code = "ABC112";
		ex1.title = "Java";
		ex1.categoryID = 1;
		ex1.duration = "90mins";
		ex1.creatorID = 1;
		ex1.createDate = new Date("2020/4/3");
		
		//
		System.out.println("Thông tin Exam:");
		System.out.println("id: " + ex1.id);
		System.out.println("code: " + ex1.code);
		System.out.println("title: " + ex1.title);
		System.out.println("categoryID: " + ex1.categoryID);
		System.out.println("duration: " + ex1.duration);
		System.out.println("creatorID: " + ex1.creatorID);
		System.out.println("createDate: " + ex1.createDate);
		System.out.println("\n");


		// create ExamQuestion
		ExamQuestion eq1 = new ExamQuestion();
		eq1.examID = ex1;
		eq1.questionID = q;
		
		//
		System.out.println("Thông tin ExamQuestion:");
		System.out.println("examID: " + eq1.examID.id);
		System.out.println("questionID: " + eq1.questionID.id);
		System.out.println("\n");


	}
}
