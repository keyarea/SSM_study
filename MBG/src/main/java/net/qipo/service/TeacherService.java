package net.qipo.service;

import net.qipo.bean.Teacher;
import net.qipo.dao.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    public Teacher selectByPrimaryKey(Integer id) {
        return teacherMapper.selectByPrimaryKey(id);
    }

    public List<Teacher> getAll(){
        return teacherMapper.getTeachers();
    }
}
