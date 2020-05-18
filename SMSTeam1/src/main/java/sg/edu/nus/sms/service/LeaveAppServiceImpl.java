package sg.edu.nus.sms.service;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.sms.model.Faculty;
import sg.edu.nus.sms.model.LeaveApp;
import sg.edu.nus.sms.repo.LeaveAppRepository;

@Service
public class LeaveAppServiceImpl implements LeaveAppService {

	private LeaveAppRepository learepo;
	
	@Autowired
	public void setLearepo(LeaveAppRepository learepo)
	{
		this.learepo=learepo;
		
	}
	
	@Override
	public LeaveApp findByStartDateAndEndDate(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return learepo.findByStartDateAndEndDate(startDate, endDate);
	}

	@Override
	public List<LeaveApp> findAllByFaculty(Faculty fac) {
		// TODO Auto-generated method stub
		return learepo.findAllByFaculty(fac);
	}

	@Override
	public List<LeaveApp> findAllByStatus(String string) {
		// TODO Auto-generated method stub
		return learepo.findAllByStatus(string);
	}

	@Override
	public LeaveApp findById(int id) {
		// TODO Auto-generated method stub
		return learepo.findById(id).get();
	}

	@Override
	public void deleteLeave(LeaveApp leaapp) {
		// TODO Auto-generated method stub
		learepo.delete(leaapp);
	}

	@Override
	public void save(@Valid LeaveApp lea) {
		// TODO Auto-generated method stub
		
		// call the validation function
		// if true, save
		learepo.save(lea);
		
		// if false, throw an error
	}

	@Override
	public List<LeaveApp> findAll() {
		// TODO Auto-generated method stub
		return learepo.findAll();
	}

	
	// a method: validate leave date
	private boolean validateLeaveDate(LeaveApp leaapp) {
		// retrieve any overlapping leave (start date <= newly applied start date and end date >= newly applied start date)
		// if any record found, not ok
		
		// retrieve any overlapping leave (start date <= newly applied end date and end date >= newly applied end date)
		// if any record found, not ok
		
		// finally if all ok then OK
		return true;
	}
}
