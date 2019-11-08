package net.qipo.service;

import net.qipo.bean.Teacher;
import net.qipo.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public Teacher getTeacher(Integer id) {
        return teacherDao.getTeacherById(id);
    }
}
