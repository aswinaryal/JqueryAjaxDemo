<%@page import="com.ashwin.hms.entity.Hotel"%>
<%@page import="com.ashwin.hms.daoImpl.HotelDAOImpl"%>
<%@page import="com.ashwin.hms.dao.HotelDAO"%>
<%
    
HotelDAO hotelDAO = new HotelDAOImpl();
int id= Integer.parseInt(request.getParameter("id"));

 Hotel hotel =hotelDAO.getByID(id); 
 response.setHeader("Content-type","application/json");
    out.print("{\"id\":\""+hotel.getId()+"\",\"name\":\""+hotel.getName()+"\"}");
%>