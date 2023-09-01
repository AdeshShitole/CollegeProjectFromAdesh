package College.example.Service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import College.example.Dao.CollegeDao;
import College.example.Entity.Staff;

@Service
public class CollegeService {

	@Autowired
	CollegeDao cd;
	public List<Staff> getAllStaff() {
		List<Staff> list=cd.getAllStaff();
		return list;
	}
	public String updateStaff(int id) {
		return cd.updateStaff(id);		
	}
	public String insertStaff(Staff staff) {
		return cd.insertStaff(staff);
		
	}
	public String deleteStaff(int id) {
		return cd.deleteStaff(id);
		
	}
	

}
