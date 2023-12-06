package com.danko.Controllers;

import com.danko.dao.RoomsDAO;
import com.danko.dao.UserDAO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/admin/rooms")
public class AdminRoomsController {

    @Resource
    private RoomsDAO roomsDAO;

    @GetMapping
    public String doGet(HttpServletRequest request) {

        request.setAttribute("rooms", roomsDAO.findAllRooms());
        return "admin_rooms";
    }

    @PostMapping
    public String doPost() {
        return "";
    }
}
