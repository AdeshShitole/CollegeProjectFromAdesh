package College.example.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import College.example.Entity.Staff;

@Repository
@Component
public class CollegeDao {

	
	//private SessionFactory sf=Config.getConfig();
	@Autowired
	SessionFactory sf;
	
	public List<Staff> getAllStaff() {

		Session session=sf.openSession();
		Criteria criteria=session.createCriteria(Staff.class);
		List<Staff> list=criteria.list();
		return list;
		
	}
	public String updateStaff(int id) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Staff staff=session.load(Staff.class,id);
		staff.setName("Sagar Sir");
		staff.setSalary(35000);
		staff.setQualification("BE");
		staff.setDepartment("IT");
		session.update(staff);
		tr.commit();
		return "Data Updated Successfully....";
	}
	
	public String insertStaff(Staff staff) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		 session.save(staff);
		 tr.commit();
		 return "Data inserted Successfully....";
		
	}
	public String deleteStaff(int id) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Staff staff=session.load(Staff.class,id);
		session.delete(staff);
		tr.commit();
		return "Data deleted Successfully....";
		
	}
	
}
