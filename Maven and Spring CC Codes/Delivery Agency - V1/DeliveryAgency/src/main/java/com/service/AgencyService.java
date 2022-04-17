package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.model.Order;

//use appropriate annotation to configure AgencyService as a Service
@Service
public class AgencyService {
	ArrayList<Order> list = new ArrayList<Order>();
	
	//search orders and return the ArrayList<Order>
	public ArrayList<Order> searchDeliveryOrders(Order orderBean) {
		ArrayList<Order> foundOrders = new ArrayList<>();
		for(Order order : list) {
			if(order.getDeliveryDate().equals(orderBean.getDeliveryDate()) && order.getDeliveryStatus().equals(orderBean.getDeliveryStatus())) {
				foundOrders.add(order);
			}
		}
		return foundOrders;
	}
	
	public AgencyService() {
		 addOrders();
	}

	public  void addOrders(){		// don't change this code
		list.add(new Order("DF1234233","AJIO trends","#412, Shipitha cascade, Ganapathy, PIN-641001","10/02/2021","pending"));
		list.add(new Order("FGF7788","Amazon india","#12, shardhalotus, Ram Nagar, PIN-641001", "02/02/2021","pending"));
		list.add(new Order("AF5546","Mynthra","#12, Anandha nilayam,Kuniamuthur, PIN-641001","08/02/2021","pending"));
		list.add(new Order("DF5543","Flip cart","#201, Shipitha cascade, Saravanampatti, PIN-641001","10/02/2021","delivered"));
	
		list.add(new Order("DX17788","AJIO trends","#34/45, RV Homes, 5th cross, Anssari street, PIN-600001","01/02/2021","pending"));
		list.add(new Order("RF55346","Amazon india","#212/4, 10th cross, T-nagar, PIN-60008","03/02/2021","delivered"));
		list.add(new Order("DF88994","Mynthra","#556/4, 5th cross, Thambaram, PIN-60010","12/02/2021","pending"));
		list.add(new Order("FT51122","AJIO trends","#556/4,Nila paradise, Thambaram, PIN-60010","03/02/2021","delivered"));
		list.add(new Order("LK44338","Flip cart","#412/4, 10th cross, Velacheri, PIN-60009","03/02/2021","delivered"));
		
		list.add(new Order("JK99008","Amazon india","#45, 12Th main , GM Palya, PIN-560075","03/02/2021","pending"));
		list.add(new Order("MJ99765","Flip cart","#67/2, 3rd cross , Indra nagar, PIN-560077","08/02/2021","delivered"));
		list.add(new Order("NK66754","Mynthra","#302, Sakthi enclave ,1st main , Malleshpalya, PIN-560075","08/02/2021","delivered"));
		                   
		
	}	 	  
}
	 	  	    	    		        	 	
