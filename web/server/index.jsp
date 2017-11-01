<%@page import="com.ashwin.hms.entity.Hotel"%>
<%@page import="com.ashwin.hms.dao.HotelDAO"%>
<%@page import="com.ashwin.hms.daoImpl.HotelDAOImpl"%>

<table class="table">
    <tr>
       
        <th>Name</th>
        <th>Address</th>
        <th>Email</th>
        <th>Contact Number</th>
        <th>Rating</th>
        <th>Status</th>
        <th>Action</th>
    </tr>
    <%
        HotelDAO hotelDAO = new HotelDAOImpl();
        for(Hotel hotel:hotelDAO.getAll()){
        %>
    <tr>
        <td><%=hotel.getName()%></td>
        <td><%=hotel.getAddress()%></td>
        <td><%=hotel.getEmail()%></td>
        <td><%=hotel.getContactNo()%></td>
        <td><%=hotel.getStar()%></td>
        <td><%=hotel.isStatus()%></td>
        <td>
            <a href="javascript:void(0)" class="edit-button btn btn-success" rel="<%=hotel.getId()%>">
                <span class="glyphicon glyphicon-pencil"></span>Edit
            </a> 
        </td>
    </tr>
    <%}%>
</table>
