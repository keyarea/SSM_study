package net.qipo.controller;

import net.qipo.bean.Teacher;
import net.qipo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @RequestMapping(value = "/getTeacher")
    public String getTeacher(@RequestParam(value = "id",defaultValue = "1") Integer id, ModelMap modelMap) {
        Teacher teacher = teacherService.getTeacher(id);
        modelMap.addAttribute("teacher", teacher);
        return "success";
    }
}
