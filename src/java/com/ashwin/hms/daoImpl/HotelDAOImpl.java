package com.ashwin.hms.daoImpl;

import com.ashwin.hms.dao.HotelDAO;
import com.ashwin.hms.entity.Hotel;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ashwin
 */
public class HotelDAOImpl implements HotelDAO{

    @Override
    public List<Hotel> getAll() {
        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(new Hotel(1, "Yak And Yeti", "DubarMarga, Kathmandu", "01342114", "info@yakandyeti.com",5,true));
        hotelList.add(new Hotel(2, "Raddison", "Lazimpat, Kathmandu", "01342345", "info@radison.com",5,true));
        hotelList.add(new Hotel(3, "Annapurna Hotel", "SoltiMod, Kathmandu", "01342123", "info@annapurna.com",5,true));
        return hotelList;
    }

    @Override
    public Hotel getByID(int id) {
        for(Hotel h:getAll()){
            if(h.getId()==1){
                return h;
            }
        }
        return null;
    }
    
}
