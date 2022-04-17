package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.model.Home;

//use appropriate annotation to configure BrokerService as a Service
@Service
public class BrokerService {

	ArrayList<Home> list = new ArrayList<Home>();

	// search homes/apartments from the list and return it as a ArrayList
	public ArrayList<Home> searchHome(Home homeBean) {
		ArrayList<Home> resultList = new ArrayList<Home>();
		for (Home home : list) {
			if (home.getLocation().equalsIgnoreCase(homeBean.getLocation())
					&& home.getBhkType().equalsIgnoreCase(homeBean.getBhkType())
					&& home.getRent() == homeBean.getRent()) {
				resultList.add(home);
			}
		}
		return resultList;

	}

	public BrokerService() {
		addHomes();
	}

	// Dont modify this code
	public ArrayList<Home> addHomes() {
		list.add(new Home("Coimbatore", "#412, Shipitha cascade, Ganapathy, PIN-641001", "9917678456", "1BHK",
				"Malavika", 8000));
		list.add(new Home("Coimbatore", "#12, shardhalotus, Ram Nagar, PIN-641001", "9917100989", "2BHK", "Karthik",
				12000));
		list.add(new Home("Coimbatore", "#12, Anandha nilayam,Kuniamuthur, PIN-641001", "9917100989", "2BHK", "Karthik",
				12000));
		list.add(new Home("Coimbatore", "#201, Shipitha cascade, Saravanampatti, PIN-641001", "9917123456", "3BHK",
				"Sowparnika", 17000));

		list.add(new Home("Chennai", "#34/45, RV Homes, 5th cross, Anssari street, PIN-600001", "7788900989", "1BHK",
				"Mukunthan", 6000));
		list.add(new Home("Chennai", "#212/4, 10th cross, T-nagar, PIN-60008", "9917100989", "2BHK", "Annesh", 14000));
		list.add(new Home("Chennai", "#556/4, 5th cross, Thambaram, PIN-60010", "9917100989", "2BHK", "Jisha", 14000));
		list.add(new Home("Chennai", "#556/4,Nila paradise, Thambaram, PIN-60010", "9917100989", "2BHK", "Jisha",
				14000));
		list.add(
				new Home("Chennai", "#412/4, 10th cross, Velacheri, PIN-60009", "9917156989", "3BHK", "Rakesh", 18000));

		list.add(
				new Home("Bangalore", "#45, 12Th main , GM Palya, PIN-560075", "9917122119", "1BHK", "Senthil", 11000));
		list.add(new Home("Bangalore", "#67/2, 3rd cross , Indra nagar, PIN-560077", "9944550989", "2BHK", "RamKumar",
				17000));
		list.add(new Home("Bangalore", "#302, Sakthi enclave ,1st main , Malleshpalya, PIN-560075", "9917668889",
				"3BHK", "Saradha", 25000));
		return list;

	}
}
