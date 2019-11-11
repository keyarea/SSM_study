package net.qipo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.qipo.bean.Teacher;
import net.qipo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @RequestMapping("/getTeacher")
    public String getTeacher(@RequestParam(value = "id", required = false) Integer id, ModelMap modelMap){
        Teacher teacher = teacherService.selectByPrimaryKey(id);
        modelMap.addAttribute("teacher", teacher);
        return "success";
    }

    @RequestMapping("/getAll")
    public String getAll(@RequestParam(value = "pn", defaultValue="1")Integer pn, ModelMap modelMap) {
        // 紧跟他的查询就是分页查询
        PageHelper.startPage(pn, 5);
        List<Teacher> teachers = teacherService.getAll();

        // 我们可以将查询的结果使用, 将查询结果放在PageINfo中，这个pageInfo就有非常多能用的东西
        PageInfo<Teacher> Info = new PageInfo<>(teachers, 6);
        int[] nums = Info.getNavigatepageNums();

        modelMap.addAttribute("info", Info);
        return "teachers";
    }
}
