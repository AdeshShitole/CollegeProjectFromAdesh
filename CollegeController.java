package College.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import College.example.Entity.Staff;
import College.example.Service.CollegeService;

@RestController
public class CollegeController {

	@Autowired
	CollegeService cs;
	
	@GetMapping("getAllData")
	public List<Staff> getAllStaff() {
		return cs.getAllStaff();
	}
	
	@PutMapping("dataUpdate/{id}")
	public String updateStaff(@PathVariable int id) {
		return cs.updateStaff(id);
	}
	
	@PostMapping("dataInsert")
	public String insertStaff(@RequestBody Staff staff) {
		return cs.insertStaff(staff);
	}
	
	@DeleteMapping("deleteData/{id}")
	public String deleteStaff(@PathVariable int id) {
		return cs.deleteStaff(id);
	}
		
	
}
