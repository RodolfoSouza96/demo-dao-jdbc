package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartment {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department findbyId ===");
		Department dep = depDao.findById(5);
		
		System.out.println(dep);
		
		System.out.println();
		System.out.println("=== TEST 2: Department findAll ===");
		List<Department>list = depDao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		/*System.out.println();
		System.out.println("=== TEST 3: Department insert ===");
		Department newDepartment = new Department(null, "Game");
		depDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());*/
		
		System.out.println();
		System.out.println("=== TEST 4: Department update ===");
		dep = depDao.findById(5);
		dep.setName("Music");
		depDao.update(dep);
		System.out.println("Update completed");
		
		System.out.println();
		System.out.println("=== TEST 5: Department delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		depDao.deleteById(id);
		System.out.print("Delete completed");
		
		
		sc.close();
	}
	
}
